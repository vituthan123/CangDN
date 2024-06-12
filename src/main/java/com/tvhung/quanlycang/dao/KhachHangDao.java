package com.tvhung.quanlycang.dao;

import com.tvhung.quanlycang.model.KhachHang;

public interface KhachHangDao extends GenericDao<KhachHang, Long> {
	KhachHang findByTaiKhoanAndMatKhau(String taiKhoan, String matKhau);

	int updateMatKhau(KhachHang model);

	boolean existsByTaiKhoanAndMatKhau(String taiKhoan, String matKhau);
}
