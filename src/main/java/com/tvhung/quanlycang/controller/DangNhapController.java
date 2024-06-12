package com.tvhung.quanlycang.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tvhung.quanlycang.model.Account;
import com.tvhung.quanlycang.model.KhachHang;
import com.tvhung.quanlycang.model.NhanVienCang;
import com.tvhung.quanlycang.model.NhanVienTau;
import com.tvhung.quanlycang.model.Pair;
import com.tvhung.quanlycang.service.AccountService;

@Controller
public class DangNhapController extends BaseController {
	@Autowired
	private AccountService accountService;

	@GetMapping("/dang-nhap")
	public ModelAndView dangNhap(HttpSession session) {
		mvShare.setViewName("dang_nhap/dang_nhap");
		mvShare.addObject("account", new Account("", ""));
		return mvShare;
	}

	@PostMapping("/dang-nhap")
	public ModelAndView dangNhap(HttpSession session, @ModelAttribute("account") Account account) {
		Pair<String, Account> pair = accountService.findRoleAndAccount(account);
		if (pair != null) {
			String role = pair.getLeft();
			Account acc = pair.getRight();
			if (role.equals(Account.KHACH_HANG)) {
				session.setAttribute("role", role);
				session.setAttribute("account", (KhachHang) acc);
				mvShare.setViewName("redirect:/khach-hang/");
			} else if (role.equals(Account.NHAN_VIEN_CANG)) {
				session.setAttribute("role", role);
				session.setAttribute("account", (NhanVienCang) acc);
				mvShare.setViewName("redirect:/nhan-vien/");
			} else if (role.equals(Account.NHAN_VIEN_TAU)) {
				session.setAttribute("role", role);
				session.setAttribute("account", (NhanVienTau) acc);
				mvShare.setViewName("redirect:/nhan-vien/");
			}
		} else {
			mvShare.setViewName("redirect:/dang-nhap");
		}
		return mvShare;
	}

	@GetMapping("/dang-xuat")
	public ModelAndView dangXuat(HttpSession session) {
		mvShare.setViewName("redirect:/");
		session.removeAttribute("role");
		session.removeAttribute("account");
		return mvShare;
	}
}
