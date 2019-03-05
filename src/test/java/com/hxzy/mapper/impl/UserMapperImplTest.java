package com.hxzy.mapper.impl;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Ignore;
import org.junit.Test;

import com.hxzy.entity.User;
import com.hxzy.mapper.UserMapper;

public class UserMapperImplTest {

	@Test
	@Ignore
	public void testInsert() throws IOException {
		UserMapper mapper = new UserMapperImpl();
		User user = new User();
		user.setUserName("翠花");
		user.setSex("女");
		int insert = mapper.add(user);
		assertEquals(1, insert);
	}

	@Test
	public void testFindById() throws IOException {
		UserMapper mapper = new UserMapperImpl();
		User user = mapper.findById(2);
		System.out.println(user);
	}
}
