<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/taglib.jsp"%>
<head>
<title>Sửa khách hàng</title>
</head>
<body>
	<main id="main">
		<!-- ======= Breadcrumbs ======= -->
		<section class="breadcrumbs">
			<div class="container">
				<div class="d-flex justify-content-between align-items-center">
					<h2
						style="color: rgb(0, 0, 0); font-size: 32px; font-style: normal">
						Cập nhật thông tin khách hàng</h2>
					<ol>
						<li><a href="<c:url value="/" />">Trang chủ</a></li>
						<li>Cập nhật</li>
					</ol>
				</div>
			</div>
		</section>
		<!-- End Breadcrumbs -->

		<section id="contact" class="contact">
			<div class="container">
				<div class="form">
					<form:form action="/QuanLyCang/khach-hang/sua-khach-hang"
						method="post" modelAttribute="khachHang" role="form">
						<div class="row">
							<div class="col-md-6 form-group">
								<form:input path="ten" type="text" name="name"
									class="form-control" id="name" placeholder="Họ và tên" />
							</div>
							<div class="col-md-3 form-group">
								<form:input path="sdt" type="tel" class="form-control"
									name="tel" id="tel" placeholder="Số điện thoại" />
							</div>
						</div>
						<div class="col-md-3 form-group">
							<form:input path="email" type="email" class="form-control"
								name="email" id="email" placeholder="Email" />
						</div>
						<!-- Dia chi -->
						<div class="form-group col-md-6">
							<form:input path="diaChi" type="text" class="form-control"
								name="address" id="address" placeholder="Địa chỉ" />
						</div>

						<div class="form-group col-md-3">
							<form:input path="ngaySinh" type="text" name="date" id="date"
								placeholder="Ngày sinh" />
						</div>
						<!-- //Mã số thuế -->
						<div class="col-md-3 form-group">
							<form:input path="maSoThue" type="text" class="form-control"
								name="masothue" id="masothue" placeholder="Mã số thuế" />
						</div>

						<div class="text-center">
							<button type="submit" style="background-color: #0056b3">
								<a href="<c:url value="/khach-hang/doi-mat-khau" />"
									style="color: rgb(255, 255, 255)"> Thay đổi mật khẩu</a>
							</button>
							<!-- chuyển đến trang thay đổi mật khẩu -->
							<button type="submit">Cập nhật</button>
						</div>
					</form:form>
				</div>
			</div>
		</section>
	</main>
	<!-- End #main -->
</body>