package com.chen.cloudshadow.service.impl;

import com.chen.cloudshadow.pojo.Users;
import com.chen.cloudshadow.mapper.UsersMapper;
import com.chen.cloudshadow.service.IUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author wangchen
 * @since 2025-03-01
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

}
