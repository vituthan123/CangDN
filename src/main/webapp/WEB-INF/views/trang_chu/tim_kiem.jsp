<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/taglib.jsp"%>
<head>
<title>Tìm kiếm</title>
</head>
<body>
	<main id="main">
		<form action="<c:url value="/tim-kiem" />" method="get">
			<div class="search-form">
				<div class="search-c">
					<input name="query" type="text" value="${query}" />
					<button type="submit">TÌM KIẾM</button>
				</div>
			</div>
		</form>
		<section id="list" class="list">
			<div>
				<table>
					<thead>
						<tr>
							<th>Mã đơn hàng</th>
							<th>Tên người nhận</th>
							<th>Số điện thoại</th>
							<th>Địa chỉ nhận</th>
							<th>Trọng lượng</th>
							<th>Thể tích</th>
							<th>Mô tả</th>
							<th>Trạng thái</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="item" items="${donHangs}">
							<tr>
								<td>${item.id}</td>
								<td>${item.tenNguoiNhan}</td>
								<td>${item.sdtNguoiNhan}</td>
								<td>${item.diaChiNguoiNhan}</td>
								<td>${item.trongLuong}tấn</td>
								<td>${item.theTich}L</td>
								<td>${item.moTa}</td>
								<td><c:choose>
										<c:when test="${item.trangThai == 0}">Chờ xử lý</c:when>
										<c:when test="${item.trangThai == 1}">Đã duyệt</c:when>
										<c:when test="${item.trangThai == 2}">Đang giao</c:when>
										<c:when test="${item.trangThai == 3}">Đã hoàn thành</c:when>
									</c:choose></td>
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
