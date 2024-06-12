<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/taglib.jsp"%>
<!-- ======= Header ======= -->
<header id="header" class="fixed-top d-flex align-items-center">
	<div
		class="container d-flex align-items-center justify-content-between">
		<h1 class="logo">
			<a href="<c:url value="/" />">Đà Nẵng PORT</a>
		</h1>
		<!-- Uncomment below if you prefer to use an image logo -->
		<!-- <a href="index.html" class="logo"><img src="assets/img/logo.png" alt="" class="img-fluid"></a>-->

		<nav id="navbar" class="navbar">
			<ul>
				<li><a class="nav-link scrollto" href="#hero">Về chúng tôi</a></li>
				<li><a class="nav-link scrollto active" href="#search">Tìm
						kiếm</a></li>
				<li><a class="nav-link scrollto" href="#about">Dịch vụ</a></li>
				<li><a class="nav-link scrollto" href="#services">Eport</a></li>
				<li><a class="nav-link scrollto" href="#contact">Liên hệ</a></li>
				<!-- <li class="dropdown"><a href="#"><span>Dành cho khách hàng</span> <i class="bi bi-chevron-down"></i></a>
            <ul>
              <li><a href="don_hang.html">Thông tin đơn hàng</a></li>
              <li><a href="sua_khach_hang.html">Cập nhật thông tin khách hàng
              </a></li>
              <li><a href="doi_mat_khau.html">Đổi mật khẩu
              </a></li>
              <li><a href="#">Email</a></li>
              <li><a href="#">Phát hành hóa đơn</a></li>
            </ul>
          </li>
          <li class="dropdown"><a href="#"><span>Dành cho nhân viên</span> <i class="bi bi-chevron-down"></i></a>
            <ul>
              <li><a href="dang_nhap.html">Đăng nhập</a></li>
              <li><a href="list_don_hang.html">Danh sách đơn hàng</a></li>
              <li><a href="list_khach_hang.html">Danh sách khách hàng</a></li>
              <li><a href="list_container.html">Danh sách Container</a></li>
              <li><a href="list_chi_tiet_don_hang.html">Chi tiết đơn hàng</a></li>
            </ul>
          </li> -->
				<c:choose>
					<c:when test="${not empty account}">
						<c:choose>
							<c:when test="${role == 'KhachHang'}">
								<li><a class="getstarted scrollto"
									href="<c:url value="/khach-hang/" />">${account.ten}</a></li>
							</c:when>
							<c:when test="${role == 'NhanVienCang' or role == 'NhanVienTau'}">
								<li><a class="getstarted scrollto"
									href="<c:url value="/nhan-vien/" />">${account.ten}</a></li>
							</c:when>
						</c:choose>
					</c:when>
					<c:otherwise>
						<li><a class="getstarted scrollto"
							href="<c:url value="/dang-nhap" />">Đăng nhập</a></li>
					</c:otherwise>
				</c:choose>
			</ul>
			<i class="bi bi-list mobile-nav-toggle"></i>
		</nav>
		<!-- .navbar -->
	</div>
</header>
<!-- End Header -->