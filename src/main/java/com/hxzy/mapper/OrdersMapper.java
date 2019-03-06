package com.hxzy.mapper;

import java.util.List;

import com.hxzy.entity.Orders;

public interface OrdersMapper {
	
	/**
	 * 查询所有订单
	 * @return
	 */
	public List<Orders> queryAll();
	
	public List<Orders> queryAll2();
	
	/**
	 * 根据id查询订单的对象
	 * @param id
	 * @return
	 */
	public Orders findById(Integer id);
}
