package com.tvhung.quanlycang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tvhung.quanlycang.dao.PhuongXaDao;
import com.tvhung.quanlycang.dao.QuanHuyenDao;
import com.tvhung.quanlycang.dao.QuocGiaDao;
import com.tvhung.quanlycang.dao.TinhThanhDao;
import com.tvhung.quanlycang.model.PhuongXa;
import com.tvhung.quanlycang.model.QuanHuyen;
import com.tvhung.quanlycang.model.TinhThanh;
import com.tvhung.quanlycang.service.DiaChiService;

@Service
public class DiaChiServiceImpl implements DiaChiService {
	@Autowired
	private QuocGiaDao quocGiaDao;
	@Autowired
	private TinhThanhDao tinhThanhDao;
	@Autowired
	private QuanHuyenDao quanHuyenDao;
	@Autowired
	private PhuongXaDao phuongXaDao;

	@Override
	public List<TinhThanh> findByIdQuocGia(Long idQuocGia) {
		// TODO Auto-generated method stub
		if (quocGiaDao.existsById(idQuocGia) == false) {
			return null;
		}
		return tinhThanhDao.findByIdQuocGia(idQuocGia);
	}

	@Override
	public List<QuanHuyen> findByIdTinhThanh(Long idTinhThanh) {
		// TODO Auto-generated method stub
		if (tinhThanhDao.existsById(idTinhThanh) == false) {
			return null;
		}
		return quanHuyenDao.findByIdTinhThanh(idTinhThanh);
	}

	@Override
	public List<PhuongXa> findByIdQuanHuyen(Long idQuanHuyen) {
		// TODO Auto-generated method stub
		if (quanHuyenDao.existsById(idQuanHuyen) == false) {
			return null;
		}
		return phuongXaDao.findByIdQuanHuyen(idQuanHuyen);
	}
}
