<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/taglib.jsp"%>
<head>
<title>Đơn hàng</title>
</head>
<body>
	<main id="main">

		<!-- ======= Breadcrumbs ======= -->
		<section class="breadcrumbs">
			<div class="container">

				<div class="d-flex justify-content-between align-items-center">
					<h2
						style="color: rgb(0, 0, 0); font-size: 32px; font-style: normal;">Thông
						tin đơn hàng của bạn</h2>
					<ol>
						<li><a href="<c:url value="/" />">Trang chủ</a></li>
						<li>Thông tin đơn hàng</li>
					</ol>
				</div>

			</div>
		</section>
		<!-- End Breadcrumbs -->

		<section id="list" class="list">
			<button class="btn-create">
				<a href="<c:url value="/khach-hang/them-don-hang" />"
					style="color: #ffffff;">Create New</a>
			</button>
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
						<th>Hoạt động</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="item" items="${donHangs}">
						<tr>
							<td>${item.id}</td>
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
							<td>
								<div class="btn-group">
									<button class="btn btn-details">
										<a style="color: rgb(255, 255, 255);"
											href="<c:url value="/khach-hang/chi-tiet-don-hang/${item.id}" />">Details</a>
									</button>
									<button class="btn btn-edit">
										<a style="color: rgb(255, 255, 255);"
											href="<c:url value="/khach-hang/sua-don-hang/${item.id}" />">Edit</a>
									</button>
									<button class="btn btn-delete" onclick="confirmDelete(${item.id})">X</button>
								</div>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>

			<script>
				function confirmDelete(id) {
					if (confirm("Bạn có muốn xóa không?")) {
						fetch("xoa-don-hang/" + id, {
							method: "POST"
						})
						.then(response => {
							if (response.ok) {
                                alert("Xóa thành công");
                                location.reload();
                            } else {
                                alert("Xóa không thành công");
                            }
                        });
					} else {
						alert("Xóa không thành công");
					}
				}
			</script>
		</section>
		</section>
		<section id="about" class="about">
			<div class="container">
				<div class="section-title">
					<h2></h2>
				</div>
			</div>
		</section>
		<!-- End Clients Section -->
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