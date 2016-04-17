
<table id="tabla_luz" class="display " cellspacing="0" width="100%">
	<thead>
		<tr>
			<th>Id Factura</th>
			<th>Empresa</th>
			<th>Importe</th>
			<th>Potencia Contratada</th>
			<th>Potencia Facturada</th>
			<th>Consumo Facturado</th>
			<th>Consumo Servicios</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${facturasLuz}" var="item">
			<tr>
				<td>${item.idFactura}</td>
				<td>${item.empresa}</td>
				<td>${item.importe}</td>
				<td>${item.potenciaContratada}</td>
				<td>${item.potenciaFacturada}</td>
				<td>${item.consumoFacturado}</td>
				<td>${item.consumoServicios}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>