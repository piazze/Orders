package com.hxzy.mapper;

import java.util.List;

import com.hxzy.entity.OrdersDetail;

public interface OrdersDetailMapper {
	/**
	 * 根据订单编号查询订单明细
	 * @return
	 */
	public List<OrdersDetail> queryByOrderid(Integer id);
}
