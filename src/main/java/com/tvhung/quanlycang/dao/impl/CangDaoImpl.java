package com.tvhung.quanlycang.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tvhung.quanlycang.dao.CangDao;
import com.tvhung.quanlycang.mapper.CangMapper;
import com.tvhung.quanlycang.model.Cang;

@Repository
public class CangDaoImpl extends BaseDao implements CangDao {
//	CREATE TABLE `cang` (
//	  `id` bigint(20) NOT NULL,
//	  `ten` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL
//	) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;
	@Override
	public int insert(Cang model) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO cang(ten) VALUES(?)";
		return jdbcTemplate.update(sql, new Object[] { model.getTen() });
	}

	@Override
	public Cang findById(Long id) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM cang WHERE id = ?";
		return jdbcTemplate.queryForObject(sql, new Object[] { id }, new CangMapper());
	}

	@Override
	public List<Cang> findAll() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM cang";
		return jdbcTemplate.query(sql, new CangMapper());
	}

	@Override
	public int update(Cang model) {
		// TODO Auto-generated method stub
		String sql = "UPDATE cang SET ten = ? WHERE id = ?";
		return jdbcTemplate.update(sql, new Object[] { model.getTen(), model.getId() });
	}

	@Override
	public int deleteById(Long id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM cang WHERE id = ?";
		return jdbcTemplate.update(sql, new Object[] { id });
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		String sql = "SELECT COUNT(*) FROM cang WHERE id = ?";
		long count = jdbcTemplate.queryForObject(sql, new Object[] { id }, Long.class);
		return count > 0;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		String sql = "SELECT COUNT(*) FROM cang";
		return jdbcTemplate.queryForObject(sql, new Object[] {}, Long.class);
	}

}
