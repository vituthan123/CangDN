package com.tvhung.quanlycang.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import com.tvhung.quanlycang.model.BoPhan;

public class BoPhanMapper implements RowMapper<BoPhan> {

	@Override
	@Nullable
	public BoPhan mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		BoPhan boPhan = new BoPhan();
		boPhan.setId(rs.getLong("id"));
		boPhan.setTen(rs.getString("ten"));
		return boPhan;
	}
}