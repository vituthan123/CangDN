package com.tvhung.quanlycang.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tvhung.quanlycang.dao.TinhThanhDao;
import com.tvhung.quanlycang.mapper.TinhThanhMapper;
import com.tvhung.quanlycang.model.TinhThanh;

@Repository
public class TinhThanhDaoImpl extends BaseDao implements TinhThanhDao {
//	CREATE TABLE `tinh_thanh` (
//	  `id` bigint(20) NOT NULL,
//	  `id_quoc_gia` bigint(20) NOT NULL,
//	  `ten` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL
//	) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;
	@Override
	public int insert(TinhThanh model) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO tinh_thanh(id_quoc_gia, ten) VALUES(?, ?)";
		return jdbcTemplate.update(sql, new Object[] { model.getIdQuocGia(), model.getTen() });
	}

	@Override
	public TinhThanh findById(Long id) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM tinh_thanh WHERE id = ?";
		return jdbcTemplate.queryForObject(sql, new Object[] { id }, new TinhThanhMapper());
	}

	@Override
	public List<TinhThanh> findByIdQuocGia(Long idQuocGia) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM tinh_thanh WHERE id_quoc_gia = ?";
		return jdbcTemplate.query(sql, new Object[] { idQuocGia }, new TinhThanhMapper());
	}

	@Override
	public List<TinhThanh> findAll() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM tinh_thanh";
		return jdbcTemplate.query(sql, new TinhThanhMapper());
	}

	@Override
	public int update(TinhThanh model) {
		// TODO Auto-generated method stub
		String sql = "UPDATE tinh_thanh SET id_quoc_gia = ?, ten = ? WHERE id = ?";
		return jdbcTemplate.update(sql, new Object[] { model.getIdQuocGia(), model.getTen(), model.getId() });
	}

	@Override
	public int deleteById(Long id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM tinh_thanh WHERE id = ?";
		return jdbcTemplate.update(sql, new Object[] { id });
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		String sql = "SELECT COUNT(*) FROM tinh_thanh WHERE id = ?";
		long count = jdbcTemplate.queryForObject(sql, new Object[] { id }, Long.class);
		return count > 0;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		String sql = "SELECT COUNT(*) FROM tinh_thanh";
		return jdbcTemplate.queryForObject(sql, new Object[] {}, Long.class);
	}
}
