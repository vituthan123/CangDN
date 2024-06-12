package com.tvhung.quanlycang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tvhung.quanlycang.dao.KhachHangDao;
import com.tvhung.quanlycang.dao.PhuongXaDao;
import com.tvhung.quanlycang.model.KhachHang;
import com.tvhung.quanlycang.service.KhachHangService;

@Service
public class KhachHangServiceImpl implements KhachHangService {
	@Autowired
	private KhachHangDao khachHangDao;
	@Autowired
	private PhuongXaDao phuongXaDao;

	@Override
	public int insert(KhachHang khachHang) {
		// TODO Auto-generated method stub
		if (phuongXaDao.existsById(khachHang.getIdXa()) == false) {
			return -1;
		}
		return khachHangDao.insert(khachHang);
	}

	@Override
	public KhachHang findById(Long id) {
		// TODO Auto-generated method stub
		return khachHangDao.findById(id);
	}

	@Override
	public List<KhachHang> findAll() {
		// TODO Auto-generated method stub
		return khachHangDao.findAll();
	}

	@Override
	public int update(KhachHang khachHang) {
		// TODO Auto-generated method stub
		if (phuongXaDao.existsById(khachHang.getIdXa()) == false) {
			return -1;
		}
		return khachHangDao.update(khachHang);
	}

	@Override
	public int updateMatKhau(KhachHang khachHang) {
		// TODO Auto-generated method stub
		return khachHangDao.updateMatKhau(khachHang);
	}

	@Override
	public int deleteById(Long id) {
		// TODO Auto-generated method stub
		return khachHangDao.deleteById(id);
	}
}
