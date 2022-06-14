package com.patrick.pacmall.search.feign;

import com.patrick.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient("pacmall-product")
public interface ProductFeignService {
    @RequestMapping(value = "/product/attr/info/{attrId}",method = RequestMethod.GET)
    R attrInfo(@PathVariable("attrId") Long attrId);

    @GetMapping("/product/brand/infos")
    R brandsInfo(@RequestParam("brandIds") List<Long> brandIds);
}
