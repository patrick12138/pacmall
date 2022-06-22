package com.patrick.pacmall.order.to;

import com.patrick.pacmall.order.entity.OrderEntity;
import com.patrick.pacmall.order.entity.OrderItemEntity;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class OrderCreateTo {
    private OrderEntity order;
    private List<OrderItemEntity> items;
    private BigDecimal payPrice;
    private BigDecimal fare;
}
