package com.patrick.pacmall.seckill.to;

import com.patrick.pacmall.seckill.vo.SkuInfoVo;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class SeckillSkuRedisTo {

    private Long id;
    /**
     * 活动id
     */
    private Long promotionId;
    /**
     * 活动场次id
     */
    private Long promotionSessionId;
    /**
     * 商品id
     */
    private Long skuId;
    /**
     * 随机码
     */
    private String randomCode;
    /**
     * 秒杀价格
     */
    private BigDecimal seckillPrice;
    /**
     * 秒杀总量
     */
    private int seckillCount;
    /**
     * 每人限购数量
     */
    private int seckillLimit;
    /**
     * 排序
     */
    private Integer seckillSort;

    private Long startTime;

    private Long endTime;

    //sku的详细信息
    private SkuInfoVo skuInfoVo;

}
