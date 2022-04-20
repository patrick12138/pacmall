package com.patrick.pacmall.ware.dao;

import com.patrick.pacmall.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author patrick
 * @email xuanweihao6@gmail.com
 * @date 2022-04-20 17:24:34
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
