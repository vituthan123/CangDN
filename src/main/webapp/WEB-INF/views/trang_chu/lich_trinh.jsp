<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/taglib.jsp"%>
<head>
<title>Lịch trình</title>
</head>
<body>
	<main id="main">
		<div class="port-map">
			<h1 style="color: #fff; font-size: 54px">LỊCH TÀU CONTAINER</h1>
		</div>
		<section id="list" class="list">
			<div>
				<h3 style="text-align: center">DỰ KIẾN LỊCH TÀU CONTAINER TẠI
					CẢNG ĐÀ NẴNG</h3>
				<br />
				<table>
					<thead>
						<tr>
							<th>STT</th>
							<th>Mã tàu</th>
							<th>Cảng xuất phát</th>
							<th>Cảng đích</th>
							<th>Thời gian</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="item" items="${lichTrinhs}">
							<tr>
								<td>${item.id}</td>
								<td>${item.idTau}</td>
								<td>${item.cangXuatPhat}</td>
								<td>${item.cangDich}</td>
								<td>${item.thoiGianBatDau}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<br />
				<h4 style="color: red; font-style: oblique">Lưu ý: Lịch trình
					trên là ước tính và có thể thay đổi mà không cần thông báo trước.</h4>
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
