package com.tvhung.quanlycang.dao;

import java.util.List;

import com.tvhung.quanlycang.model.ChiTietDonHang;

public interface ChiTietDonHangDao {
	int insert(ChiTietDonHang model);

	ChiTietDonHang findByIds(Long idDonHang, Long idContainer);

	List<ChiTietDonHang> findAll();

	int update(ChiTietDonHang model);

	int deleteByIds(Long idDonHang, Long idContainer);

	int deleteByIdDonHang(Long idDonHang);

	boolean existsByIds(Long idDonHang, Long idContainer);

	long count();
}