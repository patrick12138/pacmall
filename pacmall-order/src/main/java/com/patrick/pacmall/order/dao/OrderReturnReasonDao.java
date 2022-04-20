package com.patrick.pacmall.order.dao;

import com.patrick.pacmall.order.entity.OrderReturnReasonEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退货原因
 * 
 * @author patrick
 * @email xuanweihao6@gmail.com
 * @date 2022-04-20 17:12:03
 */
@Mapper
public interface OrderReturnReasonDao extends BaseMapper<OrderReturnReasonEntity> {
	
}
