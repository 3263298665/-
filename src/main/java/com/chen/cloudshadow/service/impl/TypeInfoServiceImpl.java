package com.chen.cloudshadow.service.impl;

import com.chen.cloudshadow.pojo.TypeInfo;
import com.chen.cloudshadow.mapper.TypeInfoMapper;
import com.chen.cloudshadow.service.ITypeInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 电影类型表 服务实现类
 * </p>
 *
 * @author wangchen
 * @since 2025-02-11
 */
@Service
public class TypeInfoServiceImpl extends ServiceImpl<TypeInfoMapper, TypeInfo> implements ITypeInfoService {

}
