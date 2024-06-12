<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/taglib.jsp"%>
<head>
<title>List container</title>
</head>
<body>
	<main id="main">
		<!-- ======= Breadcrumbs ======= -->
		<section class="breadcrumbs">
			<div class="container">
				<div class="d-flex justify-content-between align-items-center">
					<h2
						style="color: rgb(0, 0, 0); font-size: 32px; font-style: normal">
						Thông tin Container</h2>
					<ol>
						<li><a href="<c:url value="/" />">Trang chủ</a></li>
						<li>Thông tin container</li>
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
							<th>STT</th>
							<th>Id loại container</th>
							<th>Sức chứa</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<c:forEach var="item" items="${containers}">
								<tr>
									<td>${item.id}</td>
									<td>${item.idLoaiContainer}</td>
									<td>${item.sucChua}</td>
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
