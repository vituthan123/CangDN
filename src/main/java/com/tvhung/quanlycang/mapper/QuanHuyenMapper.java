package com.tvhung.quanlycang.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import com.tvhung.quanlycang.model.QuanHuyen;

public class QuanHuyenMapper implements RowMapper<QuanHuyen> {

	@Override
	@Nullable
	public QuanHuyen mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		QuanHuyen quanHuyen = new QuanHuyen();
		quanHuyen.setId(rs.getLong("id"));
		quanHuyen.setIdTinhThanh(rs.getLong("id_tinh_thanh"));
		quanHuyen.setTen(rs.getString("ten"));
		return quanHuyen;
	}

}
