package com.tvhung.quanlycang.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tvhung.quanlycang.dao.TauDao;
import com.tvhung.quanlycang.mapper.TauMapper;
import com.tvhung.quanlycang.model.Tau;

@Repository
public class TauDaoImpl extends BaseDao implements TauDao {
//	CREATE TABLE `tau` (
//	  `id` bigint(20) NOT NULL,
//	  `hang_tau` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
//	  `suc_chua` double NOT NULL
//	) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;
	@Override
	public int insert(Tau model) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO tau(hang_tau, suc_chua) VALUES(?, ?)";
		return jdbcTemplate.update(sql, new Object[] { model.getHangTau(), model.getSucChua() });
	}

	@Override
	public Tau findById(Long id) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM tau WHERE id = ?";
		return jdbcTemplate.queryForObject(sql, new Object[] { id }, new TauMapper());
	}

	@Override
	public List<Tau> findAll() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM tau";
		return jdbcTemplate.query(sql, new TauMapper());
	}

	@Override
	public int update(Tau model) {
		// TODO Auto-generated method stub
		String sql = "UPDATE tau SET hang_tau = ?, suc_chua = ? WHERE id = ?";
		return jdbcTemplate.update(sql, new Object[] { model.getHangTau(), model.getSucChua(), model.getId() });
	}

	@Override
	public int deleteById(Long id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM tau WHERE id = ?";
		return jdbcTemplate.update(sql, new Object[] { id });
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		String sql = "SELECT COUNT(*) FROM tau WHERE id = ?";
		long count = jdbcTemplate.queryForObject(sql, new Object[] { id }, Long.class);
		return count > 0;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		String sql = "SELECT COUNT(*) FROM tau";
		return jdbcTemplate.queryForObject(sql, new Object[] {}, Long.class);
	}

}
