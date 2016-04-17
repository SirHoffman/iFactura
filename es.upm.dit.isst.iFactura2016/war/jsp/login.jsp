<!DOCTYPE html>
<html lang="es">
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<title>iFactura2016</title>
<!-- Bootstrap Core CSS -->
<link href="../css/bootstrap.min.css" rel="stylesheet">
<!-- Custom CSS -->
<link href="../css/animate.css" rel="stylesheet">
<!-- Custom Fonts -->
<link href="../css/font-awesome.min.css" rel="stylesheet"
	type="text/css">
<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
</head>
<body>


	<!-- Start Login box -->
	<div id="loginDiv">
		<div class="container clearfix" style="padding: 70px 70px 70px 70px;">
			<form class="col-sm-4 col-md-4 animated form-signin">
				<h2 class="form-signin-heading">Login</h2>
				<div style="padding-bottom: 15px; padding-top: 15px">
					<label for="inputEmail" class="sr-only">Correo Electronico</label>
					<input id="inputEmail" class="form-control"
						placeholder="Correo Electronico" required="" autofocus=""
						type="email"> <label for="inputPassword" class="sr-only">Contraseña</label>
					<input id="inputPassword" class="form-control"
						placeholder="Contraseña" required="" type="password">
				</div>
				<button class="btn btn-primary" type="submit">Login</button>

				<a class="btn btn-primary" href="<c:url value="${url}"/>"> <i
					class="fa fa-google"></i> Login con Google
				</a>
				<div style="padding-bottom: 15px; padding-top: 15px">
					<a id="registrationLink" href="">Registrate</a>
				</div>
			</form>
		</div>
	</div>
	<div id="registrationDiv" class="container clearfix"
		style="padding: 70px 70px 70px 70px; display: none">
		<%@ include file="registration.jsp"%>
	</div>

	<!-- End Login box -->
	<%@ include file="footer.jsp"%>

	<!-- scripts -->
	<script src="../scripts/libs/jquery.min.js"></script>
	<script src="../scripts/libs/bootstrap.min.js"></script>
	<script src="../scripts/login/login.js"></script>
</body>
</html>