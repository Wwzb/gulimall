package com.zbin.gulimall.order.dao;

import com.zbin.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author Zbin
 * @email 996627951@qq.com
 * @date 2020-07-05 21:27:44
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
