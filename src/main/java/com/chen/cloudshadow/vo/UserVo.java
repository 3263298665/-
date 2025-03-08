package com.chen.cloudshadow.vo;/**
 * @author 32632
 * @date Created in 2025/3/2 10:24
 * @modified By  32632 in 2025/3/2 10:24
 * @description AddDescriptionHere
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: TODO
 * @author 32632
 * @date 2025/3/2 10:24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserVo {

    // 用户ID
    private Long id;

    // 用户名
    private String username;

    // 用户邮箱
    private String email;

    // 用户手机号
    private String phone;

    // 用户创建时间
    private String createTime;

    //角色
    private String role;


}
