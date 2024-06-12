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

import com.tvhung.quanlycang.dto.DonHangDto;
import com.tvhung.quanlycang.service.DonHangService;

@RestController
@RequestMapping("/api/don-hang")
public class DonHangRC {
	@Autowired
	private DonHangService donHangService;

	@PostMapping
	public int insert(@RequestBody DonHangDto donHangDto) {
		return donHangService.insert(donHangDto);
	}

	@GetMapping("/{id}")
	public DonHangDto findById(@PathVariable("id") Long id) {
		return donHangService.findById(id);
	}

	@GetMapping
	public List<DonHangDto> findAll() {
		return donHangService.findAll();
	}

	@PutMapping
	public int update(@RequestBody DonHangDto donHangDto) {
		return donHangService.update(donHangDto);
	}

	@DeleteMapping("/{id}")
	public int deleteById(@PathVariable("id") Long id) {
		return donHangService.deleteById(id);
	}
}
