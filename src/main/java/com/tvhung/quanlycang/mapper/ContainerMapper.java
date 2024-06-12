package com.tvhung.quanlycang.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import com.tvhung.quanlycang.model.Container;

public class ContainerMapper implements RowMapper<Container> {

	@Override
	@Nullable
	public Container mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Container container = new Container();
		container.setId(rs.getLong("id"));
		container.setIdLoaiContainer(rs.getLong("id_loai_container"));
		container.setSucChua(rs.getDouble("suc_chua"));
		return container;
	}
}
