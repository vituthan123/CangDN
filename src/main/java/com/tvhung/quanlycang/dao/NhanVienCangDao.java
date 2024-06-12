package com.tvhung.quanlycang.dao;

import com.tvhung.quanlycang.model.NhanVienCang;

public interface NhanVienCangDao extends GenericDao<NhanVienCang, Long> {
	NhanVienCang findByTaiKhoanAndMatKhau(String taiKhoan, String matKhau);

	int updateMatKhau(NhanVienCang model);

	boolean existsByTaiKhoanAndMatKhau(String taiKhoan, String matKhau);
}
