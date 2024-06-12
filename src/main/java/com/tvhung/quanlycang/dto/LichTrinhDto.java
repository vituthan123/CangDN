package com.tvhung.quanlycang.dto;

import java.time.LocalDateTime;

public class LichTrinhDto {
	private long id;
	private long idTau;
	private String cangXuatPhat;
	private String cangDich;
	private LocalDateTime thoiGianBatDau;

	public LichTrinhDto() {
		super();
	}

	public LichTrinhDto(long id, long idTau, String cangXuatPhat, String cangDich, LocalDateTime thoiGianBatDau) {
		super();
		this.id = id;
		this.idTau = idTau;
		this.cangXuatPhat = cangXuatPhat;
		this.cangDich = cangDich;
		this.thoiGianBatDau = thoiGianBatDau;
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

	public String getCangXuatPhat() {
		return cangXuatPhat;
	}

	public void setCangXuatPhat(String cangXuatPhat) {
		this.cangXuatPhat = cangXuatPhat;
	}

	public String getCangDich() {
		return cangDich;
	}

	public void setCangDich(String cangDich) {
		this.cangDich = cangDich;
	}

	public LocalDateTime getThoiGianBatDau() {
		return thoiGianBatDau;
	}

	public void setThoiGianBatDau(LocalDateTime thoiGianBatDau) {
		this.thoiGianBatDau = thoiGianBatDau;
	}
}
