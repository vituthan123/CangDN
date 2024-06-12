package com.tvhung.quanlycang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tvhung.quanlycang.dao.ChiTietDonHangDao;
import com.tvhung.quanlycang.dao.ContainerDao;
import com.tvhung.quanlycang.dao.DonHangDao;
import com.tvhung.quanlycang.dao.DonHangDtoDao;
import com.tvhung.quanlycang.dao.KhachHangDao;
import com.tvhung.quanlycang.dao.PhuongXaDao;
import com.tvhung.quanlycang.dto.DonHangDto;
import com.tvhung.quanlycang.model.ChiTietDonHang;
import com.tvhung.quanlycang.model.Container;
import com.tvhung.quanlycang.model.DonHang;
import com.tvhung.quanlycang.service.DonHangService;

@Service
public class DonHangServiceImpl implements DonHangService {
	@Autowired
	private DonHangDao donHangDao;
	@Autowired
	private DonHangDtoDao donHangDtoDao;
	@Autowired
	private ChiTietDonHangDao chiTietDonHangDao;
	@Autowired
	private ContainerDao containerDao;
	@Autowired
	private KhachHangDao khachHangDao;
	@Autowired
	private PhuongXaDao phuongXaDao;

	@Override
	public int insert(DonHangDto donHangDto) {
		// TODO Auto-generated method stub
		if (khachHangDao.existsById(donHangDto.getIdKhachHang()) == false
				|| phuongXaDao.existsById(donHangDto.getIdXaNguoiNhan()) == false) {
			return -1;
		}
		DonHang donHang = donHangDto.toModel();
		double theTich = donHangDto.getTheTich();
		int result = donHangDao.insert(donHang);
		long idDonHang = donHangDao.findLastInsertId();
		List<Container> containers = containerDao.findEmptyContainers();
		long phanNguyen = (long) (theTich / 1000);
		double phanDu = theTich % 1000;
		for (int i = 0; i < phanNguyen; i++) {
			chiTietDonHangDao.insert(new ChiTietDonHang(idDonHang, containers.get(i).getId(), 1, 1000));
		}
		if (phanDu > 0) {
			chiTietDonHangDao
					.insert(new ChiTietDonHang(idDonHang, containers.get((int) phanNguyen).getId(), 1, phanDu));
		}
		return result;
	}

	@Override
	public DonHangDto findById(Long id) {
		// TODO Auto-generated method stub
		if (donHangDao.existsById(id) == false) {
			return null;
		}
		return donHangDtoDao.findById(id);
	}

	@Override
	public List<DonHangDto> findAll() {
		// TODO Auto-generated method stub
		return donHangDtoDao.findAll();
	}

	@Override
	public int update(DonHangDto donHangDto) {
		// TODO Auto-generated method stub
		if (khachHangDao.existsById(donHangDto.getIdKhachHang()) == false
				|| phuongXaDao.existsById(donHangDto.getIdXaNguoiNhan()) == false) {
			return -1;
		}
		DonHang donHang = donHangDto.toModel();
		double theTich = donHangDto.getTheTich();
		chiTietDonHangDao.deleteByIdDonHang(donHang.getId());
		int result = donHangDao.update(donHang);
		List<Container> containers = containerDao.findEmptyContainers();
		long phanNguyen = (long) (theTich / 1000);
		double phanDu = theTich % 1000;
		for (int i = 0; i < phanNguyen; i++) {
			chiTietDonHangDao.insert(new ChiTietDonHang(donHang.getId(), containers.get(i).getId(), 1, 1000));
		}
		if (phanDu > 0) {
			chiTietDonHangDao
					.insert(new ChiTietDonHang(donHang.getId(), containers.get((int) phanNguyen).getId(), 1, phanDu));
		}
		return result;
	}

	@Override
	public int deleteById(Long id) {
		// TODO Auto-generated method stub
		return donHangDao.deleteById(id);
	}
}