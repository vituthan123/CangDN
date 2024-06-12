package com.tvhung.quanlycang.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tvhung.quanlycang.dao.ContainerDao;
import com.tvhung.quanlycang.mapper.ContainerMapper;
import com.tvhung.quanlycang.model.Container;

@Repository
public class ContainerDaoImpl extends BaseDao implements ContainerDao {
//	CREATE TABLE `container` (
//	  `id` bigint(20) NOT NULL,
//	  `id_loai_container` bigint(20) NOT NULL,
//	  `suc_chua` double NOT NULL
//	) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;
	@Override
	public int insert(Container model) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO container(id_loai_container, suc_chua) VALUES(?, ?)";
		return jdbcTemplate.update(sql, new Object[] { model.getIdLoaiContainer(), model.getSucChua() });
	}

	@Override
	public Container findById(Long id) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM container WHERE id = ?";
		return jdbcTemplate.queryForObject(sql, new Object[] { id }, new ContainerMapper());
	}

	@Override
	public List<Container> findEmptyContainers() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM container WHERE id NOT IN (SELECT DISTINCT id_container FROM don_hang dh JOIN chi_tiet_don_hang ctdh ON dh.id = ctdh.id_don_hang WHERE dh.trang_thai IN (0, 1, 2))";
		return jdbcTemplate.query(sql, new ContainerMapper());
	}

	@Override
	public List<Container> findAll() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM container";
		return jdbcTemplate.query(sql, new ContainerMapper());
	}

	@Override
	public int update(Container model) {
		// TODO Auto-generated method stub
		String sql = "UPDATE container SET id_loai_container = ?, suc_chua = ? WHERE id = ?";
		return jdbcTemplate.update(sql, new Object[] { model.getIdLoaiContainer(), model.getSucChua(), model.getId() });
	}

	@Override
	public int deleteById(Long id) {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM container WHERE id = ?";
		return jdbcTemplate.update(sql, new Object[] { id });
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		String sql = "SELECT COUNT(*) FROM container WHERE id = ?";
		long count = jdbcTemplate.queryForObject(sql, new Object[] { id }, Long.class);
		return count > 0;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		String sql = "SELECT COUNT(*) FROM container";
		return jdbcTemplate.queryForObject(sql, new Object[] {}, Long.class);
	}
}
