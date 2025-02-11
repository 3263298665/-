package com.chen.cloudshadow.service.impl;

import com.chen.cloudshadow.pojo.UserInfo;
import com.chen.cloudshadow.mapper.UserInfoMapper;
import com.chen.cloudshadow.service.IUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author wangchen
 * @since 2025-02-11
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

}
