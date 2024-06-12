package com.tvhung.quanlycang.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import com.tvhung.quanlycang.model.KhachHang;

public class KhachHangMapper implements RowMapper<KhachHang> {

	@Override
	@Nullable
	public KhachHang mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		KhachHang khachHang = new KhachHang();
		khachHang.setId(rs.getLong("id"));
		khachHang.setTen(rs.getString("ten"));
		khachHang.setSdt(rs.getString("sdt"));
		khachHang.setEmail(rs.getString("email"));
		khachHang.setNgaySinh(rs.getObject("ngay_sinh", LocalDate.class));
		khachHang.setIdXa(rs.getLong("id_xa"));
		khachHang.setMaSoThue(rs.getString("ma_so_thue"));
		khachHang.setDiaChi(rs.getString("dia_chi"));
		khachHang.setTaiKhoan(rs.getString("tai_khoan"));
		khachHang.setMatKhau(rs.getString("mat_khau"));
		return khachHang;
	}
}
