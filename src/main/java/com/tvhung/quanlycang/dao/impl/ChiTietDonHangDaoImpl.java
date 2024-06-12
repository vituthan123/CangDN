package com.tvhung.quanlycang.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tvhung.quanlycang.dao.ChiTietDonHangDao;
import com.tvhung.quanlycang.mapper.ChiTietDonHangMapper;
import com.tvhung.quanlycang.model.ChiTietDonHang;

@Repository
public class ChiTietDonHangDaoImpl extends BaseDao implements ChiTietDonHangDao {
//	CREATE TABLE `chi_tiet_don_hang` (
//	  `id_don_hang` bigint(20) NOT NULL,
//	  `id_container` bigint(20) NOT NULL,
//	  `id_lich_trinh` bigint(20) NOT NULL,
//	  `the_tich` double NOT NULL
//	) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;
	@Override
	public int insert(ChiTietDonHang model) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO chi_tiet_don_hang(id_don_hang, id_container, id_lich_trinh, the_tich) VALUES(?, ?, ?, ?)";
		return jdbcTemplate.update(sql, new Object[] { model.getIdDonHang(), model.getIdContainer(),
				model.getIdLichTrinh(), model.getTheTich() });
	}

	@Override
	public ChiTietDonHang findByIds(Long idDonHang, Long idContainer) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM chi_tiet_don_hang WHERE id_don_hang = ? AND id_container = ?";
		return jdbcTemplate.queryForObject(sql, new Object[] { idDonHang, idContainer }, new ChiTietDonHangMapper());
	}

	@Override
	public List<ChiTietDonHang> findAll() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM chi_tiet_don_hang";
		return jdbcTemplate.query(sql, new ChiTietDonHangMapper());
	}

	@Override
	public int update(ChiTietDonHang model) {
		// TODO Auto-generated method stub
		String sql = "UPDATE chi_tiet_don_hang SET id_lich_trinh = ?, the_tich = ? WHERE id_don_hang = ? AND id_container = ?";
		return jdbcTemplate.update(sql, new Object[] { model.getIdLichTrinh(), model.getTheTich(), model.getIdDonHang(),
				model.getIdContainer() });
	}

	@Override
	public int deleteByIds(Long idDonHang, Long idContainer) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM chi_tiet_don_hang WHERE id_don_hang = ? AND id_container = ?";
		return jdbcTemplate.update(sql, new Object[] { idDonHang, idContainer });
	}

	@Override
	public int deleteByIdDonHang(Long idDonHang) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM chi_tiet_don_hang WHERE id_don_hang = ?";
		return jdbcTemplate.update(sql, new Object[] { idDonHang });
	}

	@Override
	public boolean existsByIds(Long idDonHang, Long idContainer) {
		// TODO Auto-generated method stub
		String sql = "SELECT COUNT(*) FROM chi_tiet_don_hang WHERE id_don_hang = ? AND id_container = ?";
		long count = jdbcTemplate.queryForObject(sql, new Object[] { idDonHang, idContainer }, Long.class);
		return count > 0;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		String sql = "SELECT COUNT(*) FROM chi_tiet_don_hang";
		return jdbcTemplate.queryForObject(sql, new Object[] {}, Long.class);
	}
}
