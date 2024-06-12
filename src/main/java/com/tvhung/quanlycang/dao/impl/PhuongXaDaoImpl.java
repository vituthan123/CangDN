package com.tvhung.quanlycang.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tvhung.quanlycang.dao.PhuongXaDao;
import com.tvhung.quanlycang.mapper.PhuongXaMapper;
import com.tvhung.quanlycang.model.PhuongXa;

@Repository
public class PhuongXaDaoImpl extends BaseDao implements PhuongXaDao {
//	CREATE TABLE `phuong_xa` (
//	  `id` bigint(20) NOT NULL,
//	  `id_quan_huyen` bigint(20) NOT NULL,
//	  `ten` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL
//	) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;
	@Override
	public int insert(PhuongXa model) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO phuong_xa(id_quan_huyen, ten) VALUES(?, ?)";
		return jdbcTemplate.update(sql, new Object[] { model.getIdQuanHuyen(), model.getTen() });
	}

	@Override
	public PhuongXa findById(Long id) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM phuong_xa WHERE id = ?";
		return jdbcTemplate.queryForObject(sql, new Object[] { id }, new PhuongXaMapper());
	}

	@Override
	public List<PhuongXa> findByIdQuanHuyen(Long idQuanHuyen) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM phuong_xa WHERE id_quan_huyen = ?";
		return jdbcTemplate.query(sql, new Object[] { idQuanHuyen }, new PhuongXaMapper());
	}

	@Override
	public List<PhuongXa> findAll() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM phuong_xa";
		return jdbcTemplate.query(sql, new PhuongXaMapper());
	}

	@Override
	public int update(PhuongXa model) {
		// TODO Auto-generated method stub
		String sql = "UPDATE phuong_xa SET id_quan_huyen = ?, ten = ? WHERE id = ?";
		return jdbcTemplate.update(sql, new Object[] { model.getIdQuanHuyen(), model.getTen(), model.getId() });
	}

	@Override
	public int deleteById(Long id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM phuong_xa WHERE id = ?";
		return jdbcTemplate.update(sql, new Object[] { id });
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		String sql = "SELECT COUNT(*) FROM phuong_xa WHERE id = ?";
		long count = jdbcTemplate.queryForObject(sql, new Object[] { id }, Long.class);
		return count > 0;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		String sql = "SELECT COUNT(*) FROM phuong_xa";
		return jdbcTemplate.queryForObject(sql, new Object[] {}, Long.class);
	}
}
