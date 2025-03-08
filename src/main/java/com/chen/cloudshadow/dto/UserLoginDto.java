package com.chen.cloudshadow.dto;/**
 * @author 32632
 * @date Created in 2025/3/3 10:43
 * @modified By  32632 in 2025/3/3 10:43
 * @description AddDescriptionHere
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 用户登录信息
 * @author 32632
 * @date 2025/3/3 10:43
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserLoginDto {

    private String username;
    private String password;
    private String captcha;
    private String role;
}
