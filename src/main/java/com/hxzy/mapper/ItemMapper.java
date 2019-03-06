package com.hxzy.mapper;

import com.hxzy.entity.Item;

public interface ItemMapper {
	/**
	 * 根据商品编号查询商品信息
	 * @param id
	 * @return
	 */
	public Item findById(Integer id);
}
