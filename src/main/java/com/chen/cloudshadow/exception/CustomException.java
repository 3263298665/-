package com.chen.cloudshadow.exception;

/**
 * @author 32632
 * @date Created in 2025/2/10 18:41
 * @modified By  32632 in 2025/2/10 18:41
 * @description 自定义异常类
 */
public class CustomException extends RuntimeException {
    private Integer code;

    public CustomException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}