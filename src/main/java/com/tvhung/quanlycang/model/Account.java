package com.tvhung.quanlycang.model;

public class Account {
	public static final String KHACH_HANG = KhachHang.class.getSimpleName();
	public static final String NHAN_VIEN_CANG = NhanVienCang.class.getSimpleName();
	public static final String NHAN_VIEN_TAU = NhanVienTau.class.getSimpleName();
	private String taiKhoan;
	private String matKhau;

	public Account() {
		super();
	}

	public Account(String taiKhoan, String matKhau) {
		super();
		this.taiKhoan = taiKhoan;
		this.matKhau = matKhau;
	}

	public String getTaiKhoan() {
		return taiKhoan;
	}

	public void setTaiKhoan(String taiKhoan) {
		this.taiKhoan = taiKhoan;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
}