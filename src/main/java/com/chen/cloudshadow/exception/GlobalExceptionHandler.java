package com.chen.cloudshadow.exception;

import com.chen.cloudshadow.utils.ResponseCode;
import com.chen.cloudshadow.utils.ResponseResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ResponseResult<Void>> handleCustomException(CustomException ex) {
        return new ResponseEntity<>(ResponseResult.error(ex.getCode(), ex.getMessage()), HttpStatus.valueOf(ex.getCode()));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ResponseResult<Void>> handleException(Exception ex) {
        return new ResponseEntity<>(ResponseResult.error(ResponseCode.INTERNAL_SERVER_ERROR.getCode(), ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(io.jsonwebtoken.ExpiredJwtException.class)
    public ResponseEntity<ResponseResult<Void>> handleExpiredJwtException(io.jsonwebtoken.ExpiredJwtException ex) {
        return new ResponseEntity<>(ResponseResult.error(ResponseCode.UNAUTHORIZED.getCode(), "Token has expired"), HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(io.jsonwebtoken.MalformedJwtException.class)
    public ResponseEntity<ResponseResult<Void>> handleMalformedJwtException(io.jsonwebtoken.MalformedJwtException ex) {
        return new ResponseEntity<>(ResponseResult.error(ResponseCode.UNAUTHORIZED.getCode(), "Invalid token"), HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(io.jsonwebtoken.SignatureException.class)
    public ResponseEntity<ResponseResult<Void>> handleSignatureException(io.jsonwebtoken.SignatureException ex) {
        return new ResponseEntity<>(ResponseResult.error(ResponseCode.UNAUTHORIZED.getCode(), "Invalid token signature"), HttpStatus.UNAUTHORIZED);
    }
}