<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/taglib.jsp"%>
<head>
<title>Đổi mật khẩu</title>
</head>
<body>
	<main id="main">
		<!-- ======= Breadcrumbs ======= -->
		<section class="breadcrumbs">
			<div class="container">
				<div class="d-flex justify-content-between align-items-center">
					<button class="btn-back">
						<a href="<c:url value="/khach-hang/don-hang" />"
							style="color: #ffffff">Thông tin khách hàng</a>
					</button>
					<h2
						style="color: rgb(0, 0, 0); font-size: 32px; font-style: normal">
						Thay đổi mật khẩu</h2>
					<ol>
						<li><a href="<c:url value="/" />">Trang chủ</a></li>
						<li>Thay đổi mật khẩu</li>
					</ol>
				</div>
			</div>
		</section>
		<!-- End Breadcrumbs -->

		<section id="contact" class="contact">
			<div class="container_pass">
				<div class="form_pass">
					<form:form action="/QuanLyCang/khach-hang/doi-mat-khau"
						method="post" modelAttribute="account" role="form">
						<div class="col-md-12 form-group">
							<input type="password" class="form-control" name="now_pass"
								id="nowpass" placeholder="Mật khẩu hiện tại" required />
						</div>
						<div class="col-md-12 form-group">
							<form:input path="matKhau" type="password" class="form-control"
								name="new_pass" id="new_pass" placeholder="Mật khẩu mới" />
						</div>
						<div class="col-md-12 form-group">
							<input type="password" class="form-control" name="reply_pass"
								id="reply_pass" placeholder="Nhập lại mật khẩu" required />
						</div>
						<br />
						<div class="text-center">
							<button type="submit">Đổi mật khẩu</button>
						</div>
					</form:form>
				</div>
			</div>
		</section>
		<section id="about" class="about">
			<div class="container">
				<div class="section-title">
					<h2></h2>
				</div>
			</div>
		</section>
		<!-- End Clients Section -->
	</main>
	<!-- End #main -->
</body>