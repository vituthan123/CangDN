package com.tvhung.quanlycang.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tvhung.quanlycang.dao.QuanHuyenDao;
import com.tvhung.quanlycang.mapper.QuanHuyenMapper;
import com.tvhung.quanlycang.model.QuanHuyen;

@Repository
public class QuanHuyenDaoImpl extends BaseDao implements QuanHuyenDao {
//	CREATE TABLE `quan_huyen` (
//	  `id` bigint(20) NOT NULL,
//	  `id_tinh_thanh` bigint(20) NOT NULL,
//	  `ten` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL
//	) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;
	@Override
	public int insert(QuanHuyen model) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO quan_huyen(id_tinh_thanh, ten) VALUES(?, ?)";
		return jdbcTemplate.update(sql, new Object[] { model.getIdTinhThanh(), model.getTen() });
	}

	@Override
	public QuanHuyen findById(Long id) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM quan_huyen WHERE id = ?";
		return jdbcTemplate.queryForObject(sql, new Object[] { id }, new QuanHuyenMapper());
	}

	@Override
	public List<QuanHuyen> findByIdTinhThanh(Long idTinhThanh) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM quan_huyen WHERE id_tinh_thanh = ?";
		return jdbcTemplate.query(sql, new Object[] { idTinhThanh }, new QuanHuyenMapper());
	}

	@Override
	public List<QuanHuyen> findAll() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM quan_huyen";
		return jdbcTemplate.query(sql, new QuanHuyenMapper());
	}

	@Override
	public int update(QuanHuyen model) {
		// TODO Auto-generated method stub
		String sql = "UPDATE quan_huyen SET id_tinh_thanh = ?, ten = ? WHERE id = ?";
		return jdbcTemplate.update(sql, new Object[] { model.getIdTinhThanh(), model.getTen(), model.getId() });
	}

	@Override
	public int deleteById(Long id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM quan_huyen WHERE id = ?";
		return jdbcTemplate.update(sql, new Object[] { id });
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		String sql = "SELECT COUNT(*) FROM quan_huyen WHERE id = ?";
		long count = jdbcTemplate.queryForObject(sql, new Object[] { id }, Long.class);
		return count > 0;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		String sql = "SELECT COUNT(*) FROM quan_huyen";
		return jdbcTemplate.queryForObject(sql, new Object[] {}, Long.class);
	}
}
