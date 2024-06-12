package com.tvhung.quanlycang.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import com.tvhung.quanlycang.model.PhuongXa;

public class PhuongXaMapper implements RowMapper<PhuongXa> {

	@Override
	@Nullable
	public PhuongXa mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		PhuongXa phuongXa = new PhuongXa();
		phuongXa.setId(rs.getLong("id"));
		phuongXa.setIdQuanHuyen(rs.getLong("id_quan_huyen"));
		phuongXa.setTen(rs.getString("ten"));
		return phuongXa;
	}

}
