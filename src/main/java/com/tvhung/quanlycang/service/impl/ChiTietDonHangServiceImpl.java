package com.tvhung.quanlycang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tvhung.quanlycang.dao.ChiTietDonHangDao;
import com.tvhung.quanlycang.model.ChiTietDonHang;
import com.tvhung.quanlycang.service.ChiTietDonHangService;

@Service
public class ChiTietDonHangServiceImpl implements ChiTietDonHangService {
	@Autowired
	private ChiTietDonHangDao chiTietDonHangDao;

	@Override
	public List<ChiTietDonHang> findAll() {
		// TODO Auto-generated method stub
		return chiTietDonHangDao.findAll();
	}
}
