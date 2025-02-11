package com.chen.cloudshadow.service;

import com.chen.cloudshadow.pojo.AdminInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * 管理员信息表 服务类
 * </p>
 *
 * @author wangchen
 * @since 2025-02-10
 */
public interface IAdminInfoService extends IService<AdminInfo> {

    String getCaptcha(HttpServletRequest request);
}
