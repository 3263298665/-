package com.chen.cloudshadow.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chen.cloudshadow.exception.CustomException;
import com.chen.cloudshadow.mapper.RolesMapper;
import com.chen.cloudshadow.pojo.Roles;
import com.chen.cloudshadow.service.IRolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * <p>
 * 角色权限表 服务实现类
 * </p>
 *
 * @author wangchen
 * @since 2025-03-01
 */
@Service
public class RolesServiceImpl extends ServiceImpl<RolesMapper, Roles> implements IRolesService {

    @Autowired
    private RolesMapper rolesMapper;

    //注入redis模板
    @Autowired
    private RedisTemplate redisTemplate;

    //初始化角色信息
    @PostConstruct
    public void initRoles() {
        //获取角色列表
        List<Roles> roles = rolesMapper.selectList(null);
        for (int i = 0; i < roles.size(); i++) {
            //将角色信息存入redis
            redisTemplate.opsForList().leftPush("roles" , roles.get(i).getRoleName());
        }

        System.out.println("初始化角色信息成功");
    }

    // 从 Redis 获取角色信息
    public List<String> getRoles() {
        //通过roleName获取缓存中角色信息
        List roles = redisTemplate.opsForList().range("roles", 0, -1);
        if (roles.size()==0){    //缓存中没有角色信息
            throw new CustomException(400, "角色不存在");
        }
        //判断角色是否
        return roles;
    }
}
