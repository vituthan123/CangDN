package com.tvhung.quanlycang.model;

public class QuanHuyen {
//	CREATE TABLE `quan_huyen` (
//			  `id` bigint(20) NOT NULL,
//			  `id_tinh_thanh` bigint(20) NOT NULL,
//			  `ten` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL
//			) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;
	private long id;
	private long idTinhThanh;
	private String ten;

	public QuanHuyen() {
		super();
	}

	public QuanHuyen(long id, long idTinhThanh, String ten) {
		super();
		this.id = id;
		this.idTinhThanh = idTinhThanh;
		this.ten = ten;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getIdTinhThanh() {
		return idTinhThanh;
	}

	public void setIdTinhThanh(long idTinhThanh) {
		this.idTinhThanh = idTinhThanh;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}
}
