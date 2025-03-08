package com.chen.cloudshadow.service;

import com.chen.cloudshadow.pojo.Roles;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 角色权限表 服务类
 * </p>
 *
 * @author wangchen
 * @since 2025-03-01
 */
public interface IRolesService extends IService<Roles> {


    /*获取redis中的role集合*/
    List<String> getRoles();
}
