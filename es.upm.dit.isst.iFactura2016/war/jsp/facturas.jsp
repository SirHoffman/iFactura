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
<!-- Custom CSS -->
<link href="../css/custom.css" rel="stylesheet">
<link href="../css/animate.css" rel="stylesheet">
<!-- Custom Fonts -->
<link href="../css/font-awesome.min.css" rel="stylesheet"
	type="text/css">
</head>
<body>
	<%@ include file="header.jsp"%>
	<c:if test="${facturasgas != null}">
		<%@ include file="facturasgas.jsp"%>
	</c:if>

	<c:if test="${facturasgas != null}">
		<%@ include file="facturasluz.jsp"%>
	</c:if>

	<c:if test="${facturasgas != null}">
		<%@ include file="facturastelefono.jsp"%>
	</c:if>


	<%@ include file="footer.jsp"%>

	<script src="../scripts/libs/jquery.min.js"></script>
	<script src="../scripts/libs/bootstrap.min.js"></script>
	<script src="../scripts/login/tabs.js"></script>
</body>
</html>