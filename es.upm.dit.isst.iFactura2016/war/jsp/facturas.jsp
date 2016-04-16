<html>
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
<link href="../css/bootstrap-theme.min.css" rel="stylesheet">
<link href="../css/jquery.dataTables.css" rel="stylesheet">
<!-- Custom CSS -->
<link href="../css/custom.css" rel="stylesheet">
<link href="../css/animate.css" rel="stylesheet">
<!-- Custom Fonts -->
<link href="../css/font-awesome.min.css" rel="stylesheet"
	type="text/css">
</head>
<body>
	<%@ include file="header.jsp"%>
	<div id="facturasDiv">
		<div style="padding-left: 70px; padding-right: 70px;">
			<header>
				<h3>Facturas Gas</h3>
			</header>
			<c:if test="${existenFacturasGas != null}">
				<%@ include file="facturasgas.jsp"%>
			</c:if>
			<div class="dropdown">
				<button class="btn dropdown-toggle" type="button"
					data-toggle="dropdown">
					Añadir Factura <span class="caret"></span>
				</button>
				<ul class="dropdown-menu">
					<li><a href="#" id="facturaGasManual">Manual</a></li>
					<li><a href="#">Archivo</a></li>
					<li><a href="#">Enlace</a></li>
				</ul>
			</div>
		</div>

		<div style="padding-left: 70px;">
			<header>
				<h3>Facturas Luz</h3>
			</header>
			<c:if test="${existenFacturasLuz != null}">
				<%@ include file="facturasluz.jsp"%>
			</c:if>
			<div class="dropdown">
				<button class="btn dropdown-toggle" type="button"
					data-toggle="dropdown">
					Añadir Factura <span class="caret"></span>
				</button>
				<ul class="dropdown-menu">
					<li><a href="#">Manual</a></li>
					<li><a href="#">Archivo</a></li>
					<li><a href="#">Enlace</a></li>
				</ul>
			</div>
		</div>


		<div style="padding-left: 70px;">
			<header>
				<h3>Facturas Telefono</h3>
			</header>
			<c:if test="${existenFacturasTelefono != null}">
				<%@ include file="facturastelefono.jsp"%>
			</c:if>
			<div class="dropdown">
				<button class="btn dropdown-toggle" type="button"
					data-toggle="dropdown">
					Añadir Factura <span class="caret"></span>
				</button>
				<ul class="dropdown-menu">
					<li><a href="#">Manual</a></li>
					<li><a href="#">Archivo</a></li>
					<li><a href="#">Enlace</a></li>
				</ul>
			</div>
		</div>
	</div>
	<div id="formularioGas" style="display: none">
		<%@ include file="formulariogas.jsp"%>
	</div>




	<%@ include file="footer.jsp"%>

	<script src="../scripts/libs/jquery.min.js"></script>
	<script src="../scripts/libs/bootstrap.min.js"></script>
	<script src="../scripts/libs/jquery.dataTables.js"></script>
	<script src="../scripts/tables/tablaFacturas.js"></script>
</body>
</html>