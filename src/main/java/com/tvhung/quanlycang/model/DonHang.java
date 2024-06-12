package com.tvhung.quanlycang.model;

import java.time.LocalDateTime;

import com.tvhung.quanlycang.dto.DonHangDto;

public class DonHang {
//	CREATE TABLE `don_hang` (
//			  `id` bigint(20) NOT NULL,
//			  `id_khach_hang` bigint(20) NOT NULL,
//			  `trang_thai` int(11) NOT NULL,
//			  `ngay_tao` datetime NOT NULL,
//			  `trong_luong` double NOT NULL,
//			  `ten_nguoi_nhan` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
//			  `sdt_nguoi_nhan` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
//			  `id_xa_nguoi_nhan` bigint(20) NOT NULL,
//			  `dia_chi_nguoi_nhan` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL,
//			  `mo_ta` varchar(255) COLLATE utf8mb4_vietnamese_ci NOT NULL
//			) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;
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

	public DonHang() {
		super();
	}

	public DonHang(long id, long idKhachHang, int trangThai, LocalDateTime ngayTao, double trongLuong,
			String tenNguoiNhan, String sdtNguoiNhan, long idXaNguoiNhan, String diaChiNguoiNhan, String moTa) {
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

	public DonHangDto toDto() {
		return new DonHangDto(id, idKhachHang, trangThai, ngayTao, trongLuong, tenNguoiNhan, sdtNguoiNhan,
				idXaNguoiNhan, diaChiNguoiNhan, moTa, 0);
	}
}
