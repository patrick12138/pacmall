package com.patrick.pacmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.patrick.common.utils.PageUtils;
import com.patrick.pacmall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author patrick
 * @email xuanweihao6@gmail.com
 * @date 2022-04-20 17:12:03
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

