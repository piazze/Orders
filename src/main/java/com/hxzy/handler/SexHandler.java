package com.hxzy.handler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

public class SexHandler extends BaseTypeHandler<String> {

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, String parameter, JdbcType jdbcType)
			throws SQLException {
		/*
		 * 在数据库中表示性别：1：男   0：女
		 * */
		System.out.println("i:" + i + ",parameter:" + parameter);
		if(parameter != null && !parameter.equals("")) {
			if (parameter.equals("男")) {
				ps.setString(i, "1");
			} else if (parameter.equals("女")) {
				ps.setString(i, "0");
			} else {
				ps.setString(i, parameter);
			}
		}

	}

	@Override
	public String getNullableResult(ResultSet rs, String columnName) throws SQLException {
		String string = rs.getString(columnName);
		if (string != null ) {
			if (string.equals("0")) {
				string = "女";
			} else if (string.equals("1")) {
				string = "男";
			}
		}
		return string;
	}

	@Override
	public String getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		String string = rs.getString(columnIndex);
		if (string != null ) {
			if (string.equals("0")) {
				string = "女";
			} else if (string.equals("1")) {
				string = "男";
			}
		}
		return string;
	}

	@Override
	public String getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
