package com.tvhung.quanlycang.model;

public class Container {
//	CREATE TABLE `container` (
//			  `id` bigint(20) NOT NULL,
//			  `id_loai_container` bigint(20) NOT NULL,
//			  `suc_chua` double NOT NULL
//			) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;
	private long id;
	private long idLoaiContainer;
	private double sucChua;

	public Container() {
		super();
	}

	public Container(long id, long idLoaiContainer, double sucChua) {
		super();
		this.id = id;
		this.idLoaiContainer = idLoaiContainer;
		this.sucChua = sucChua;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getIdLoaiContainer() {
		return idLoaiContainer;
	}

	public void setIdLoaiContainer(long idLoaiContainer) {
		this.idLoaiContainer = idLoaiContainer;
	}

	public double getSucChua() {
		return sucChua;
	}

	public void setSucChua(double sucChua) {
		this.sucChua = sucChua;
	}
}
