package com.hxzy.mapper.impl;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.hxzy.entity.OrdersDetail;
import com.hxzy.mapper.OrdersDetailMapper;
import com.hxzy.util.SqlSessionFactoryInstance;

public class OrdersDetailMapperImpl implements OrdersDetailMapper {

	private SqlSessionFactory factory;
	
	
	public OrdersDetailMapperImpl() throws IOException {
		super();
		factory = SqlSessionFactoryInstance.getInstance().getSqlSessionFactory();
	}


	@Override
	public List<OrdersDetail> queryByOrderid(Integer id) {
		SqlSession session = factory.openSession();
		try {
			OrdersDetailMapper mapper = session.getMapper(OrdersDetailMapper.class);
			List<OrdersDetail> list = mapper.queryByOrderid(id);
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
