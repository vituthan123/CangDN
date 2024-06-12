package com.tvhung.quanlycang.model;

public class TinhThanh {
//	CREATE TABLE `tinh_thanh` (
//			  `id` bigint(20) NOT NULL,
//			  `id_quoc_gia` bigint(20) NOT NULL,
//			  `ten` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL
//			) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;
	private long id;
	private long idQuocGia;
	private String ten;

	public TinhThanh() {
		super();
	}

	public TinhThanh(long id, long idQuocGia, String ten) {
		super();
		this.id = id;
		this.idQuocGia = idQuocGia;
		this.ten = ten;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getIdQuocGia() {
		return idQuocGia;
	}

	public void setIdQuocGia(long idQuocGia) {
		this.idQuocGia = idQuocGia;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}
}
