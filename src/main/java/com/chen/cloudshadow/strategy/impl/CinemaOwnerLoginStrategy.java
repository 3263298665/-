package com.chen.cloudshadow.strategy.impl;/**
 * @author 32632
 * @date Created in 2025/3/3 9:50
 * @modified By  32632 in 2025/3/3 9:50
 * @description AddDescriptionHere
 */

import com.chen.cloudshadow.strategy.BaseLoginStrategy;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @description: 商家登录策略
 * @author 32632
 * @date 2025/3/3 9:50
 */
@Component
public class CinemaOwnerLoginStrategy extends BaseLoginStrategy {

    public CinemaOwnerLoginStrategy(RedisTemplate redisTemplate) {
        super(redisTemplate);
    }
}
