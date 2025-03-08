package com.chen.cloudshadow.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chen.cloudshadow.context.LoginContext;
import com.chen.cloudshadow.dto.CaptchaDto;
import com.chen.cloudshadow.exception.CustomException;
import com.chen.cloudshadow.mapper.UserMapper;
import com.chen.cloudshadow.pojo.User;
import com.chen.cloudshadow.service.IRolesService;
import com.chen.cloudshadow.service.IUserService;
import com.chen.cloudshadow.strategy.LoginStrategy;
import com.chen.cloudshadow.strategy.impl.AdminLoginStrategy;
import com.chen.cloudshadow.strategy.impl.CinemaOwnerLoginStrategy;
import com.chen.cloudshadow.strategy.impl.UserLoginStrategy;
import com.chen.cloudshadow.utils.CaptchaUtil;
import com.chen.cloudshadow.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author wangchen
 * @since 2025-03-01
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    //注入UserMapper
    @Autowired
    private UserMapper userMapper;

    //注入角色服务
    @Autowired
    private IRolesService rolesService;

    private LoginContext loginContext;

    //注入redis模板
    @Autowired
    private RedisTemplate redisTemplate;

    @PostConstruct
    public void getLoginContext() {
        //初始化策略
        Map<String, LoginStrategy> strategies = new HashMap<>();
        rolesService.getRoles().forEach(role -> {
            //创建普通用户登录策略
            if ("user".equals(role)){
                strategies.put("user", new UserLoginStrategy(redisTemplate));
            }
            //创建管理员登录策略
            if ("admin".equals(role)){
                strategies.put("admin", new AdminLoginStrategy(redisTemplate));
            }
            //创建影院管理员登录策略
            if ("cinema_owner".equals(role)){
                strategies.put("cinema_owner", new CinemaOwnerLoginStrategy(redisTemplate));
            }
        });
        this.loginContext = new LoginContext(strategies);
    }

    //处理登录逻辑
    @Override
    public UserVo login(String username, String password, String captcha, String role) {


        if (role != null && !role.equals("")) {
            //查询用户
            User user = userMapper.queryByUsername(username);
            //获取redis中的角色列表
            List<String> roles = rolesService.getRoles();
            for (String role1 : roles) {         //遍历角色列表
                UserVo userVo = loginContext.executeLogin(username, password, captcha, role1);
                if (userVo!=null){    //判断是否执行相应登录策略
                    //调用相应角色的登录逻辑
                    return userVo;
                }
            }
            throw new CustomException(400, "角色不存在");
        }
        throw new CustomException(400, "登录失败");
    }

    //生成验证码
    @Override
    public String createCaptcha(String username) {

        if (username == null || username.equals("")) {
            throw new CustomException(400, "用户名不能为空");
        }
        try {
            //生成验证码
            Map<String, Object> stringObjectMap = CaptchaUtil.generateCaptcha(username);
            CaptchaDto captchaDto = (CaptchaDto)stringObjectMap.get(username);
            //将验证码存入redis
            redisTemplate.opsForValue().set(username+":captcha", captchaDto.getCaptcha(), 60, TimeUnit.SECONDS);
            //将验证码返回给前端
            return captchaDto.getCaptchaImage();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //返回错误
        throw new CustomException(500, "验证码生成失败");
    }
}
