package com.tvhung.quanlycang.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tvhung.quanlycang.dao.LichTrinhDao;
import com.tvhung.quanlycang.mapper.LichTrinhMapper;
import com.tvhung.quanlycang.model.LichTrinh;

@Repository
public class LichTrinhDaoImpl extends BaseDao implements LichTrinhDao {
//	CREATE TABLE `lich_trinh` (
//	  `id` bigint(20) NOT NULL,
//	  `id_tau` bigint(20) NOT NULL,
//	  `id_nhan_vien_tau` bigint(20) NOT NULL,
//	  `id_nhan_vien_cang` bigint(20) NOT NULL,
//	  `thoi_gian_bat_dau` datetime NOT NULL,
//	  `id_cang_xuat_phat` bigint(20) NOT NULL,
//	  `id_cang_dich` bigint(20) NOT NULL
//	) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;
	@Override
	public int insert(LichTrinh model) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO lich_trinh(id_tau, id_nhan_vien_tau, id_nhan_vien_cang, thoi_gian_bat_dau, id_cang_xuat_phat, id_cang_dich) VALUES(?, ?, ?, ?, ?, ?)";
		return jdbcTemplate.update(sql,
				new Object[] { model.getIdTau(), model.getIdNhanVienTau(), model.getIdNhanVienCang(),
						model.getThoiGianBatDau(), model.getIdCangXuatPhat(), model.getIdCangDich() });
	}

	@Override
	public LichTrinh findById(Long id) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM lich_trinh WHERE id = ?";
		return jdbcTemplate.queryForObject(sql, new Object[] { id }, new LichTrinhMapper());
	}

	@Override
	public List<LichTrinh> findAll() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM lich_trinh";
		return jdbcTemplate.query(sql, new LichTrinhMapper());
	}

	@Override
	public int update(LichTrinh model) {
		// TODO Auto-generated method stub
		String sql = "UPDATE lich_trinh SET id_tau = ?, id_nhan_vien_tau = ?, id_nhan_vien_cang = ?, thoi_gian_bat_dau = ?, id_cang_xuat_phat = ?, id_cang_dich = ? WHERE id = ?";
		return jdbcTemplate.update(sql,
				new Object[] { model.getIdTau(), model.getIdNhanVienTau(), model.getIdNhanVienCang(),
						model.getThoiGianBatDau(), model.getIdCangXuatPhat(), model.getIdCangDich(), model.getId() });
	}

	@Override
	public int deleteById(Long id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM lich_trinh WHERE id = ?";
		return jdbcTemplate.update(sql, new Object[] { id });
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		String sql = "SELECT COUNT(*) FROM lich_trinh WHERE id = ?";
		long count = jdbcTemplate.queryForObject(sql, new Object[] { id }, Long.class);
		return count > 0;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		String sql = "SELECT COUNT(*) FROM lich_trinh";
		return jdbcTemplate.queryForObject(sql, new Object[] {}, Long.class);
	}

}
