<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
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
	<div id="homeDiv" style="padding: 70px 70px 70px 70px;">
		<h1>PAGINA HOME</h1>

		<div class="col-sm-offset-2 col-sm-10">
			<button type="submit" id="editProfile" class="btn btn-default">Editar
				Perfil</button>
		</div>
	</div>
	<div id="editProfileDiv"
		style="padding: 70px 70px 70px 70px; display: none">
		<%@ include file="editprofile.jsp"%>
	</div>


	<%@ include file="footer.jsp"%>
	<script src="../scripts/libs/jquery.min.js"></script>
	<script src="../scripts/libs/bootstrap.min.js"></script>
	<script src="../scripts/login/tabs.js"></script>
</body>
</html>