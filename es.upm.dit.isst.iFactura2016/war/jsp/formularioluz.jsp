<form id="formGas" class="form-horizontal" action="/nuevaFactura"
	method="post" role="form">
	<input type="hidden" class="form-control" name="tipo" id="tipo"
		value="luz">

	<div class="form-group">
		<label class="control-label col-sm-2" for="empresa">Empresa:</label>
		<div class="col-sm-3">
			<input type="text" class="form-control" name="empresa" id="empresa"
				placeholder="Empresa">
		</div>
	</div>

	<div class="form-group">
		<label class="control-label col-sm-2" for="importe">Importe:</label>
		<div class="col-sm-3">
			<input type="number" class="form-control" name="importe" id="importe"
				placeholder="Importe">
		</div>
	</div>

	<div class="form-group">
		<label class="control-label col-sm-2" for="potenciaContratada">Potencia
			Contratada:</label>
		<div class="col-sm-3">
			<input type="number" class="form-control" name="potenciaContratada"
				id="potenciaContratada" placeholder="Potencia Contratada">
		</div>
	</div>

	<div class="form-group">
		<label class="control-label col-sm-2" for="potenciaFacturada">Potencia
			Facturada:</label>
		<div class="col-sm-3">
			<input type="number" class="form-control" name="potenciaFacturada"
				id="potenciaFacturada" placeholder="Potencia Facturada">
		</div>
	</div>

	<div class="form-group">
		<label class="control-label col-sm-2" for="consumoFacturado">Consumo
			Facturado</label>
		<div class="col-sm-3">
			<input type="number" class="form-control" name="consumoFacturado"
				id="consumoFacturado" placeholder="Consumo Facturado">
		</div>
	</div>

	<div class="form-group">
		<label class="control-label col-sm-2" for="equiposMedida">Equipos
			Medida:</label>
		<div class="col-sm-1">
			<input type="checkbox" class="form-control" name="equiposMedida"
				id="equiposMedida">
		</div>
	</div>

	<div class="form-group">
		<label class="control-label col-sm-2" for="consumoServicios">Consumo
			Servicios</label>
		<div class="col-sm-3">
			<input type="number" class="form-control" name="consumoServicios"
				id="consumoServicios" placeholder="Consumo Servicios">
		</div>
	</div>

	<div class="form-group">
		<div class="col-sm-offset-2 col-sm-10">
			<button type="submit" class="btn btn-default">Añade Factura</button>
		</div>
	</div>
</form>