package com.tvhung.quanlycang.model;

import java.time.LocalDate;

public class KhachHang extends Account {
//	CREATE TABLE `khach_hang` (
//			  `id` bigint(20) NOT NULL,
//			  `ten` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
//			  `sdt` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
//			  `email` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
//			  `ngay_sinh` date NOT NULL,
//			  `id_xa` bigint(20) NOT NULL,
//			  `ma_so_thue` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
//			  `dia_chi` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
//			  `tai_khoan` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
//			  `mat_khau` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL
//			) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;
	private long id;
	private String ten;
	private String sdt;
	private String email;
	private LocalDate ngaySinh;
	private long idXa;
	private String maSoThue;
	private String diaChi;

	public KhachHang() {
		super();
	}

	public KhachHang(long id, String ten, String sdt, String email, LocalDate ngaySinh, long idXa, String maSoThue,
			String diaChi) {
		super();
		this.id = id;
		this.ten = ten;
		this.sdt = sdt;
		this.email = email;
		this.ngaySinh = ngaySinh;
		this.idXa = idXa;
		this.maSoThue = maSoThue;
		this.diaChi = diaChi;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public LocalDate getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(LocalDate ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public long getIdXa() {
		return idXa;
	}

	public void setIdXa(long idXa) {
		this.idXa = idXa;
	}

	public String getMaSoThue() {
		return maSoThue;
	}

	public void setMaSoThue(String maSoThue) {
		this.maSoThue = maSoThue;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
}
