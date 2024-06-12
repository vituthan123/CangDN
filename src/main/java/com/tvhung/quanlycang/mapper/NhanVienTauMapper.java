package com.tvhung.quanlycang.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import com.tvhung.quanlycang.model.NhanVienTau;

public class NhanVienTauMapper implements RowMapper<NhanVienTau> {

	@Override
	@Nullable
	public NhanVienTau mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		NhanVienTau nhanVienTau = new NhanVienTau();
		nhanVienTau.setId(rs.getLong("id"));
		nhanVienTau.setIdTau(rs.getLong("id_tau"));
		nhanVienTau.setTen(rs.getString("ten"));
		nhanVienTau.setSdt(rs.getString("sdt"));
		nhanVienTau.setEmail(rs.getString("email"));
		nhanVienTau.setTaiKhoan(rs.getString("tai_khoan"));
		nhanVienTau.setMatKhau(rs.getString("mat_khau"));
		return nhanVienTau;
	}

}
