package com.tvhung.quanlycang.dao;

import java.util.List;

import com.tvhung.quanlycang.model.PhuongXa;

public interface PhuongXaDao extends GenericDao<PhuongXa, Long> {
	List<PhuongXa> findByIdQuanHuyen(Long idQuanHuyen);
}
