package com.chen.cloudshadow.service.impl;

import com.chen.cloudshadow.pojo.AdminInfo;
import com.chen.cloudshadow.mapper.AdminInfoMapper;
import com.chen.cloudshadow.service.IAdminInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chen.cloudshadow.utils.CaptchaUtil;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * 管理员信息表 服务实现类
 * </p>
 *
 * @author wangchen
 * @since 2025-02-10
 */
@Service
public class AdminInfoServiceImpl extends ServiceImpl<AdminInfoMapper, AdminInfo> implements IAdminInfoService {

    @Override
    public String getCaptcha(HttpServletRequest request) {
        String captcha = CaptchaUtil.generateCaptcha(request);
        return captcha;
    }
}
