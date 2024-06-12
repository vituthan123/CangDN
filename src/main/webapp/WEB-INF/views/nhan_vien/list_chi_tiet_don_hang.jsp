<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/taglib.jsp"%>
<head>
<title>List chi tiết đơn hàng</title>
</head>
<body>
	<main id="main">
		<!-- ======= Breadcrumbs ======= -->
		<section class="breadcrumbs">
			<div class="container">
				<div class="d-flex justify-content-between align-items-center">
					<h2
						style="color: rgb(0, 0, 0); font-size: 32px; font-style: normal">
						Chi tiết đơn hàng</h2>
					<ol>
						<li><a href="<c:url value="/" />">Trang chủ</a></li>
						<li>Chi tiết đơn hàng</li>
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
							<th>Mã đơn hàng</th>
							<th>Mã container</th>
							<th>Mã Lịch trình</th>
							<th>Thể tích</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="item" items="${chiTietDonHangs}">
							<tr>
								<td>${item.idDonHang}</td>
								<td>${item.idContainer}</td>
								<td>${item.idLichTrinh}</td>
								<td>${item.theTich}</td>
							</tr>
						</c:forEach>
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
