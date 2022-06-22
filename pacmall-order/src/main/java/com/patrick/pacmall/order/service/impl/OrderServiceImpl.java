package com.patrick.pacmall.order.service.impl;

import com.patrick.common.to.mq.SeckillOrderTo;
import com.patrick.pacmall.order.vo.*;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.patrick.common.utils.PageUtils;
import com.patrick.common.utils.Query;

import com.patrick.pacmall.order.dao.OrderDao;
import com.patrick.pacmall.order.entity.OrderEntity;
import com.patrick.pacmall.order.service.OrderService;


@Service("orderService")
public class OrderServiceImpl extends ServiceImpl<OrderDao, OrderEntity> implements OrderService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderEntity> page = this.page(
                new Query<OrderEntity>().getPage(params),
                new QueryWrapper<OrderEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public void closeOrder(OrderEntity entity) {

    }

    @Override
    public String handlePayResult(PayAsyncVo vo) {
        return null;
    }

    @Override
    public void createSeckillOrder(SeckillOrderTo orderTo) {

    }

    @Override
    public OrderConfirmVo confirmOrder() {
        return null;
    }

    @Override
    public SubmitOrderResponseVo submitOrder(OrderSubmitVo vo) {
        return null;
    }

    @Override
    public PayVo getOrderPay(String orderSn) {
        return null;
    }

}