package com.patrick.pacmall.product.dao;

import com.patrick.pacmall.product.entity.CategoryBrandRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 品牌分类关联
 * 
 * @author patrick
 * @email xuanweihao6@gmail.com
 * @date 2022-04-20 17:06:48
 */
@Mapper
public interface CategoryBrandRelationDao extends BaseMapper<CategoryBrandRelationEntity> {
    void updateCategory(@Param("catId") Long catId,@Param("name") String name);
}
