package com.tvhung.quanlycang.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tvhung.quanlycang.dao.KhachHangDao;
import com.tvhung.quanlycang.dao.NhanVienCangDao;
import com.tvhung.quanlycang.dao.NhanVienTauDao;
import com.tvhung.quanlycang.model.Account;
import com.tvhung.quanlycang.model.Pair;
import com.tvhung.quanlycang.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	private KhachHangDao khachHangDao;
	@Autowired
	private NhanVienCangDao nhanVienCangDao;
	@Autowired
	private NhanVienTauDao nhanVienTauDao;

	@Override
	public Pair<String, Account> findRoleAndAccount(Account account) {
		// TODO Auto-generated method stub
		String taiKhoan = account.getTaiKhoan();
		String matKhau = account.getMatKhau();
		if (khachHangDao.existsByTaiKhoanAndMatKhau(taiKhoan, matKhau)) {
			return new Pair<String, Account>(Account.KHACH_HANG,
					khachHangDao.findByTaiKhoanAndMatKhau(taiKhoan, matKhau));
		} else if (nhanVienCangDao.existsByTaiKhoanAndMatKhau(taiKhoan, matKhau)) {
			return new Pair<String, Account>(Account.NHAN_VIEN_CANG,
					nhanVienCangDao.findByTaiKhoanAndMatKhau(taiKhoan, matKhau));
		} else if (nhanVienTauDao.existsByTaiKhoanAndMatKhau(taiKhoan, matKhau)) {
			return new Pair<String, Account>(Account.NHAN_VIEN_TAU,
					nhanVienTauDao.findByTaiKhoanAndMatKhau(taiKhoan, matKhau));
		} else {
			return null;
		}
	}
}
