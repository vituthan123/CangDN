package com.tvhung.quanlycang.dao;

import java.util.List;

import com.tvhung.quanlycang.model.TinhThanh;

public interface TinhThanhDao extends GenericDao<TinhThanh, Long> {
	List<TinhThanh> findByIdQuocGia(Long idQuocGia);
}
