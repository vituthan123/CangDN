package com.tvhung.quanlycang.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lowagie.text.DocumentException;
import com.tvhung.quanlycang.dto.DonHangDto;
import com.tvhung.quanlycang.model.Account;
import com.tvhung.quanlycang.service.ChiTietDonHangService;
import com.tvhung.quanlycang.service.ContainerService;
import com.tvhung.quanlycang.service.DonHangService;
import com.tvhung.quanlycang.service.KhachHangService;
import com.tvhung.quanlycang.utils.PDFExporter;

@Controller
@RequestMapping("/nhan-vien")
public class NhanVienController extends BaseController {
	@Autowired
	private ChiTietDonHangService chiTietDonHangService;
	@Autowired
	private ContainerService containerService;
	@Autowired
	private DonHangService donHangService;
	@Autowired
	private KhachHangService khachHangService;

	public boolean checkNhanVien(HttpSession session) {
		String role = (String) session.getAttribute("role");
		if (role != null && (role.equals(Account.NHAN_VIEN_CANG) || role.equals(Account.NHAN_VIEN_TAU))) {
			return true;
		} else {
			return false;
		}
	}

	@GetMapping("/")
	public ModelAndView index(HttpSession session) {
		if (!checkNhanVien(session)) {
			mvShare.setViewName("redirect:/dang-nhap");
			return mvShare;
		}
		mvShare.setViewName("redirect:/nhan-vien/list-don-hang");
		return mvShare;
	}

	@GetMapping("/list-chi-tiet-don-hang")
	public ModelAndView listChiTietDonHang(HttpSession session) {
		if (!checkNhanVien(session)) {
			mvShare.setViewName("redirect:/dang-nhap");
			return mvShare;
		}
		mvShare.setViewName("nhan_vien/list_chi_tiet_don_hang");
		mvShare.addObject("chiTietDonHangs", chiTietDonHangService.findAll());
		return mvShare;
	}

	@GetMapping("/list-container")
	public ModelAndView listContainer(HttpSession session) {
		if (!checkNhanVien(session)) {
			mvShare.setViewName("redirect:/dang-nhap");
			return mvShare;
		}
		mvShare.setViewName("nhan_vien/list_container");
		mvShare.addObject("containers", containerService.findAll());
		return mvShare;
	}

	@GetMapping("/list-don-hang")
	public ModelAndView listDonHang(HttpSession session) {
		if (!checkNhanVien(session)) {
			mvShare.setViewName("redirect:/dang-nhap");
			return mvShare;
		}
		mvShare.setViewName("nhan_vien/list_don_hang");
		mvShare.addObject("donHangs", donHangService.findAll());
		return mvShare;
	}

	@GetMapping("/list-khach-hang")
	public ModelAndView listKhachHang(HttpSession session) {
		if (!checkNhanVien(session)) {
			mvShare.setViewName("redirect:/dang-nhap");
			return mvShare;
		}
		mvShare.setViewName("nhan_vien/list_khach_hang");
		mvShare.addObject("khachHangs", khachHangService.findAll());
		return mvShare;
	}

	@GetMapping("/list-don-hang/export/pdf")
	public void exportToPDF(HttpServletResponse response) throws DocumentException, IOException {
		response.setContentType("application/pdf");
		response.setHeader("Content-Disposition", "attachment; filename=list_don_hang.pdf");
		List<DonHangDto> donHangs = donHangService.findAll();
		PDFExporter exporter = new PDFExporter(donHangs);
		exporter.export(response);
	}
}