package com.chen.cloudshadow.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chen.cloudshadow.pojo.User;

import java.util.List;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author wangchen
 * @since 2025-03-01
 */
public interface UserMapper extends BaseMapper<User> {

    /*查询用户列表*/
    List<User> query();

    /*根据id查询用户*/
    User queryById(Integer id);

    /*根据用户名查询用户信息*/
    User queryByUsername(String username);

    /*插入新用户*/
    int addUser(User user);

    /*更新用户信息*/
    int updateUser(User user);
}
