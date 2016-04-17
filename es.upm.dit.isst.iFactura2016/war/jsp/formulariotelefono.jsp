<form id="formGas" class="form-horizontal" action="/nuevaFactura"
	method="post" role="form">
	<input type="hidden" class="form-control" name="tipo" id="tipo"
		value="telefono">

	<div class="form-group">
		<label class="control-label col-sm-2" for="nombre">Nombre:</label>
		<div class="col-sm-3">
			<input type="text" class="form-control" name="nombre" id="nombre"
				placeholder="Nombre">
		</div>
	</div>

	<div class="form-group">
		<label class="control-label col-sm-2" for="compania">Compañia:</label>
		<div class="col-sm-3">
			<input type="text" class="form-control" name="compania" id="compania"
				placeholder="Compania">
		</div>
	</div>

	<div class="form-group">
		<label class="control-label col-sm-2" for="importe">Importe:</label>
		<div class="col-sm-3">
			<input type="number" step="any" class="form-control" name="importe"
				id="importe" placeholder="Importe">
		</div>
	</div>
	<div class="form-group">
		<label class="control-label col-sm-2" for="datoscontratados">Datos
			Contratados:</label>
		<div class="col-sm-3">
			<input type="number" step="any" class="form-control"
				name="datoscontratados" id="datoscontratados"
				placeholder="Datos Contratados">
		</div>
	</div>

	<div class="form-group">
		<label class="control-label col-sm-2" for="datosconsumidos">Datos
			Consumidos:</label>
		<div class="col-sm-3">
			<input type="number" step="any" class="form-control"
				name="datosconsumidos" id="datosconsumidos"
				placeholder="Datos Consumidos">
		</div>
	</div>

	<div class="form-group">
		<label class="control-label col-sm-2" for="lte">LTE:</label>
		<div class="col-sm-1">
			<input type="checkbox" class="form-control" name="lte" id="lte">
		</div>
	</div>

	<div class="form-group">
		<label class="control-label col-sm-2" for="vozcontratada">Voz
			Contratada:</label>
		<div class="col-sm-3">
			<input type="number" step="any" class="form-control"
				name="vozcontratada" id="vozcontratada" placeholder="Voz Contratada">
		</div>
	</div>

	<div class="form-group">
		<label class="control-label col-sm-2" for="vozconsumida">Voz
			Consumida:</label>
		<div class="col-sm-3">
			<input type="number" step="any" class="form-control"
				name="vozconsumida" id="vozconsumida" placeholder="Voz Consumida">
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