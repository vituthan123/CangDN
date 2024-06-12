package com.tvhung.quanlycang.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import com.tvhung.quanlycang.model.TinhThanh;

public class TinhThanhMapper implements RowMapper<TinhThanh> {

	@Override
	@Nullable
	public TinhThanh mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		TinhThanh tinhThanh = new TinhThanh();
		tinhThanh.setId(rs.getLong("id"));
		tinhThanh.setIdQuocGia(rs.getLong("id_quoc_gia"));
		tinhThanh.setTen(rs.getString("ten"));
		return tinhThanh;
	}

}
