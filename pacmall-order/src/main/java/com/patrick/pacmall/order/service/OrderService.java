package com.patrick.pacmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.patrick.common.to.mq.SeckillOrderTo;
import com.patrick.common.utils.PageUtils;
import com.patrick.pacmall.order.entity.OrderEntity;
import com.patrick.pacmall.order.vo.*;

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

    void closeOrder(OrderEntity entity);

    String handlePayResult(PayAsyncVo vo);

    void createSeckillOrder(SeckillOrderTo orderTo);

    OrderConfirmVo confirmOrder();

    SubmitOrderResponseVo submitOrder(OrderSubmitVo vo);

    PayVo getOrderPay(String orderSn);
}

