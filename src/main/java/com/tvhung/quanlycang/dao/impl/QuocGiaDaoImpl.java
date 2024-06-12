package com.tvhung.quanlycang.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tvhung.quanlycang.dao.QuocGiaDao;
import com.tvhung.quanlycang.mapper.QuocGiaMapper;
import com.tvhung.quanlycang.model.QuocGia;

@Repository
public class QuocGiaDaoImpl extends BaseDao implements QuocGiaDao {
//	CREATE TABLE `quoc_gia` (
//	  `id` bigint(20) NOT NULL,
//	  `ten` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL
//	) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;
	@Override
	public int insert(QuocGia model) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO quoc_gia(ten) VALUES(?)";
		return jdbcTemplate.update(sql, new Object[] { model.getTen() });
	}

	@Override
	public QuocGia findById(Long id) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM quoc_gia WHERE id = ?";
		return jdbcTemplate.queryForObject(sql, new Object[] { id }, new QuocGiaMapper());
	}

	@Override
	public List<QuocGia> findAll() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM quoc_gia";
		return jdbcTemplate.query(sql, new QuocGiaMapper());
	}

	@Override
	public int update(QuocGia model) {
		// TODO Auto-generated method stub
		String sql = "UPDATE quoc_gia SET ten = ? WHERE id = ?";
		return jdbcTemplate.update(sql, new Object[] { model.getTen(), model.getId() });
	}

	@Override
	public int deleteById(Long id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM quoc_gia WHERE id = ?";
		return jdbcTemplate.update(sql, new Object[] { id });
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		String sql = "SELECT COUNT(*) FROM quoc_gia WHERE id = ?";
		long count = jdbcTemplate.queryForObject(sql, new Object[] { id }, Long.class);
		return count > 0;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		String sql = "SELECT COUNT(*) FROM quoc_gia";
		return jdbcTemplate.queryForObject(sql, new Object[] {}, Long.class);
	}

}
