package com.tvhung.quanlycang.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tvhung.quanlycang.model.KhachHang;
import com.tvhung.quanlycang.service.KhachHangService;

@RestController
@RequestMapping("/api/khach-hang")
public class KhachHangRC {
	@Autowired
	private KhachHangService khachHangService;

	@PostMapping
	public int insert(@RequestBody KhachHang khachHang) {
		return khachHangService.insert(khachHang);
	}

	@GetMapping("/{id}")
	public KhachHang findById(@PathVariable("id") Long id) {
		return khachHangService.findById(id);
	}

	@GetMapping
	public List<KhachHang> findAll() {
		return khachHangService.findAll();
	}

	@PutMapping
	public int update(@RequestBody KhachHang khachHang) {
		return khachHangService.update(khachHang);
	}

	@PutMapping("/update-mat-khau")
	public int updateMatKhau(@RequestBody KhachHang khachHang) {
		return khachHangService.updateMatKhau(khachHang);
	}

	@DeleteMapping("/{id}")
	public int deleteById(@PathVariable("id") Long id) {
		return khachHangService.deleteById(id);
	}
}
