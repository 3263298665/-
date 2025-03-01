package com.chen.cloudshadow.service.impl;

import com.chen.cloudshadow.pojo.Orders;
import com.chen.cloudshadow.mapper.OrdersMapper;
import com.chen.cloudshadow.service.IOrdersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author wangchen
 * @since 2025-03-01
 */
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements IOrdersService {

}
