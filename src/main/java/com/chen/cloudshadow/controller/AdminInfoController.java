package com.chen.cloudshadow.controller;


import com.chen.cloudshadow.service.IAdminInfoService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * 管理员信息表 前端控制器
 * </p>
 *
 * @author wangchen
 * @since 2025-02-10
 */
@RestController
@RequestMapping("/admin")
public class AdminInfoController {

    private final IAdminInfoService adminInfoService;

    public AdminInfoController(IAdminInfoService adminInfoService) {
        this.adminInfoService = adminInfoService;
    }

    @GetMapping("/captcha")
    public String getCaptcha(HttpServletRequest  request){
        System.out.println("获取验证码");
        String captcha = adminInfoService.getCaptcha(request);
        System.out.println(request.getSession().getAttribute("captcha"));
        return captcha;
    }
}
