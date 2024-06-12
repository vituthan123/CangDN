package com.tvhung.quanlycang.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tvhung.quanlycang.dao.DonHangDao;
import com.tvhung.quanlycang.mapper.DonHangMapper;
import com.tvhung.quanlycang.model.DonHang;

@Repository
public class DonHangDaoImpl extends BaseDao implements DonHangDao {
//	CREATE TABLE `don_hang` (
//	  `id` bigint(20) NOT NULL,
//	  `id_khach_hang` bigint(20) NOT NULL,
//	  `trang_thai` int(11) NOT NULL,
//	  `ngay_tao` datetime NOT NULL,
//	  `trong_luong` double NOT NULL,
//	  `ten_nguoi_nhan` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
//	  `sdt_nguoi_nhan` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
//	  `id_xa_nguoi_nhan` bigint(20) NOT NULL,
//	  `dia_chi_nguoi_nhan` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
//	  `mo_ta` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL
//	) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;
	@Override
	public int insert(DonHang model) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO don_hang(id_khach_hang, trang_thai, ngay_tao, trong_luong, ten_nguoi_nhan, sdt_nguoi_nhan, id_xa_nguoi_nhan, dia_chi_nguoi_nhan, mo_ta) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		return jdbcTemplate.update(sql,
				new Object[] { model.getIdKhachHang(), model.getTrangThai(), model.getNgayTao(), model.getTrongLuong(),
						model.getTenNguoiNhan(), model.getSdtNguoiNhan(), model.getIdXaNguoiNhan(),
						model.getDiaChiNguoiNhan(), model.getMoTa() });
	}

	@Override
	public DonHang findById(Long id) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM don_hang WHERE id = ?";
		return jdbcTemplate.queryForObject(sql, new Object[] { id }, new DonHangMapper());
	}

	@Override
	public List<DonHang> findAll() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM don_hang";
		return jdbcTemplate.query(sql, new DonHangMapper());
	}

	@Override
	public int update(DonHang model) {
		// TODO Auto-generated method stub
		String sql = "UPDATE don_hang SET id_khach_hang = ?, trang_thai = ?, ngay_tao = ?, trong_luong = ?, ten_nguoi_nhan = ?, sdt_nguoi_nhan = ?, id_xa_nguoi_nhan = ?, dia_chi_nguoi_nhan = ?, mo_ta = ? WHERE id = ?";
		return jdbcTemplate.update(sql,
				new Object[] { model.getIdKhachHang(), model.getTrangThai(), model.getNgayTao(), model.getTrongLuong(),
						model.getTenNguoiNhan(), model.getSdtNguoiNhan(), model.getIdXaNguoiNhan(),
						model.getDiaChiNguoiNhan(), model.getMoTa(), model.getId() });
	}

	@Override
	public int deleteById(Long id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM don_hang WHERE id = ?";
		return jdbcTemplate.update(sql, new Object[] { id });
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		String sql = "SELECT COUNT(*) FROM don_hang WHERE id = ?";
		long count = jdbcTemplate.queryForObject(sql, new Object[] { id }, Long.class);
		return count > 0;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		String sql = "SELECT COUNT(*) FROM don_hang";
		return jdbcTemplate.queryForObject(sql, new Object[] {}, Long.class);
	}

	@Override
	public long findLastInsertId() {
		// TODO Auto-generated method stub
		String sql = "SELECT MAX(id) FROM don_hang";
		return jdbcTemplate.queryForObject(sql, new Object[] {}, Long.class);
	}

}
