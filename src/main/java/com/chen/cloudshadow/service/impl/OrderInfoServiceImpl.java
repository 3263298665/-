package com.chen.cloudshadow.service.impl;

import com.chen.cloudshadow.pojo.OrderInfo;
import com.chen.cloudshadow.mapper.OrderInfoMapper;
import com.chen.cloudshadow.service.IOrderInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单信息表 服务实现类
 * </p>
 *
 * @author wangchen
 * @since 2025-02-11
 */
@Service
public class OrderInfoServiceImpl extends ServiceImpl<OrderInfoMapper, OrderInfo> implements IOrderInfoService {

}
