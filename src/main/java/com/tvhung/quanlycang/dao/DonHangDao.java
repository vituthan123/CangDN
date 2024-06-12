package com.tvhung.quanlycang.dao;

import com.tvhung.quanlycang.model.DonHang;

public interface DonHangDao extends GenericDao<DonHang, Long> {
	long findLastInsertId();
}
