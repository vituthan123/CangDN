package com.tvhung.quanlycang.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tvhung.quanlycang.dto.DonHangDto;
import com.tvhung.quanlycang.service.DonHangService;
import com.tvhung.quanlycang.service.LichTrinhService;

@Controller
public class TrangChuController extends BaseController {
	@Autowired
	private LichTrinhService lichTrinhService;
	@Autowired
	private DonHangService donHangService;

	public boolean checkNumeric(String query) {
		try {
			Long.parseLong(query);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	@GetMapping("/")
	public ModelAndView index() {
		mvShare.setViewName("trang_chu/index");
		return mvShare;
	}

	@GetMapping("/lich-trinh")
	public ModelAndView lichTrinh() {
		mvShare.setViewName("trang_chu/lich_trinh");
		mvShare.addObject("lichTrinhs", lichTrinhService.findAll());
		return mvShare;
	}

	@GetMapping("/tim-kiem")
	public ModelAndView timKiem(@RequestParam(value = "query", required = false) String query) {
		mvShare.setViewName("trang_chu/tim_kiem");
		if (query == null || query.isEmpty()) {
			mvShare.addObject("donHangs", donHangService.findAll());
		} else if (checkNumeric(query)) {
			List<DonHangDto> donHangs = new ArrayList<DonHangDto>();
			if (donHangService.findById(Long.parseLong(query)) != null) {
				donHangs.add(donHangService.findById(Long.parseLong(query)));
			} else {
				donHangs = new ArrayList<DonHangDto>();
			}
			mvShare.addObject("donHangs", donHangs);
		} else {
			mvShare.addObject("donHangs", new ArrayList<DonHangDto>());
		}
		mvShare.addObject("query", query);
		return mvShare;
	}
}
