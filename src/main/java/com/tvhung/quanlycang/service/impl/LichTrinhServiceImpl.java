package com.tvhung.quanlycang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tvhung.quanlycang.dao.LichTrinhDtoDao;
import com.tvhung.quanlycang.dto.LichTrinhDto;
import com.tvhung.quanlycang.service.LichTrinhService;

@Service
public class LichTrinhServiceImpl implements LichTrinhService {
	@Autowired
	private LichTrinhDtoDao lichTrinhDtoDao;

	@Override
	public List<LichTrinhDto> findAll() {
		// TODO Auto-generated method stub
		return lichTrinhDtoDao.findAll();
	}
}
