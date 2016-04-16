
<table id="tabla_gas" class="display well" cellspacing="0" width="100%">
	<thead>
		<tr>
			<th>Id Factura</th>
			<th>Cantidad</th>
			<th>Consumo</th>
			<th>Fecha Inicio</th>
			<th>Fecha Fin</th>
			<th>Fecha Emision</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${facturasGas}" var="item">
			<tr>
				<td>${item.idFactura}</td>
				<td>${item.importe}</td>
				<td>${item.consumo}</td>
				<td>${item.fechaInicio}</td>
				<td>${item.fechaFin}</td>
				<td>${item.fechaEmision}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>