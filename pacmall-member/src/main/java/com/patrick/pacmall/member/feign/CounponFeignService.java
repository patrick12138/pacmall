package com.patrick.pacmall.member.feign;

import com.patrick.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("pacmall-coupon")
public interface CounponFeignService {
    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();
}
