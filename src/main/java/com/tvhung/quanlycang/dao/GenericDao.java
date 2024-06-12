package com.tvhung.quanlycang.dao;

import java.util.List;

public interface GenericDao<T, ID> {
	int insert(T model);

	T findById(ID id);

	List<T> findAll();

	int update(T model);

	int deleteById(ID id);

	boolean existsById(ID id);

	long count();
}