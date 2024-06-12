package com.tvhung.quanlycang.service;

import java.util.List;

import com.tvhung.quanlycang.dto.DonHangDto;

public interface DonHangService {
	int insert(DonHangDto donHangDto);

	DonHangDto findById(Long id);

	List<DonHangDto> findAll();

	int update(DonHangDto donHangDto);

	int deleteById(Long id);
}
