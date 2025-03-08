package com.chen.cloudshadow.strategy.impl;/**
 * @author 32632
 * @date Created in 2025/3/3 9:48
 * @modified By  32632 in 2025/3/3 9:48
 * @description AddDescriptionHere
 */

import com.chen.cloudshadow.strategy.BaseLoginStrategy;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @description: 管理员登录策略
 * @author 32632
 * @date 2025/3/3 9:48
 */
@Component
public class AdminLoginStrategy extends BaseLoginStrategy {

    public AdminLoginStrategy(RedisTemplate redisTemplate) {
        super(redisTemplate);
    }
}
