package com.chen.cloudshadow.strategy;

import com.chen.cloudshadow.vo.UserVo;

/**
 * @author 32632
 * @date Created in 2025/3/3 9:45
 * @modified By  32632 in 2025/3/3 9:45
 * @description 登录策略
 */
public interface LoginStrategy {

    UserVo login(String username, String password, String captcha, String role);
}
