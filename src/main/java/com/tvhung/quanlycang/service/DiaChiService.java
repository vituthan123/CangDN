package com.tvhung.quanlycang.service;

import java.util.List;

import com.tvhung.quanlycang.model.PhuongXa;
import com.tvhung.quanlycang.model.QuanHuyen;
import com.tvhung.quanlycang.model.TinhThanh;

public interface DiaChiService {
	List<TinhThanh> findByIdQuocGia(Long idQuocGia);

	List<QuanHuyen> findByIdTinhThanh(Long idTinhThanh);

	List<PhuongXa> findByIdQuanHuyen(Long idQuanHuyen);
}
