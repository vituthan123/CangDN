package com.tvhung.quanlycang.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import com.tvhung.quanlycang.model.QuocGia;

public class QuocGiaMapper implements RowMapper<QuocGia> {

	@Override
	@Nullable
	public QuocGia mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		QuocGia quocGia = new QuocGia();
		quocGia.setId(rs.getLong("id"));
		quocGia.setTen(rs.getString("ten"));
		return quocGia;
	}

}
