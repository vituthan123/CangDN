package com.tvhung.quanlycang.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import com.tvhung.quanlycang.dto.LichTrinhDto;

public class LichTrinhDtoMapper implements RowMapper<LichTrinhDto> {
//	private long id;
//	private long idTau;
//	private String cangXuatPhat;
//	private String cangDich;
//	private LocalDateTime thoiGianBatDau;
	@Override
	@Nullable
	public LichTrinhDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		LichTrinhDto lichTrinhDto = new LichTrinhDto();
		lichTrinhDto.setId(rs.getLong("id"));
		lichTrinhDto.setIdTau(rs.getLong("id_tau"));
		lichTrinhDto.setCangXuatPhat(rs.getString("cang_xuat_phat"));
		lichTrinhDto.setCangDich(rs.getString("cang_dich"));
		lichTrinhDto.setThoiGianBatDau(rs.getObject("thoi_gian_bat_dau", java.time.LocalDateTime.class));
		return lichTrinhDto;
	}
}
