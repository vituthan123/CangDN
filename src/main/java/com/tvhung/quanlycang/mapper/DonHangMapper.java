package com.tvhung.quanlycang.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import com.tvhung.quanlycang.model.DonHang;

public class DonHangMapper implements RowMapper<DonHang> {

	@Override
	@Nullable
	public DonHang mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		DonHang donHang = new DonHang();
		donHang.setId(rs.getLong("id"));
		donHang.setIdKhachHang(rs.getLong("id_khach_hang"));
		donHang.setTrangThai(rs.getInt("trang_thai"));
		donHang.setNgayTao(rs.getObject("ngay_tao", LocalDateTime.class));
		donHang.setTrongLuong(rs.getDouble("trong_luong"));
		donHang.setTenNguoiNhan(rs.getString("ten_nguoi_nhan"));
		donHang.setSdtNguoiNhan(rs.getString("sdt_nguoi_nhan"));
		donHang.setIdXaNguoiNhan(rs.getLong("id_xa_nguoi_nhan"));
		donHang.setDiaChiNguoiNhan(rs.getString("dia_chi_nguoi_nhan"));
		donHang.setMoTa(rs.getString("mo_ta"));
		return donHang;
	}
}
