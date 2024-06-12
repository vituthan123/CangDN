package com.tvhung.quanlycang.dao;

import com.tvhung.quanlycang.model.NhanVienTau;

public interface NhanVienTauDao extends GenericDao<NhanVienTau, Long> {
	NhanVienTau findByTaiKhoanAndMatKhau(String taiKhoan, String matKhau);

	int updateMatKhau(NhanVienTau model);

	boolean existsByTaiKhoanAndMatKhau(String taiKhoan, String matKhau);
}
