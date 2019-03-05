package com.hxzy.mapper;

import java.util.List;

import com.hxzy.entity.Orders;

public interface OrdersMapper {
	
	/**
	 * 查询所有订单
	 * @return
	 */
	public List<Orders> queryAll();
}
