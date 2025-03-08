package com.chen.cloudshadow.controller;


import com.chen.cloudshadow.dto.UserLoginDto;
import com.chen.cloudshadow.service.IUserService;
import com.chen.cloudshadow.utils.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author wangchen
 * @since 2025-03-01
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @PostMapping("/login")
    public ResponseResult login(@RequestBody UserLoginDto userLoginDto) {
        return ResponseResult.success(userService.login(userLoginDto.getUsername(),userLoginDto.getPassword(),userLoginDto.getCaptcha(),userLoginDto.getRole()));
    }

    @GetMapping("/captcha")
    public ResponseResult captcha(String username) {
        return ResponseResult.success(userService.createCaptcha(username));
    }
}
