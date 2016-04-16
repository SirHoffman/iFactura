
<table id="tabla_telefono" class="display well" cellspacing="0"
	width="100%">
	<thead>
		<tr>
			<th>NºFactura</th>
			<th>Periodo</th>
			<th>Fecha Emision</th>
			<th>Codigo</th>
			<th>Cantidad</th>
			<th>Consumido</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${facturasTelefono}" var="item">
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
