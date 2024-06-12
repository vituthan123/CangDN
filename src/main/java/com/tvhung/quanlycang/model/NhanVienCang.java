package com.tvhung.quanlycang.model;

public class NhanVienCang extends Account {
//	CREATE TABLE `nhan_vien_cang` (
//			  `id` bigint(20) NOT NULL,
//			  `id_bo_phan` bigint(20) NOT NULL,
//			  `ten` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
//			  `sdt` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
//			  `email` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
//			  `tai_khoan` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
//			  `mat_khau` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL
//			) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;
	private long id;
	private long idBoPhan;
	private String ten;
	private String sdt;
	private String email;

	public NhanVienCang() {
		super();
	}

	public NhanVienCang(long id, long idBoPhan, String ten, String sdt, String email) {
		super();
		this.id = id;
		this.idBoPhan = idBoPhan;
		this.ten = ten;
		this.sdt = sdt;
		this.email = email;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getIdBoPhan() {
		return idBoPhan;
	}

	public void setIdBoPhan(long idBoPhan) {
		this.idBoPhan = idBoPhan;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
