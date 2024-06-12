package com.tvhung.quanlycang.model;

public class NhanVienTau extends Account {
//	CREATE TABLE `nhan_vien_tau` (
//			  `id` bigint(20) NOT NULL,
//			  `id_tau` bigint(20) NOT NULL,
//			  `ten` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
//			  `sdt` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
//			  `email` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
//			  `tai_khoan` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
//			  `mat_khau` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL
//			) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;
	private long id;
	private long idTau;
	private String ten;
	private String sdt;
	private String email;

	public NhanVienTau() {
		super();
	}

	public NhanVienTau(long id, long idTau, String ten, String sdt, String email) {
		super();
		this.id = id;
		this.idTau = idTau;
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

	public long getIdTau() {
		return idTau;
	}

	public void setIdTau(long idTau) {
		this.idTau = idTau;
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
