package com.tvhung.quanlycang.dto;

import java.time.LocalDateTime;

import com.tvhung.quanlycang.model.DonHang;

public class DonHangDto {
	private long id;
	private long idKhachHang;
	private int trangThai;
	private LocalDateTime ngayTao;
	private double trongLuong;
	private String tenNguoiNhan;
	private String sdtNguoiNhan;
	private long idXaNguoiNhan;
	private String diaChiNguoiNhan;
	private String moTa;
	private double theTich;

	public DonHangDto() {
		super();
	}

	public DonHangDto(long id, long idKhachHang, int trangThai, LocalDateTime ngayTao, double trongLuong,
			String tenNguoiNhan, String sdtNguoiNhan, long idXaNguoiNhan, String diaChiNguoiNhan, String moTa,
			double theTich) {
		super();
		this.id = id;
		this.idKhachHang = idKhachHang;
		this.trangThai = trangThai;
		this.ngayTao = ngayTao;
		this.trongLuong = trongLuong;
		this.tenNguoiNhan = tenNguoiNhan;
		this.sdtNguoiNhan = sdtNguoiNhan;
		this.idXaNguoiNhan = idXaNguoiNhan;
		this.diaChiNguoiNhan = diaChiNguoiNhan;
		this.moTa = moTa;
		this.theTich = theTich;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getIdKhachHang() {
		return idKhachHang;
	}

	public void setIdKhachHang(long idKhachHang) {
		this.idKhachHang = idKhachHang;
	}

	public int getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(int trangThai) {
		this.trangThai = trangThai;
	}

	public LocalDateTime getNgayTao() {
		return ngayTao;
	}

	public void setNgayTao(LocalDateTime ngayTao) {
		this.ngayTao = ngayTao;
	}

	public double getTrongLuong() {
		return trongLuong;
	}

	public void setTrongLuong(double trongLuong) {
		this.trongLuong = trongLuong;
	}

	public String getTenNguoiNhan() {
		return tenNguoiNhan;
	}

	public void setTenNguoiNhan(String tenNguoiNhan) {
		this.tenNguoiNhan = tenNguoiNhan;
	}

	public String getSdtNguoiNhan() {
		return sdtNguoiNhan;
	}

	public void setSdtNguoiNhan(String sdtNguoiNhan) {
		this.sdtNguoiNhan = sdtNguoiNhan;
	}

	public long getIdXaNguoiNhan() {
		return idXaNguoiNhan;
	}

	public void setIdXaNguoiNhan(long idXaNguoiNhan) {
		this.idXaNguoiNhan = idXaNguoiNhan;
	}

	public String getDiaChiNguoiNhan() {
		return diaChiNguoiNhan;
	}

	public void setDiaChiNguoiNhan(String diaChiNguoiNhan) {
		this.diaChiNguoiNhan = diaChiNguoiNhan;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public double getTheTich() {
		return theTich;
	}

	public void setTheTich(double theTich) {
		this.theTich = theTich;
	}

	public DonHang toModel() {
		return new DonHang(id, idKhachHang, trangThai, ngayTao, trongLuong, tenNguoiNhan, sdtNguoiNhan, idXaNguoiNhan,
				diaChiNguoiNhan, moTa);
	}
}
