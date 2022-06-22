package com.patrick.pacmall.member.feign;

import com.patrick.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

@FeignClient("pacmall-order")
public interface OrderFeignService {
    /**
     * 订单列表
     */
   @PostMapping("/order/order/listWithItem")
     R listWithItem(@RequestBody Map<String, Object> params);
}
