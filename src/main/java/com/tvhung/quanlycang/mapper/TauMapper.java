package com.tvhung.quanlycang.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import com.tvhung.quanlycang.model.Tau;

public class TauMapper implements RowMapper<Tau> {

	@Override
	@Nullable
	public Tau mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Tau tau = new Tau();
		tau.setId(rs.getLong("id"));
		tau.setHangTau(rs.getString("hang_tau"));
		tau.setSucChua(rs.getDouble("suc_chua"));
		return tau;
	}

}
