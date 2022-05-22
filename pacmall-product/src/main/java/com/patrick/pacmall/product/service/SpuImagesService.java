package com.patrick.pacmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.patrick.common.utils.PageUtils;
import com.patrick.pacmall.product.entity.SpuImagesEntity;

import java.util.List;
import java.util.Map;

/**
 * spu图片
 *
 * @author patrick
 * @email xuanweihao6@gmail.com
 * @date 2022-04-20 17:06:48
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveImages(Long id, List<String> images);
}

