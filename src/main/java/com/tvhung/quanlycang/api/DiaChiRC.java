package com.tvhung.quanlycang.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tvhung.quanlycang.model.PhuongXa;
import com.tvhung.quanlycang.model.QuanHuyen;
import com.tvhung.quanlycang.model.TinhThanh;
import com.tvhung.quanlycang.service.DiaChiService;

@RestController
@RequestMapping("/api/dia-chi")
public class DiaChiRC {
	@Autowired
	private DiaChiService diaChiService;

	@GetMapping("/tinh-thanh/{idQuocGia}")
	public List<TinhThanh> findByIdQuocGia(@PathVariable("idQuocGia") Long idQuocGia) {
		return diaChiService.findByIdQuocGia(idQuocGia);
	}

	@GetMapping("quan-huyen/{idTinhThanh}")
	public List<QuanHuyen> findByIdTinhThanh(@PathVariable("idTinhThanh") Long idTinhThanh) {
		return diaChiService.findByIdTinhThanh(idTinhThanh);
	}

	@GetMapping("phuong-xa/{idQuanHuyen}")
	public List<PhuongXa> findByIdQuanHuyen(@PathVariable("idQuanHuyen") Long idQuanHuyen) {
		return diaChiService.findByIdQuanHuyen(idQuanHuyen);
	}
}
