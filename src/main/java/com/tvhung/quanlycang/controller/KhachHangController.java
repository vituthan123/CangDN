package com.tvhung.quanlycang.controller;

import java.time.LocalDateTime;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tvhung.quanlycang.dto.DonHangDto;
import com.tvhung.quanlycang.model.Account;
import com.tvhung.quanlycang.model.KhachHang;
import com.tvhung.quanlycang.service.DonHangService;
import com.tvhung.quanlycang.service.KhachHangService;

@Controller
@RequestMapping("/khach-hang")
public class KhachHangController extends BaseController {
	@Autowired
	private KhachHangService khachHangService;
	@Autowired
	private DonHangService donHangService;

	public boolean checkKhachHang(HttpSession session) {
		String role = (String) session.getAttribute("role");
		if (role != null && role.equals(Account.KHACH_HANG)) {
			return true;
		} else {
			return false;
		}
	}

	@GetMapping("/")
	public ModelAndView index(HttpSession session) {
		if (!checkKhachHang(session)) {
			mvShare.setViewName("redirect:/dang-nhap");
			return mvShare;
		}
		mvShare.setViewName("redirect:/khach-hang/don-hang");
		return mvShare;
	}

	@GetMapping("/doi-mat-khau")
	public ModelAndView doiMatKhau(HttpSession session) {
		if (!checkKhachHang(session)) {
			mvShare.setViewName("redirect:/dang-nhap");
			return mvShare;
		}
		mvShare.setViewName("khach_hang/doi_mat_khau");
		mvShare.addObject("account", new KhachHang());
		return mvShare;
	}

	@PostMapping("/doi-mat-khau")
	public ModelAndView doiMatKhau(HttpSession session, @ModelAttribute("account") KhachHang khachHang) {
		if (!checkKhachHang(session)) {
			mvShare.setViewName("redirect:/dang-nhap");
			return mvShare;
		}
		mvShare.setViewName("redirect:/khach-hang/");
		khachHang.setId(((KhachHang) session.getAttribute("account")).getId());
		khachHangService.updateMatKhau(khachHang);
		return mvShare;
	}

	@GetMapping("/chi-tiet-don-hang/{id}")
	public ModelAndView chiTietDonHang(HttpSession session, @PathVariable("id") long id) {
		if (!checkKhachHang(session)) {
			mvShare.setViewName("redirect:/dang-nhap");
			return mvShare;
		}
		mvShare.setViewName("khach_hang/chi_tiet_don_hang");
		mvShare.addObject("donHang", donHangService.findById(id));
		return mvShare;
	}

	@GetMapping("/don-hang")
	public ModelAndView donHang(HttpSession session) {
		if (!checkKhachHang(session)) {
			mvShare.setViewName("redirect:/dang-nhap");
			return mvShare;
		}
		mvShare.setViewName("khach_hang/don_hang");
		mvShare.addObject("donHangs", donHangService.findAll());
		return mvShare;
	}

	@GetMapping("/sua-don-hang/{id}")
	public ModelAndView suaDonHang(HttpSession session, @PathVariable("id") long id) {
		if (!checkKhachHang(session)) {
			mvShare.setViewName("redirect:/dang-nhap");
			return mvShare;
		}
		mvShare.setViewName("khach_hang/sua_don_hang");
		mvShare.addObject("donHang", donHangService.findById(id));
		return mvShare;
	}

	@PostMapping("/sua-don-hang")
	public ModelAndView suaDonHang(HttpSession session, @ModelAttribute("donHang") DonHangDto donHangDto) {
		if (!checkKhachHang(session)) {
			mvShare.setViewName("redirect:/dang-nhap");
			return mvShare;
		}
		mvShare.setViewName("redirect:/khach-hang/don-hang");
		donHangDto.setIdKhachHang(((KhachHang) session.getAttribute("account")).getId());
		donHangDto.setIdXaNguoiNhan(1);
		donHangService.update(donHangDto);
		return mvShare;
	}

	@GetMapping("/sua-khach-hang")
	public ModelAndView suaKhachHang(HttpSession session) {
		if (!checkKhachHang(session)) {
			mvShare.setViewName("redirect:/dang-nhap");
			return mvShare;
		}
		mvShare.setViewName("khach_hang/sua_khach_hang");
		mvShare.addObject("khachHang", (KhachHang) session.getAttribute("account"));
		return mvShare;
	}

	@PostMapping("/sua-khach-hang")
	public ModelAndView suaKhachHang(HttpSession session, @ModelAttribute("khachHang") KhachHang khachHang) {
		if (!checkKhachHang(session)) {
			mvShare.setViewName("redirect:/dang-nhap");
			return mvShare;
		}
		mvShare.setViewName("redirect:/khach-hang/");
		khachHang.setId(((KhachHang) session.getAttribute("account")).getId());
		khachHang.setTaiKhoan(((KhachHang) session.getAttribute("account")).getTaiKhoan());
		khachHang.setIdXa(1);
		khachHangService.update(khachHang);
		return mvShare;
	}

	@GetMapping("/them-don-hang")
	public ModelAndView themDonHang(HttpSession session) {
		if (!checkKhachHang(session)) {
			mvShare.setViewName("redirect:/dang-nhap");
			return mvShare;
		}
		mvShare.setViewName("khach_hang/them_don_hang");
		mvShare.addObject("donHang", new DonHangDto());
		return mvShare;
	}

	@PostMapping("/them-don-hang")
	public ModelAndView themDonHang(HttpSession session, @ModelAttribute("donHang") DonHangDto donHangDto) {
		if (!checkKhachHang(session)) {
			mvShare.setViewName("redirect:/dang-nhap");
			return mvShare;
		}
		mvShare.setViewName("redirect:/khach-hang/don-hang");
		donHangDto.setIdKhachHang(((KhachHang) session.getAttribute("account")).getId());
		donHangDto.setIdXaNguoiNhan(1);
		donHangDto.setTrangThai(0);
		donHangDto.setNgayTao(LocalDateTime.now());
		donHangService.insert(donHangDto);
		return mvShare;
	}

	@PostMapping("/xoa-don-hang/{id}")
	public ModelAndView xoaDonHang(HttpSession session, @PathVariable("id") long id) {
		if (!checkKhachHang(session)) {
			mvShare.setViewName("redirect:/dang-nhap");
			return mvShare;
		}
		mvShare.setViewName("redirect:/khach-hang/don-hang");
		donHangService.deleteById(id);
		return mvShare;
	}
}
