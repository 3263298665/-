package com.chen.cloudshadow.strategy;/**
 * @author 32632
 * @date Created in 2025/3/3 10:57
 * @modified By  32632 in 2025/3/3 10:57
 * @description AddDescriptionHere
 */

import com.chen.cloudshadow.exception.CustomException;
import com.chen.cloudshadow.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @description: 实现统一登录逻辑的基类
 * @author 32632
 * @date 2025/3/3 10:57
 */
public abstract class BaseLoginStrategy implements LoginStrategy{

    protected RedisTemplate redisTemplate;

    @Autowired
    public BaseLoginStrategy(RedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }
    @Override
    public UserVo login(String username, String password, String captcha, String role) {
        //统一的校验逻辑
        check(username, password, captcha, role);
        return new UserVo(1L, role, "admin@qq.com", "123456789", "2025-03-03 10:57:00", "admin");
    }
    //校验逻辑
    public void check(String username, String password, String captcha, String role){
        if (username == null || username.equals("")){
            throw new CustomException(400, "用户名不能为空");
        }
        if (password == null || password.equals("")){
            throw new CustomException(400, "用户名或密码不能为空");
        }
        //验证码校验
        if (captcha != null && !captcha.equals("")){
            if (!captcha.equals(redisTemplate.opsForValue().get(username+":captcha"))){
                throw new CustomException(400, "验证码错误");
            }
        }else {
            throw new CustomException(400, "验证码不能为空");
        }
    }
}
