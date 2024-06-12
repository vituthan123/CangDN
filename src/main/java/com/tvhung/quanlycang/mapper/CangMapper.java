package com.tvhung.quanlycang.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import com.tvhung.quanlycang.model.Cang;

public class CangMapper implements RowMapper<Cang> {

	@Override
	@Nullable
	public Cang mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Cang cang = new Cang();
		cang.setId(rs.getLong("id"));
		cang.setTen(rs.getString("ten"));
		return cang;
	}
}
