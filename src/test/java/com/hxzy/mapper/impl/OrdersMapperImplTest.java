package com.hxzy.mapper.impl;


import java.io.IOException;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.hxzy.entity.Orders;
import com.hxzy.mapper.OrdersMapper;

public class OrdersMapperImplTest {

	@Test
	@Ignore
	public void testQueryAll() throws IOException {
		OrdersMapper mapper = new OrdersMapperImpl();
		List<Orders> queryAll = mapper.queryAll();
		queryAll.stream().forEach(System.out::println);
	}
	
	@Test
	public void testQueryAll2() throws IOException {
		OrdersMapper mapper = new OrdersMapperImpl();
		List<Orders> queryAll = mapper.queryAll2();
		//queryAll.stream().forEach(System.out::println);
		for (Orders orders : queryAll) {
			System.out.println(orders);
		}
	}
}
