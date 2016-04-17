
<table id="tabla_telefono" class="display well" cellspacing="0"
	width="100%">
	<thead>
		<tr>
			<th>Factura</th>
			<th>Nombre</th>
			<th>Compañia</th>
			<th>Importe</th>
			<th>Datos Consumidos</th>
			<th>Voz Consumida</th>
			<th>Fecha</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${facturasTelefono}" var="item">
			<tr>
				<td>${item.id}</td>
				<td>${item.nombre}</td>
				<td>${item.importe}</td>
				<td>${item.datosConsumidos}</td>
				<td>${item.vozConsumida}</td>
				<td>${item.fecha}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
