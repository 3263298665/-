package com.chen.cloudshadow.dto;/**
 * @author 32632
 * @date Created in 2025/3/2 14:10
 * @modified By  32632 in 2025/3/2 14:10
 * @description AddDescriptionHere
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: TODO
 * @author 32632
 * @date 2025/3/2 14:10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CaptchaDto {

    private String captcha;
    private String captchaImage;
}
