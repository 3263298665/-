package com.chen.cloudshadow.utils;/**
 * @author 32632
 * @date Created in 2025/2/10 18:48
 * @modified By  32632 in 2025/2/10 18:48
 * @description AddDescriptionHere
 */

/**
 * @description: TODO
 * @author 32632
 * @date 2025/2/10 18:48
 */
import org.apache.commons.codec.digest.DigestUtils;

public class Md5Util {
    public static String md5(String input) {
        return DigestUtils.md5Hex(input);
    }

}
