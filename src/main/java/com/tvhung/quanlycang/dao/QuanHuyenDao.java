package com.tvhung.quanlycang.dao;

import java.util.List;

import com.tvhung.quanlycang.model.QuanHuyen;

public interface QuanHuyenDao extends GenericDao<QuanHuyen, Long> {
	List<QuanHuyen> findByIdTinhThanh(Long idTinhThanh);
}
