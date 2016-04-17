
<form class="form-horizontal" action="/nuevoUser" method="post"
	role="form">
	<h2 class="form-signin-heading">Registro</h2>
	<div class="form-group">
		<label class="control-label col-sm-2" for="nombre">Nombre /
			Cuenta de Google:</label>
		<div class="col-sm-3">
			<input type="text" class="form-control" name="nombre" id="nombre"
				placeholder="Nombre/Cuenta de Google" required="">
		</div>
	</div>

	<div class="form-group">
		<label class="control-label col-sm-2" for="apellidos">Apellidos:</label>
		<div class="col-sm-3">
			<input type="text" class="form-control" name="apellidos"
				id="apellidos" placeholder="Apellidos" required="">
		</div>
	</div>

	<div class="form-group">
		<label class="control-label col-sm-2" for="edad">Edad:</label>
		<div class="col-sm-3">
			<input type="number" class="form-control" name="edad" id="edad"
				placeholder="Edad" required="">
		</div>
	</div>

	<div class="form-group">
		<label class="control-label col-sm-2" for="dni">DNI:</label>
		<div class="col-sm-3">
			<input type="text" class="form-control" name="dni" id="dni"
				placeholder="DNI" required="">
		</div>
	</div>

	<div class="form-group">
		<label class="control-label col-sm-2" for="codigopostal">Codigo
			Postal:</label>
		<div class="col-sm-3">
			<input type="number" class="form-control" name="codigopostal"
				id="codigopostal" placeholder="Codigo Postal" required="">
		</div>
	</div>

	<div class="form-group">
		<label class="control-label col-sm-2" for="email">Email:</label>
		<div class="col-sm-3">
			<input type="email" class="form-control" name="email" id="email"
				placeholder="Email" required="">
		</div>
	</div>

	<div class="form-group">
		<label class="control-label col-sm-2" for="password">Contraseña:</label>
		<div class="col-sm-3">
			<input type="password" class="form-control" name="password"
				id="password" placeholder="Contraseña" required="">
		</div>
	</div>

	<button class="btn btn-primary" type="submit">Crear cuenta</button>
</form>
<div style="padding-bottom: 15px; padding-top: 15px">
	<a id="registrationBack" href="">Atras</a>
</div>