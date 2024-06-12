package com.tvhung.quanlycang.model;

public class Tau {
//	CREATE TABLE `tau` (
//			  `id` bigint(20) NOT NULL,
//			  `hang_tau` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
//			  `suc_chua` double NOT NULL
//			) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;
	private long id;
	private String hangTau;
	private double sucChua;

	public Tau() {
		super();
	}

	public Tau(long id, String hangTau, double sucChua) {
		super();
		this.id = id;
		this.hangTau = hangTau;
		this.sucChua = sucChua;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getHangTau() {
		return hangTau;
	}

	public void setHangTau(String hangTau) {
		this.hangTau = hangTau;
	}

	public double getSucChua() {
		return sucChua;
	}

	public void setSucChua(double sucChua) {
		this.sucChua = sucChua;
	}
}
