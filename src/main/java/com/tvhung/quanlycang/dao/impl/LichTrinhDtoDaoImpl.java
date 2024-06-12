package com.tvhung.quanlycang.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tvhung.quanlycang.dao.LichTrinhDtoDao;
import com.tvhung.quanlycang.dto.LichTrinhDto;
import com.tvhung.quanlycang.mapper.LichTrinhDtoMapper;

@Repository
public class LichTrinhDtoDaoImpl extends BaseDao implements LichTrinhDtoDao {

	@Override
	public List<LichTrinhDto> findAll() {
		// TODO Auto-generated method stub
		String sql = "SELECT id, id_tau, (SELECT ten FROM cang WHERE id = id_cang_xuat_phat) AS cang_xuat_phat, (SELECT ten FROM cang WHERE id = id_cang_dich) AS cang_dich, thoi_gian_bat_dau FROM lich_trinh";
		return jdbcTemplate.query(sql, new LichTrinhDtoMapper());
	}
}
