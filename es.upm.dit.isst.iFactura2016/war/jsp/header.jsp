<nav class="navbar navbar-default" role="navigation">
	<!-- Collect the nav links, forms, and other content for toggling -->
	<div class="row">
		<div class="col-md-3">
			<ul class="nav navbar-nav">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">iFactura <b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="/ifactura2016">Home</a></li>
						<li><a href="/facturas">Facturas</a></li>
						<li><a href="/ofertas">Ofertas</a></li>
						<li><a href="${url }">Salir</a></li>
					</ul></li>
			</ul>
		</div>
		<div class="col-md-3" style="padding-top: 7px">
			<c:if test="${user != null}">
				<h5>Hola ${user}</h5>
			</c:if>
		</div>
	</div>
</nav>