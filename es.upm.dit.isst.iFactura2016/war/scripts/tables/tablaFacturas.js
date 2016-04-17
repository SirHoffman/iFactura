$(function() {
	$(document).ready(function() {
		$('#tabla_gas').DataTable();
	});
});

$(function() {
	$(document).ready(function() {
		$('#tabla_luz').DataTable();
	});
});

$(function() {
	$(document).ready(function() {
		$('#tabla_telefono').DataTable();
	});
});

$(function() {
	$('#facturaGasManual').click(function(e) {
		$("#formularioGas").show();
		$("#facturasDiv").hide();
		e.preventDefault();
	});
	$('#facturaLuzManual').click(function(e) {
		$("#formularioLuz").show();
		$("#facturasDiv").hide();
		e.preventDefault();
	});
	$('#facturaTelefonoManual').click(function(e) {
		$("#formularioTelefono").show();
		$("#facturasDiv").hide();
		e.preventDefault();
	});

});