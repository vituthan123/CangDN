package com.tvhung.quanlycang.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tvhung.quanlycang.dao.ContainerDao;
import com.tvhung.quanlycang.model.Container;
import com.tvhung.quanlycang.service.ContainerService;

@Service
public class ContainerServiceImpl implements ContainerService {
	@Autowired
	private ContainerDao containerDao;

	@Override
	public List<Container> findAll() {
		// TODO Auto-generated method stub
		return containerDao.findAll();
	}
}
