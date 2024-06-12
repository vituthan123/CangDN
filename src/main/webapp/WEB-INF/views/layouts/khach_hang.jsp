<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ include file="/WEB-INF/views/layouts/taglib.jsp"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta content="width=device-width, initial-scale=1.0" name="viewport">

<title><decorator:title default="Master page" /></title>
<meta content="" name="description">
<meta content="" name="keywords">

<!-- Favicons -->
<link href="<c:url value="/assets/img/favicon.png" />" rel="icon">
<link href="<c:url value="/assets/img/apple-touch-icon.png" />"
	rel="apple-touch-icon">


<link
	href="<c:url value="/assets/vendor/animate.css/animate.min.css" />"
	rel="stylesheet">
<link
	href="<c:url value="/assets/vendor/bootstrap/css/bootstrap.min.css" />"
	rel="stylesheet">
<link
	href="<c:url value="/assets/vendor/bootstrap-icons/bootstrap-icons.css" />"
	rel="stylesheet">
<link
	href="<c:url value="/assets/vendor/boxicons/css/boxicons.min.css" />"
	rel="stylesheet">
<link
	href="<c:url value="/assets/vendor/glightbox/css/glightbox.min.cs" />s"
	rel="stylesheet">
<link
	href="<c:url value="/assets/vendor/swiper/swiper-bundle.min.css" />"
	rel="stylesheet">

<link href="<c:url value="/assets/css/style.css" />" rel="stylesheet">
<!-- Flatpickr CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/flatpickr/dist/flatpickr.min.css">

<!-- Flatpickr JS -->
<script src="https://cdn.jsdelivr.net/npm/flatpickr"></script>
<decorator:head />
</head>

<body>

	<%@ include file="/WEB-INF/views/layouts/khach_hang/header.jsp"%>
	<decorator:body />
	<%@ include file="/WEB-INF/views/layouts/footer.jsp"%>

	<!-- Vendor JS Files -->
	<script
		src="<c:url value="/assets/vendor/purecounter/purecounter_vanilla.js" />"></script>
	<script
		src="<c:url value="/assets/vendor/bootstrap/js/bootstrap.bundle.min.js" />"></script>
	<script
		src="<c:url value="/assets/vendor/glightbox/js/glightbox.min.js" />"></script>
	<script
		src="<c:url value="/assets/vendor/isotope-layout/isotope.pkgd.min.js" />"></script>
	<script
		src="<c:url value="/assets/vendor/swiper/swiper-bundle.min.js" />"></script>
	<script
		src="<c:url value="/assets/vendor/php-email-form/validate.js" />"></script>

	<!-- Template Main JS File -->
	<script src="<c:url value="/assets/js/main.js" />"></script>
	<script src="https://code.jquery.com/jquery-3.6.0.js"></script>

</body>

</html>