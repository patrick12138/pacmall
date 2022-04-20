package com.patrick.pacmall.product.dao;

import com.patrick.pacmall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author patrick
 * @email xuanweihao6@gmail.com
 * @date 2022-04-20 17:06:48
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
