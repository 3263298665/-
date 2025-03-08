package com.chen.cloudshadow.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chen.cloudshadow.pojo.User;
import com.chen.cloudshadow.vo.UserVo;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author wangchen
 * @since 2025-03-01
 */
public interface IUserService extends IService<User> {

    /*用户登录*/
    UserVo login(String username, String password, String captcha, String role);

    /*生成验证码*/
    String createCaptcha(String username);
}
