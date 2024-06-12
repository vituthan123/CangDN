package com.tvhung.quanlycang.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tvhung.quanlycang.dao.DonHangDtoDao;
import com.tvhung.quanlycang.dto.DonHangDto;
import com.tvhung.quanlycang.mapper.DonHangDtoMapper;

@Repository
public class DonHangDtoDaoImpl extends BaseDao implements DonHangDtoDao {
	@Override
	public DonHangDto findById(Long id) {
		// TODO Auto-generated method stub
		String sql = "SELECT dh.*, SUM(ctdh.the_tich) AS the_tich FROM don_hang dh JOIN chi_tiet_don_hang ctdh ON dh.id = ctdh.id_don_hang WHERE dh.id = ? GROUP BY dh.id, dh.id_khach_hang, dh.trang_thai, dh.ngay_tao, dh.trong_luong, dh.ten_nguoi_nhan, dh.sdt_nguoi_nhan, dh.id_xa_nguoi_nhan, dh.dia_chi_nguoi_nhan, dh.mo_ta";
		return jdbcTemplate.queryForObject(sql, new Object[] { id }, new DonHangDtoMapper());
	}

	@Override
	public List<DonHangDto> findAll() {
		// TODO Auto-generated method stub
		String sql = "SELECT dh.*, SUM(ctdh.the_tich) AS the_tich FROM don_hang dh JOIN chi_tiet_don_hang ctdh ON dh.id = ctdh.id_don_hang GROUP BY dh.id, dh.id_khach_hang, dh.trang_thai, dh.ngay_tao, dh.trong_luong, dh.ten_nguoi_nhan, dh.sdt_nguoi_nhan, dh.id_xa_nguoi_nhan, dh.dia_chi_nguoi_nhan, dh.mo_ta";
		return jdbcTemplate.query(sql, new DonHangDtoMapper());
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		String sql = "SELECT COUNT(*) FROM don_hang WHERE id = ?";
		long count = jdbcTemplate.queryForObject(sql, new Object[] { id }, Long.class);
		return count > 0;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		String sql = "SELECT COUNT(*) FROM don_hang";
		return jdbcTemplate.queryForObject(sql, new Object[] {}, Long.class);
	}

}
