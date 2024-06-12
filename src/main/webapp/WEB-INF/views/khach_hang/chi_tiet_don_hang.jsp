<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/taglib.jsp"%>
<head>
<title>Chi tiết đơn hàng</title>
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
						style="color: rgb(0, 0, 0); font-size: 32px; font-style: normal;">Chi
						tiết đơn hàng</h2>
					<ol>
						<li><a href="<c:url value="/" />">Trang chủ</a></li>
						<li><a href="<c:url value="/khach-hang/don-hang" />">Thông
								tin đơn hàng</a></li>
						<li>Chi tiết đơn hàng</li>
					</ol>
				</div>

			</div>
		</section>
		<!-- End Breadcrumbs -->

		<section id="contact" class="contact">
			<div class="container">


				<div class="form">
					<form action="#" method="post" role="form" class="php-email-form">
						<div class="form-group">
							<h4>Thông tin người nhận</h4>
						</div>
						<div class="row">
							<div class="col-md-6 form-group">
								<input type="text" name="receiver_name" class="form-control"
									id="receiver_name" placeholder="Họ và tên người nhận"
									value="${donHang.tenNguoiNhan}">
							</div>
							<div class="col-md-3 form-group">
								<input type="tel" class="form-control" name="tel" id="tel"
									placeholder="Số điện thoại người nhận"
									value="${donHang.sdtNguoiNhan}">
							</div>
						</div>
						<!-- Dia chi -->
						<div class="form-group col-md-6">
							<input type="text" class="form-control" name="address"
								id="address" placeholder="Địa chỉ người nhận"
								value="${donHang.diaChiNguoiNhan}">
						</div>
						<br> <br>
						<div class="form-group">
							<h4>Thông tin đơn hàng</h4>
						</div>
						<div class="col-md-4 form-group">
							<input type="text" name="id" class="form-control" id="id"
								placeholder="Mã đơn hàng" value="${donHang.id}">
						</div>
						<div class="col-md-3 form-group">
							<input type="text" name="date" class="form-control" id="date"
								placeholder="Ngày tạo đơn" value="${donHang.ngayTao}">
						</div>
						<div class="col-md-2 form-group">
							<input type="number" class="form-control" name="number"
								id="number" placeholder="Trọng lượng(Kg)"
								value="${donHang.trongLuong}">
						</div>
						<div class="col-md-2 form-group">
							<input type="number" class="form-control" name="number"
								id="number" placeholder="Thể tích(L)" value="${donHang.theTich}">
						</div>

						<div class="form-group mt-3">
							<textarea class="form-control" name="describe" rows="5"
								placeholder="Mô tả">${donHang.moTa}</textarea>
						</div>
						<!-- <div class="my-3">
                <div class="loading">Loading</div>
                <div class="error-message"></div>
                <div class="sent-message">Thông tin của bạn đã được cập nhật. Cảm ơn!</div>
              </div> -->
					</form>
				</div>
		</section>

	</main>
	<!-- End #main -->
</body>