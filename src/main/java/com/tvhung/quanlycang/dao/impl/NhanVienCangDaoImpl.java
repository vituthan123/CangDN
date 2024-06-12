package com.tvhung.quanlycang.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tvhung.quanlycang.dao.NhanVienCangDao;
import com.tvhung.quanlycang.mapper.NhanVienCangMapper;
import com.tvhung.quanlycang.model.NhanVienCang;

@Repository
public class NhanVienCangDaoImpl extends BaseDao implements NhanVienCangDao {
//	CREATE TABLE `nhan_vien_cang` (
//	  `id` bigint(20) NOT NULL,
//	  `id_bo_phan` bigint(20) NOT NULL,
//	  `ten` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
//	  `sdt` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
//	  `email` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
//	  `tai_khoan` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
//	  `mat_khau` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL
//	) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;
	@Override
	public int insert(NhanVienCang model) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO nhan_vien_cang(id_bo_phan, ten, sdt, email, tai_khoan, mat_khau) VALUES(?, ?, ?, ?, ?, ?)";
		return jdbcTemplate.update(sql, new Object[] { model.getIdBoPhan(), model.getTen(), model.getSdt(),
				model.getEmail(), model.getTaiKhoan(), model.getMatKhau() });
	}

	@Override
	public NhanVienCang findById(Long id) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM nhan_vien_cang WHERE id = ?";
		return jdbcTemplate.queryForObject(sql, new Object[] { id }, new NhanVienCangMapper());
	}

	@Override
	public NhanVienCang findByTaiKhoanAndMatKhau(String taiKhoan, String matKhau) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM nhan_vien_cang WHERE tai_khoan = ? AND mat_khau = ?";
		return jdbcTemplate.queryForObject(sql, new Object[] { taiKhoan, matKhau }, new NhanVienCangMapper());
	}

	@Override
	public List<NhanVienCang> findAll() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM nhan_vien_cang";
		return jdbcTemplate.query(sql, new NhanVienCangMapper());
	}

	@Override
	public int update(NhanVienCang model) {
		// TODO Auto-generated method stub
		String sql = "UPDATE nhan_vien_cang SET id_bo_phan = ?, ten = ?, sdt = ?, email = ?, tai_khoan = ? WHERE id = ?";
		return jdbcTemplate.update(sql, new Object[] { model.getIdBoPhan(), model.getTen(), model.getSdt(),
				model.getEmail(), model.getTaiKhoan(), model.getId() });
	}

	@Override
	public int updateMatKhau(NhanVienCang model) {
		// TODO Auto-generated method stub
		String sql = "UPDATE nhan_vien_cang SET mat_khau = ? WHERE id = ?";
		return jdbcTemplate.update(sql, new Object[] { model.getMatKhau(), model.getId() });
	}

	@Override
	public int deleteById(Long id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM nhan_vien_cang WHERE id = ?";
		return jdbcTemplate.update(sql, new Object[] { id });
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		String sql = "SELECT COUNT(*) FROM nhan_vien_cang WHERE id = ?";
		long count = jdbcTemplate.queryForObject(sql, new Object[] { id }, Long.class);
		return count > 0;
	}

	@Override
	public boolean existsByTaiKhoanAndMatKhau(String taiKhoan, String matKhau) {
		// TODO Auto-generated method stub
		String sql = "SELECT COUNT(*) FROM nhan_vien_cang WHERE tai_khoan = ? AND mat_khau = ?";
		long count = jdbcTemplate.queryForObject(sql, new Object[] { taiKhoan, matKhau }, Long.class);
		return count > 0;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		String sql = "SELECT COUNT(*) FROM nhan_vien_cang";
		return jdbcTemplate.queryForObject(sql, new Object[] {}, Long.class);
	}

}
