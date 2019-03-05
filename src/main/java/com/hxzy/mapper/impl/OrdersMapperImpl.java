package com.hxzy.mapper.impl;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.hxzy.entity.Orders;
import com.hxzy.mapper.OrdersMapper;
import com.hxzy.util.SqlSessionFactoryInstance;

public class OrdersMapperImpl implements OrdersMapper {

	private SqlSessionFactory factory;
	
	
	public OrdersMapperImpl() throws IOException {
		factory = SqlSessionFactoryInstance.getInstance().getSqlSessionFactory();
	}


	@Override
	public List<Orders> queryAll() {
		SqlSession session = factory.openSession();
		try {
			OrdersMapper mapper = session.getMapper(OrdersMapper.class);
			List<Orders> list = mapper.queryAll();
			return list;
		} catch (Exception e) {
			//实际工作中，异常信息是需要通过日志文件记录并保存。
			e.printStackTrace();
		} finally {
			session.close();
		}
		return null;
	}

}
