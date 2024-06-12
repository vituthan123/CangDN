package com.tvhung.quanlycang.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tvhung.quanlycang.dao.LoaiContainerDao;
import com.tvhung.quanlycang.mapper.LoaiContainerMapper;
import com.tvhung.quanlycang.model.LoaiContainer;

@Repository
public class LoaiContainerDaoImpl extends BaseDao implements LoaiContainerDao {
//	CREATE TABLE `loai_container` (
//	  `id` bigint(20) NOT NULL,
//	  `ten` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL
//	) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;
	@Override
	public int insert(LoaiContainer model) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO loai_container(ten) VALUES(?)";
		return jdbcTemplate.update(sql, new Object[] { model.getTen() });
	}

	@Override
	public LoaiContainer findById(Long id) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM loai_container WHERE id = ?";
		return jdbcTemplate.queryForObject(sql, new Object[] { id }, new LoaiContainerMapper());
	}

	@Override
	public List<LoaiContainer> findAll() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM loai_container";
		return jdbcTemplate.query(sql, new LoaiContainerMapper());
	}

	@Override
	public int update(LoaiContainer model) {
		// TODO Auto-generated method stub
		String sql = "UPDATE loai_container SET ten = ? WHERE id = ?";
		return jdbcTemplate.update(sql, new Object[] { model.getTen(), model.getId() });
	}

	@Override
	public int deleteById(Long id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM loai_container WHERE id = ?";
		return jdbcTemplate.update(sql, new Object[] { id });
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		String sql = "SELECT COUNT(*) FROM loai_container WHERE id = ?";
		long count = jdbcTemplate.queryForObject(sql, new Object[] { id }, Long.class);
		return count > 0;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		String sql = "SELECT COUNT(*) FROM loai_container";
		return jdbcTemplate.queryForObject(sql, new Object[] {}, Long.class);
	}
}
