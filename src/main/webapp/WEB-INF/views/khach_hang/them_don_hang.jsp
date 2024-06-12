<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/taglib.jsp"%>
<head>
<title>Thêm đơn hàng</title>
</head>
<body>
	<main id="main">

		<!-- ======= Breadcrumbs ======= -->
		<section class="breadcrumbs">
			<div class="container">

				<div class="d-flex justify-content-between align-items-center">
					<button class="btn-back">
						<a href="<c:url value="/khach-hang/don-hang" />"
							style="color: #ffffff;">Quay lại</a>
					</button>
					<h2
						style="color: rgb(0, 0, 0); font-size: 32px; font-style: normal;">Tạo
						đơn hàng</h2>
					<ol>
						<li><a href="<c:url value="/" />">Trang chủ</a></li>
						<li><a href="<c:url value="/khach-hang/don-hang" />">Thông
								tin đơn hàng</a></li>
						<li>Tạo đơn hàng</li>
					</ol>
				</div>

			</div>
		</section>
		<!-- End Breadcrumbs -->

		<section id="contact" class="contact">
			<div class="container">
				<div class="form">
					<form:form action="them-don-hang" method="post"
						modelAttribute="donHang" role="form">
						<!-- Nguoi nhan -->
						<div class="form-group">
							<h4>Thông tin người nhận</h4>
						</div>
						<div class="row">
							<div class="col-md-6 form-group">
								<form:input path="tenNguoiNhan" type="text" name="receiver_name"
									class="form-control" id="receiver_name"
									placeholder="Họ và tên người nhận" />
							</div>
							<div class="col-md-3 form-group">
								<form:input path="sdtNguoiNhan" type="text" class="form-control"
									name="tel" id="tel" placeholder="Số điện thoại người nhận" />
							</div>
						</div>
						<!-- Dia chi -->
						<div class="form-group col-md-6">
							<form:input path="diaChiNguoiNhan" type="text"
								class="form-control" name="address" id="address"
								placeholder="Địa chỉ người nhận" />
						</div>
						<br>
						<br>
						<div class="form-group">
							<h4>Thông tin đơn hàng</h4>
						</div>
						<div class="col-md-2 form-group">
							<form:input path="trongLuong" type="number" class="form-control"
								name="number" id="number" placeholder="Trọng lượng(Kg)" />
						</div>
						<div class="col-md-2 form-group">
							<form:input path="theTich" type="number" class="form-control"
								name="number" id="number" placeholder="Thể tích(L)" />
						</div>

						<div class="form-group mt-3">
							<form:textarea path="moTa" class="form-control" name="describe"
								rows="5" placeholder="Mô tả" />
						</div>
						<div class="text-center">
							<button type="submit">Tạo đơn hàng</button>
						</div>
					</form:form>
				</div>
		</section>

	</main>
	<!-- End #main -->
</body>