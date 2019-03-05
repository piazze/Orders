package com.hxzy.mapper.impl;


import java.io.IOException;
import java.util.List;

import org.junit.Test;

import com.hxzy.entity.Orders;
import com.hxzy.mapper.OrdersMapper;

public class OrdersMapperImplTest {

	@Test
	public void testQueryAll() throws IOException {
		OrdersMapper mapper = new OrdersMapperImpl();
		List<Orders> queryAll = mapper.queryAll();
		queryAll.stream().forEach(System.out::println);
	}

}
