package com.tvhung.quanlycang.model;

public class ChiTietDonHang {
//	CREATE TABLE `chi_tiet_don_hang` (
//			  `id_don_hang` bigint(20) NOT NULL,
//			  `id_container` bigint(20) NOT NULL,
//			  `id_lich_trinh` bigint(20) NOT NULL,
//			  `the_tich` double NOT NULL
//			) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;
	private long idDonHang;
	private long idContainer;
	private long idLichTrinh;
	private double theTich;

	public ChiTietDonHang() {
		super();
	}

	public ChiTietDonHang(long idDonHang, long idContainer, long idLichTrinh, double theTich) {
		super();
		this.idDonHang = idDonHang;
		this.idContainer = idContainer;
		this.idLichTrinh = idLichTrinh;
		this.theTich = theTich;
	}

	public long getIdDonHang() {
		return idDonHang;
	}

	public void setIdDonHang(long idDonHang) {
		this.idDonHang = idDonHang;
	}

	public long getIdContainer() {
		return idContainer;
	}

	public void setIdContainer(long idContainer) {
		this.idContainer = idContainer;
	}

	public long getIdLichTrinh() {
		return idLichTrinh;
	}

	public void setIdLichTrinh(long idLichTrinh) {
		this.idLichTrinh = idLichTrinh;
	}

	public double getTheTich() {
		return theTich;
	}

	public void setTheTich(double theTich) {
		this.theTich = theTich;
	}
}
