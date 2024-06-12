package com.tvhung.quanlycang.dao;

import java.util.List;

import com.tvhung.quanlycang.dto.DonHangDto;

public interface DonHangDtoDao {
	DonHangDto findById(Long id);

	List<DonHangDto> findAll();

	boolean existsById(Long id);

	long count();
}
