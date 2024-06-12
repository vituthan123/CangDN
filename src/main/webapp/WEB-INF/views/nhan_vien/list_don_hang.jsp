<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/taglib.jsp"%>
<head>
<title>List đơn hàng</title>
</head>
<body>
	<main id="main">
		<!-- ======= Breadcrumbs ======= -->
		<section class="breadcrumbs">
			<div class="container">
				<div class="d-flex justify-content-between align-items-center">
					<h2
						style="color: rgb(0, 0, 0); font-size: 32px; font-style: normal">
						Danh sách đơn hàng</h2>
					<ol>
						<li><a href="<c:url value="/" />">Trang chủ</a></li>
						<li>Danh sách đơn hàng</li>
					</ol>
				</div>
			</div>
		</section>
		<!-- End Breadcrumbs -->
		<section id="list" class="list">
			<div>
				<button class="btn-create">
					<a href="<c:url value="/nhan-vien/list-don-hang/export/pdf" />"
						style="color: #ffffff;">Xuất PDF</a>
				</button>
				<table>
					<thead>
						<tr>
							<th>Mã đơn hàng</th>
							<th>Ngày tạo</th>
							<th>Tên người nhận</th>
							<th>SĐT người nhận</th>
							<th>Địa chỉ giao hàng</th>
							<th>Trọng lượng</th>
							<th>Thể tích</th>
							<th>Mô tả</th>
							<th>Trạng thái</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<c:forEach var="item" items="${donHangs}">
								<tr>
									<td>${item.id}</td>
									<td>${item.ngayTao}</td>
									<td>${item.tenNguoiNhan}</td>
									<td>${item.sdtNguoiNhan}</td>
									<td>${item.diaChiNguoiNhan}</td>
									<td>${item.trongLuong}</td>
									<td>${item.theTich}</td>
									<td>${item.moTa}</td>
									<td><c:choose>
											<c:when test="${item.trangThai == 0}">Chờ xử lý</c:when>
											<c:when test="${item.trangThai == 1}">Đã duyệt</c:when>
											<c:when test="${item.trangThai == 2}">Đang giao</c:when>
											<c:when test="${item.trangThai == 3}">Đã hoàn thành</c:when>
										</c:choose></td>
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
