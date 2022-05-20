package com.patrick.pacmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.patrick.common.utils.PageUtils;
import com.patrick.pacmall.product.entity.ProductAttrValueEntity;

import java.util.List;
import java.util.Map;

/**
 * spu属性值
 *
 * @author patrick
 * @email xuanweihao6@gmail.com
 * @date 2022-04-20 17:06:48
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<ProductAttrValueEntity> baseAttrlistforspu(Long spuId);

    void updateSpuAttr(Long spuId, List<ProductAttrValueEntity> entities);
}

