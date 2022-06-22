package com.patrick.pacmall.order.vo;

import com.patrick.pacmall.order.entity.OrderEntity;
import lombok.Data;

@Data
public class SubmitOrderResponseVo {

    private OrderEntity order;
    private Integer code;//0成功


}
