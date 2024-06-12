<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/taglib.jsp"%>
<head>
<title>Đăng nhập</title>
</head>
<body>
	<main id="main">
		<section class="login">
			<div id="wrapper">
				<form:form modelAttribute="account" method="post" action="dang-nhap" id="form-login">
					<h1 class="form-heading">Đăng nhập</h1>
					<div class="form-group">
						<i class="far fa-user"></i>
						<form:input path="taiKhoan" type="text" class="form-input"
							placeholder="Tên đăng nhập" />
					</div>
					<div class="form-group">
						<i class="fas fa-key"></i>
						<form:input path="matKhau" type="password" class="form-input"
							placeholder="Mật khẩu" />
						<div id="eye">
							<i class="far fa-eye"></i>
						</div>
					</div>
					<p>
						<a href="#">Quên mật khẩu?</a>
					</p>
					<div id="login">
						<input type="submit" value="Đăng nhập" class="form-submit" />
					</div>
					<div id="signin">
						<input type="submit" value="Đăng nhập bằng Google"
							class="form-submit" />
					</div>
				</form:form>
			</div>
		</section>
	</main>
	<!-- End #main -->
</body>