package com.tvhung.quanlycang.service;

import java.util.List;

import com.tvhung.quanlycang.model.KhachHang;

public interface KhachHangService {
	int insert(KhachHang khachHang);

	KhachHang findById(Long id);

	List<KhachHang> findAll();

	int update(KhachHang khachHang);

	int updateMatKhau(KhachHang khachHang);

	int deleteById(Long id);
}