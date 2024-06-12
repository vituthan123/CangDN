package com.tvhung.quanlycang.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import com.tvhung.quanlycang.model.LichTrinh;

public class LichTrinhMapper implements RowMapper<LichTrinh> {

	@Override
	@Nullable
	public LichTrinh mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		LichTrinh lichTrinh = new LichTrinh();
		lichTrinh.setId(rs.getLong("id"));
		lichTrinh.setIdTau(rs.getLong("id_tau"));
		lichTrinh.setIdNhanVienTau(rs.getLong("id_nhan_vien_tau"));
		lichTrinh.setIdNhanVienCang(rs.getLong("id_nhan_vien_cang"));
		lichTrinh.setThoiGianBatDau(rs.getObject("thoi_gian_bat_dau", LocalDateTime.class));
		lichTrinh.setIdCangXuatPhat(rs.getLong("id_cang_xuat_phat"));
		lichTrinh.setIdCangDich(rs.getLong("id_cang_dich"));
		return lichTrinh;
	}

}
