package com.chen.cloudshadow.context;/**
 * @author 32632
 * @date Created in 2025/3/3 9:53
 * @modified By  32632 in 2025/3/3 9:53
 * @description AddDescriptionHere
 */

import com.chen.cloudshadow.strategy.LoginStrategy;
import com.chen.cloudshadow.vo.UserVo;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @description: 登录上下文
 * @author 32632
 * @date 2025/3/3 9:53
 */
@Component
public class LoginContext {

    private final Map<String, LoginStrategy> strategies;

    public LoginContext(Map<String, LoginStrategy> strategies) {
        this.strategies = strategies;
    }

    public UserVo executeLogin(String username, String password, String captcha, String role) {
        LoginStrategy strategy = strategies.get(role);
        if (strategy == null){
            throw new IllegalArgumentException("不支持该登录方式");
        }
        return strategy.login(username, password, captcha, role);
    }
}
