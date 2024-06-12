package com.tvhung.quanlycang.model;

import java.time.LocalDateTime;

public class LichTrinh {
//	CREATE TABLE `lich_trinh` (
//			  `id` bigint(20) NOT NULL,
//			  `id_tau` bigint(20) NOT NULL,
//			  `id_nhan_vien_tau` bigint(20) NOT NULL,
//			  `id_nhan_vien_cang` bigint(20) NOT NULL,
//			  `thoi_gian_bat_dau` datetime NOT NULL,
//			  `id_cang_xuat_phat` bigint(20) NOT NULL,
//			  `id_cang_dich` bigint(20) NOT NULL
//			) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;
	private long id;
	private long idTau;
	private long idNhanVienTau;
	private long idNhanVienCang;
	private LocalDateTime thoiGianBatDau;
	private long idCangXuatPhat;
	private long idCangDich;

	public LichTrinh() {
		super();
	}

	public LichTrinh(long id, long idTau, long idNhanVienTau, long idNhanVienCang, LocalDateTime thoiGianBatDau,
			long idCangXuatPhat, long idCangDich) {
		super();
		this.id = id;
		this.idTau = idTau;
		this.idNhanVienTau = idNhanVienTau;
		this.idNhanVienCang = idNhanVienCang;
		this.thoiGianBatDau = thoiGianBatDau;
		this.idCangXuatPhat = idCangXuatPhat;
		this.idCangDich = idCangDich;
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

	public long getIdNhanVienTau() {
		return idNhanVienTau;
	}

	public void setIdNhanVienTau(long idNhanVienTau) {
		this.idNhanVienTau = idNhanVienTau;
	}

	public long getIdNhanVienCang() {
		return idNhanVienCang;
	}

	public void setIdNhanVienCang(long idNhanVienCang) {
		this.idNhanVienCang = idNhanVienCang;
	}

	public LocalDateTime getThoiGianBatDau() {
		return thoiGianBatDau;
	}

	public void setThoiGianBatDau(LocalDateTime thoiGianBatDau) {
		this.thoiGianBatDau = thoiGianBatDau;
	}

	public long getIdCangXuatPhat() {
		return idCangXuatPhat;
	}

	public void setIdCangXuatPhat(long idCangXuatPhat) {
		this.idCangXuatPhat = idCangXuatPhat;
	}

	public long getIdCangDich() {
		return idCangDich;
	}

	public void setIdCangDich(long idCangDich) {
		this.idCangDich = idCangDich;
	}
}
