package com.tvhung.quanlycang.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import com.tvhung.quanlycang.dto.DonHangDto;

public class DonHangDtoMapper implements RowMapper<DonHangDto> {

	@Override
	@Nullable
	public DonHangDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		DonHangDto donHangDto = new DonHangDto();
		donHangDto.setId(rs.getLong("id"));
		donHangDto.setIdKhachHang(rs.getLong("id_khach_hang"));
		donHangDto.setTrangThai(rs.getInt("trang_thai"));
		donHangDto.setNgayTao(rs.getObject("ngay_tao", LocalDateTime.class));
		donHangDto.setTrongLuong(rs.getDouble("trong_luong"));
		donHangDto.setTenNguoiNhan(rs.getString("ten_nguoi_nhan"));
		donHangDto.setSdtNguoiNhan(rs.getString("sdt_nguoi_nhan"));
		donHangDto.setIdXaNguoiNhan(rs.getLong("id_xa_nguoi_nhan"));
		donHangDto.setDiaChiNguoiNhan(rs.getString("dia_chi_nguoi_nhan"));
		donHangDto.setMoTa(rs.getString("mo_ta"));
		donHangDto.setTheTich(rs.getDouble("the_tich"));
		return donHangDto;
	}
}
