package com.patrick.pacmall.seckill.feign;

import com.patrick.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("pacmall-coupon")
public interface CouponFeignService {

    @GetMapping("/coupon/seckillsession/lates3DaySession")
    R getLates3DaySession();
}
