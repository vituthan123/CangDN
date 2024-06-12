package com.tvhung.quanlycang.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import com.tvhung.quanlycang.model.LoaiContainer;

public class LoaiContainerMapper implements RowMapper<LoaiContainer> {

	@Override
	@Nullable
	public LoaiContainer mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		LoaiContainer loaiContainer = new LoaiContainer();
		loaiContainer.setId(rs.getLong("id"));
		loaiContainer.setTen(rs.getString("ten"));
		return loaiContainer;
	}

}
