<form id="formGas" class="form-horizontal" action="/nuevaFactura"
	method="post" role="form">
	<input type="hidden" class="form-control" name="tipo" id="tipo"
		value="telefono">

	<div class="form-group">
		<label class="control-label col-sm-2" for="cantidad">Cantidad:</label>
		<div class="col-sm-3">
			<input type="number" class="form-control" name="cantidad"
				id="cantidad" placeholder="Cantidad">
		</div>
	</div>

	<div class="form-group">
		<label class="control-label col-sm-2" for="consumo">Consumo</label>
		<div class="col-sm-3">
			<input type="number" class="form-control" name="consumo" id="consumo"
				placeholder="Consumo">
		</div>
	</div>

	<div class="form-group">
		<label class="control-label col-sm-2" for="fechainicio">Fecha
			Inicio:</label>
		<div class="col-sm-3">
			<input type="date" class="form-control" name="fechainicio"
				id="fechainicio" placeholder="Fecha Inicio">
		</div>
	</div>
	<div class="form-group">
		<label class="control-label col-sm-2" for="fechafin">Fecha
			Fin:</label>
		<div class="col-sm-3">
			<input type="date" class="form-control" name="fechafin" id="fechafin"
				placeholder="Fecha Fin">
		</div>
	</div>
	<div class="form-group">
		<label class="control-label col-sm-2" for="fechaemision">Fecha
			Emision:</label>
		<div class="col-sm-3">
			<input type="date" class="form-control" name="fechaemision"
				id="fechaemision" placeholder="Fecha Emision">
		</div>
	</div>

	<div class="form-group">
		<div class="col-sm-offset-2 col-sm-10">
			<button type="submit" class="btn btn-default">Añade Factura</button>
		</div>
	</div>
</form>