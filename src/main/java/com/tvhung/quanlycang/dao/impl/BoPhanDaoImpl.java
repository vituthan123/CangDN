package com.tvhung.quanlycang.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tvhung.quanlycang.dao.BoPhanDao;
import com.tvhung.quanlycang.mapper.BoPhanMapper;
import com.tvhung.quanlycang.model.BoPhan;

@Repository
public class BoPhanDaoImpl extends BaseDao implements BoPhanDao {
//	CREATE TABLE `bo_phan` (
//	  `id` bigint(20) NOT NULL,
//	  `ten` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL
//	) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;
	@Override
	public int insert(BoPhan model) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO bo_phan(ten) VALUES(?)";
		return jdbcTemplate.update(sql, new Object[] { model.getTen() });
	}

	@Override
	public BoPhan findById(Long id) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM bo_phan WHERE id = ?";
		return jdbcTemplate.queryForObject(sql, new Object[] { id }, new BoPhanMapper());
	}

	@Override
	public List<BoPhan> findAll() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM bo_phan";
		return jdbcTemplate.query(sql, new BoPhanMapper());
	}

	@Override
	public int update(BoPhan model) {
		// TODO Auto-generated method stub
		String sql = "UPDATE bo_phan SET ten = ? WHERE id = ?";
		return jdbcTemplate.update(sql, new Object[] { model.getTen(), model.getId() });
	}

	@Override
	public int deleteById(Long id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM bo_phan WHERE id = ?";
		return jdbcTemplate.update(sql, new Object[] { id });
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		String sql = "SELECT COUNT(*) FROM bo_phan WHERE id = ?";
		long count = jdbcTemplate.queryForObject(sql, new Object[] { id }, Long.class);
		return count > 0;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		String sql = "SELECT COUNT(*) FROM bo_phan";
		return jdbcTemplate.queryForObject(sql, new Object[] {}, Long.class);
	}

}
