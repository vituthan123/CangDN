<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/taglib.jsp"%>
<head>
<title>List khách hàng</title>
</head>
<body>
	<main id="main">
		<!-- ======= Breadcrumbs ======= -->
		<section class="breadcrumbs">
			<div class="container">
				<div class="d-flex justify-content-between align-items-center">
					<h2
						style="color: rgb(0, 0, 0); font-size: 32px; font-style: normal">
						Danh sách khách hàng</h2>
					<ol>
						<li><a href="<c:url value="/" />">Trang chủ</a></li>
						<li>Danh sách khách hàng</li>
					</ol>
				</div>
			</div>
		</section>
		<!-- End Breadcrumbs -->
		<section id="list" class="list">
			<div>
				<table>
					<thead>
						<tr>
							<th>Mã KH</th>
							<th>Tên khách hàng</th>
							<th>Số điện thoại</th>
							<th>Email</th>
							<th>Ngày sinh</th>
							<th>Mã số thuế</th>
							<th>Địa chỉ</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<c:forEach var="item" items="${khachHangs}">
								<tr>
									<td>${item.id}</td>
									<td>${item.ten}</td>
									<td>${item.sdt}</td>
									<td>${item.email}</td>
									<td>${item.ngaySinh}</td>
									<td>${item.maSoThue}</td>
									<td>${item.diaChi}</td>
								</tr>
							</c:forEach>
						</tr>
					</tbody>
				</table>
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
