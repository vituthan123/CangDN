package com.tvhung.quanlycang.model;

public class PhuongXa {
//	CREATE TABLE `phuong_xa` (
//			  `id` bigint(20) NOT NULL,
//			  `id_quan_huyen` bigint(20) NOT NULL,
//			  `ten` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL
//			) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;
	private long id;
	private long idQuanHuyen;
	private String ten;

	public PhuongXa() {
		super();
	}

	public PhuongXa(long id, long idQuanHuyen, String ten) {
		super();
		this.id = id;
		this.idQuanHuyen = idQuanHuyen;
		this.ten = ten;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getIdQuanHuyen() {
		return idQuanHuyen;
	}

	public void setIdQuanHuyen(long idQuanHuyen) {
		this.idQuanHuyen = idQuanHuyen;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}
}
