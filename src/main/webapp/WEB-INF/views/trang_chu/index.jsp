<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/taglib.jsp"%>
<head>
<title>Index</title>
</head>
<body>
	<!-- ======= Hero Section ======= -->
	<section id="hero">
		<div class="hero-container">
			<div id="heroCarousel" data-bs-interval="5000"
				class="carousel slide carousel-fade" data-bs-ride="carousel">
				<ol class="carousel-indicators" id="hero-carousel-indicators"></ol>
				<div class="carousel-inner" role="listbox">
					<!-- Slide 1 -->
					<div class="carousel-item active"
						style="background-image: url(assets/img/slide/CangDN3.jpg)">
						<div class="carousel-container">
							<div class="carousel-content">
								<h2 class="animate__animated animate__fadeInDown">Lịch sử
									hình thành</h2>
								<p class="animate__animated animate__fadeInUp">Được thành
									lập từ năm 1901, trải qua những thăng trầm của lịch sử, sự phát
									triển của Cảng Đà Nẵng luôn gắn liền với sự phát triển của
									thành phố Đà Nẵng, góp phần chung vào công cuộc bảo vệ an ninh
									tổ quốc, phát triển kinh tế xã hội địa phương và miền Trung.</p>
								<!-- <div>
                  <a href="#about" class="btn-get-started animate__animated animate__fadeInUp scrollto">Xem thêm</a>
                </div> -->
							</div>
						</div>
					</div>

					<!-- Slide 2 -->
					<div class="carousel-item"
						style="background-image: url(assets/img/slide/cangDN2.jpg)">
						<div class="carousel-container">
							<div class="carousel-content">
								<h2 class="animate__animated animate__fadeInDown">Vị trí
									Cảng Đà Nẵng</h2>
								<p class="animate__animated animate__fadeInUp">Nằm trong
									vịnh Đà Nẵng với diện tích 100km2, được che chắn bởi Núi Hải
									Vân và Bán Đảo Sơn Trà với đê chắn sóng dài 450m, cùng hệ thống
									giao thông thuận lợi, kết nối liền mạch tới sân bay, nhà ga xe
									lửa, các khu công nghiệp và đường quốc lộ, thuận tiện cho hoạt
									động vận tải hàng hóa tới khắp các vùng trong cả nước. Cảng Đà
									Nẵng hiện là một khâu quan trọng trong chuỗi dịch vụ Logistics
									của khu vực miền Trung Việt Nam. Cảng Đà Nẵng cũng được chọn là
									điểm cuối cùng của tuyến hành lang kinh tế Đông Tây, nối liền 4
									nước Myanmar, Thailand, Lào và Việt Nam, là cửa ngõ chính ra
									Biển Đông cho toàn khu vực.</p>
							</div>
						</div>
					</div>

					<!-- Slide 3 -->
					<div class="carousel-item"
						style="background-image: url(assets/img/slide/cangDN1.jpg)">
						<div class="carousel-container">
							<div class="carousel-content">
								<h2 class="animate__animated animate__fadeInDown">Sứ mệnh</h2>
								<p class="animate__animated animate__fadeInUp">Chúng tôi nổ
									lực không ngừng cho sự thông suốt, nhanh chóng, an toàn của các
									dòng hàng hoá, con người và văn hoá vì tin rằng điều đó tạo nên
									sự thịnh vượng của Quốc gia.</p>
							</div>
						</div>
					</div>
				</div>

				<a class="carousel-control-prev" href="#heroCarousel" role="button"
					data-bs-slide="prev"> <span
					class="carousel-control-prev-icon bi bi-chevron-left"
					aria-hidden="true"></span>
				</a> <a class="carousel-control-next" href="#heroCarousel" role="button"
					data-bs-slide="next"> <span
					class="carousel-control-next-icon bi bi-chevron-right"
					aria-hidden="true"></span>
				</a>
			</div>
		</div>
	</section>
	<!-- End Hero -->

	<main id="main">
		<section id="search" class="search">
			<div class="container_search">
				<div class="section-title">
					<h2 style="color: white; font-size: 48px">Tìm kiếm</h2>
				</div>
				<div class="search-container">
					<input type="text"
						placeholder="Nhập từ khóa hoặc Tìm container (Vd: 5)" />
					<button type="submit">
						<a href="<c:url value="/tim-kiem" />"><i class="fa fa-search"></i></a>
					</button>
				</div>
				<a href="<c:url value="/lich-trinh" />" class="button">XEM LỊCH
					TRÌNH TẠI ĐÂY</a>
			</div>
		</section>
		<!-- End Clients Section -->
		<!-- ======= About Section ======= -->
		<section id="about" class="about">
			<div class="container">
				<div class="row no-gutters">
					<div
						class="image col-xl-5 d-flex align-items-stretch justify-content-center justify-content-lg-start"></div>
					<div
						class="col-xl-7 ps-0 ps-lg-5 pe-lg-1 d-flex align-items-stretch">
						<div class="content d-flex flex-column justify-content-center">
							<div class="section-title">
								<h2>DỊCH VỤ</h2>
							</div>
							<div class="row">
								<div class="col-md-6 icon-box">
									<a href="#"> <i class="bi bi-binoculars"></i>
										<h4>Tàu đang làm hàng</h4>
										<p>Tra cứu tàu hoặc container</p>
									</a>
								</div>
								<div class="col-md-6 icon-box">
									<i class="bx bx-receipt"></i>
									<h4>Hóa đơn điện tử</h4>
									<p>Cổng thông tin hóa đơn điện tử Cảng Đà Nẵng</p>
								</div>
								<div class="col-md-6 icon-box">
									<i class="bx bx-images"></i>
									<h4>Lịch tàu container</h4>
									<p>Lịch trình tàu container dự kiến cập cảng đà nẵng</p>
								</div>
								<div class="col-md-6 icon-box">
									<i class="bx bx-shield"></i>
									<h4>Quy định ATLĐ</h4>
									<p>Dành cho lái xe ngoài vảo Cảng giao nhận hàng và lái xe
										của các nhà thầu</p>
								</div>
							</div>
						</div>
						<!-- End .content-->
					</div>
				</div>
			</div>
		</section>
		<!-- End About Section -->

		<!-- ======= Services Section ======= -->
		<section id="services" class="services">
			<div class="container">
				<div class="section-title">
					<h2>ePORT DNP: Cảng Điện Tử - Cảng Đà Nẵng</h2>
					<p>Sử dụng dịch vụ trực tuyến - hiệu quả - nhanh chóng - mọi
						lúc mọi nơi.Tiên phong trong chuyển đổi số doanh nghiệp.</p>
				</div>

				<div class="row">
					<div class="col-lg-4 col-md-6 icon-box">
						<div class="icon">
							<i class="###"></i>
						</div>
						<h3 class="title">
							<a href="#">Hãng tàu</a>
						</h3>
						<p class="description">Trao đổi lệnh giao hàng điện tử eDO,
							quản lý vận đơn tức thời</p>
					</div>
					<div class="col-lg-4 col-md-6 icon-box">
						<div class="icon">
							<i class="###"></i>
						</div>
						<h3 class="title">
							<a href="">Nhà vận chuyển Logistic</a>
						</h3>
						<p class="description">Đăng ký dịch vụ trực tuyến, hiệu quả -
							nhanh chóng, mọi lúc mọi nơi.</p>
					</div>
					<div class="col-lg-4 col-md-6 icon-box">
						<div class="icon">
							<i class="###"></i>
						</div>
						<h3 class="title">
							<a href="">Tài xế</a>
						</h3>
						<p class="description">Nhân lệnh giao hàng điện tử thông qua
							ứng dụng trên điện thoại thông minh.</p>
					</div>
				</div>
			</div>
		</section>
		<!-- End Services Section -->

		<!-- ======= Why Us Section ======= -->
		<section id="why-us" class="why-us">
			<div class="container">
				<div class="section-title">
					<h2>Tích hợp mọi thứ trên một nền tảng - mọi lúc - mọi nơi.</h2>
				</div>

				<div class="row">
					<div class="col-lg-4">
						<div class="box">
							<span>01</span>
							<h4>Đăng ký dịch vụ Online.</h4>
							<p>__________________</p>
						</div>
					</div>

					<div class="col-lg-4 mt-4 mt-lg-0">
						<div class="box">
							<span>02</span>
							<h4>Thanh toán điện tử.</h4>
							<p>__________________</p>
						</div>
					</div>

					<div class="col-lg-4 mt-4 mt-lg-0">
						<div class="box">
							<span>03</span>
							<h4>Hải quan điện tử.</h4>
							<p>__________________</p>
						</div>
					</div>
					<div class="col-lg-4 mt-4 mt-lg-0">
						<div class="box">
							<span>04</span>
							<h4>Hóa đơn điện tử.</h4>
							<p>__________________</p>
						</div>
					</div>
					<div class="col-lg-4 mt-4 mt-lg-0">
						<div class="box">
							<span>05</span>
							<h4>Lệnh giao hàng điện tử eDO.</h4>
							<p>__________________</p>
						</div>
					</div>
				</div>
			</div>
		</section>
		<!-- End Why Us Section -->

		<!-- ======= Contact Section ======= -->
		<section id="contact" class="contact">
			<div class="container">
				<div class="section-title">
					<h2>Liên hệ</h2>
				</div>

				<div class="row contact-info">
					<div class="col-md-4">
						<div class="contact-address">
							<i class="bi bi-geo-alt"></i>
							<h3>Địa chỉ</h3>
							<address>42 Cao Thắng, Thanh Bình, Hải Châu, Đà Nẵng</address>
						</div>
					</div>

					<div class="col-md-4">
						<div class="contact-phone">
							<i class="bi bi-phone"></i>
							<h3>Số điện thoại</h3>
							<p>
								<a href="tel:+155895548855">+84 5589 55488 55</a>
							</p>
						</div>
					</div>

					<div class="col-md-4">
						<div class="contact-email">
							<i class="bi bi-envelope"></i>
							<h3>Email</h3>
							<p>
								<a href="mailto:info@example.com">info@example.com</a>
							</p>
						</div>
					</div>
				</div>

				<div class="form">
					<form action="forms/contact.php" method="post" role="form"
						class="php-email-form">
						<div class="row">
							<div class="col-md-6 form-group">
								<input type="text" name="name" class="form-control" id="name"
									placeholder="Họ và tên" data-rule="minlen:4"
									data-msg="Please enter at least 4 chars" />
							</div>
							<div class="col-md-6 form-group">
								<input type="email" class="form-control" name="email" id="email"
									placeholder="Email" data-rule="email"
									data-msg="Please enter a valid email" />
							</div>
						</div>
						<div class="form-group mt-3">
							<input type="tel" class="form-control" name="telephone"
								id="Số điện thoại" placeholder="Subject" required />
						</div>
						<div class="form-group mt-3">
							<textarea class="form-control" name="message" rows="5"
								placeholder="Nội dung" required></textarea>
						</div>
						<div class="my-3">
							<div class="loading">Loading</div>
							<div class="error-message"></div>
							<div class="sent-message">Tin nhắn của bạn đã được gửi. Cảm
								ơn!</div>
						</div>
						<div class="text-center">
							<button type="submit">Gửi</button>
						</div>
					</form>
				</div>
			</div>
		</section>
		<!-- End Contact Section -->
	</main>
	<!-- End #main -->
</body>
