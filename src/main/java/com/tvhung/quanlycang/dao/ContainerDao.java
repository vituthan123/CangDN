package com.tvhung.quanlycang.dao;

import java.util.List;

import com.tvhung.quanlycang.model.Container;

public interface ContainerDao extends GenericDao<Container, Long> {
	List<Container> findEmptyContainers();
}
