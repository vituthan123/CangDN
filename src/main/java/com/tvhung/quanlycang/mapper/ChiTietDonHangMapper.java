package com.tvhung.quanlycang.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import com.tvhung.quanlycang.model.ChiTietDonHang;

public class ChiTietDonHangMapper implements RowMapper<ChiTietDonHang> {

	@Override
	@Nullable
	public ChiTietDonHang mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		ChiTietDonHang chiTietDonHang = new ChiTietDonHang();
		chiTietDonHang.setIdDonHang(rs.getLong("id_don_hang"));
		chiTietDonHang.setIdContainer(rs.getLong("id_container"));
		chiTietDonHang.setIdLichTrinh(rs.getLong("id_lich_trinh"));
		chiTietDonHang.setTheTich(rs.getDouble("the_tich"));
		return chiTietDonHang;
	}

}
