package com.tvhung.quanlycang.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import com.tvhung.quanlycang.model.NhanVienCang;

public class NhanVienCangMapper implements RowMapper<NhanVienCang> {

	@Override
	@Nullable
	public NhanVienCang mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		NhanVienCang nhanVienCang = new NhanVienCang();
		nhanVienCang.setId(rs.getLong("id"));
		nhanVienCang.setIdBoPhan(rs.getLong("id_bo_phan"));
		nhanVienCang.setTen(rs.getString("ten"));
		nhanVienCang.setSdt(rs.getString("sdt"));
		nhanVienCang.setEmail(rs.getString("email"));
		nhanVienCang.setTaiKhoan(rs.getString("tai_khoan"));
		nhanVienCang.setMatKhau(rs.getString("mat_khau"));
		return nhanVienCang;
	}

}
