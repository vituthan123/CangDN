package com.tvhung.quanlycang.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tvhung.quanlycang.dao.KhachHangDao;
import com.tvhung.quanlycang.mapper.KhachHangMapper;
import com.tvhung.quanlycang.model.KhachHang;

@Repository
public class KhachHangDaoImpl extends BaseDao implements KhachHangDao {
//	CREATE TABLE `khach_hang` (
//	  `id` bigint(20) NOT NULL,
//	  `ten` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
//	  `sdt` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
//	  `email` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
//	  `ngay_sinh` date NOT NULL,
//	  `id_xa` bigint(20) NOT NULL,
//	  `ma_so_thue` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
//	  `dia_chi` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
//	  `tai_khoan` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
//	  `mat_khau` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL
//	) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;
	@Override
	public int insert(KhachHang model) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO khach_hang(ten, sdt, email, ngay_sinh, id_xa, ma_so_thue, dia_chi, tai_khoan, mat_khau) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		return jdbcTemplate.update(sql,
				new Object[] { model.getTen(), model.getSdt(), model.getEmail(), model.getNgaySinh(), model.getIdXa(),
						model.getMaSoThue(), model.getDiaChi(), model.getTaiKhoan(), model.getMatKhau() });
	}

	@Override
	public KhachHang findById(Long id) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM khach_hang WHERE id = ?";
		return jdbcTemplate.queryForObject(sql, new Object[] { id }, new KhachHangMapper());
	}

	@Override
	public KhachHang findByTaiKhoanAndMatKhau(String taiKhoan, String matKhau) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM khach_hang WHERE tai_khoan = ? AND mat_khau = ?";
		return jdbcTemplate.queryForObject(sql, new Object[] { taiKhoan, matKhau }, new KhachHangMapper());
	}

	@Override
	public List<KhachHang> findAll() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM khach_hang";
		return jdbcTemplate.query(sql, new KhachHangMapper());
	}

	@Override
	public int update(KhachHang model) {
		// TODO Auto-generated method stub
		String sql = "UPDATE khach_hang SET ten = ?, sdt = ?, email = ?, ngay_sinh = ?, id_xa = ?, ma_so_thue = ?, dia_chi = ?, tai_khoan = ? WHERE id = ?";
		return jdbcTemplate.update(sql,
				new Object[] { model.getTen(), model.getSdt(), model.getEmail(), model.getNgaySinh(), model.getIdXa(),
						model.getMaSoThue(), model.getDiaChi(), model.getTaiKhoan(), model.getId() });
	}

	@Override
	public int updateMatKhau(KhachHang model) {
		// TODO Auto-generated method stub
		String sql = "UPDATE khach_hang SET mat_khau = ? WHERE id = ?";
		return jdbcTemplate.update(sql, new Object[] { model.getMatKhau(), model.getId() });
	}

	@Override
	public int deleteById(Long id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM khach_hang WHERE id = ?";
		return jdbcTemplate.update(sql, new Object[] { id });
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		String sql = "SELECT COUNT(*) FROM khach_hang WHERE id = ?";
		long count = jdbcTemplate.queryForObject(sql, new Object[] { id }, Long.class);
		return count > 0;
	}

	@Override
	public boolean existsByTaiKhoanAndMatKhau(String taiKhoan, String matKhau) {
		// TODO Auto-generated method stub
		String sql = "SELECT COUNT(*) FROM khach_hang WHERE tai_khoan = ? AND mat_khau = ?";
		long count = jdbcTemplate.queryForObject(sql, new Object[] { taiKhoan, matKhau }, Long.class);
		return count > 0;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		String sql = "SELECT COUNT(*) FROM khach_hang";
		return jdbcTemplate.queryForObject(sql, new Object[] {}, Long.class);
	}
}
