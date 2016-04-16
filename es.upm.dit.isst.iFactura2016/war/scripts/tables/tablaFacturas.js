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
	$('#login-form-link').click(function(e) {
		$(".login-form").delay(100).fadeIn(100);
		$("#register-form-link").delay(100).fadeIn(100);
		$("#password-form-link").delay(100).fadeIn(100);
		$(".register-form").fadeOut(100);
		$(".password-form").fadeOut(100);
		$("#login-form-link").fadeOut(100);
		e.preventDefault();
	});
	$('#password-form-link').click(function(e) {
		$(".password-form").delay(100).fadeIn(100);
		$("#login-form-link").delay(100).fadeIn(100);
		$(".register-form").fadeOut(100);
		$(".login-form").fadeOut(100);
		$("#register-form-link").fadeOut(100);
		$("#password-form-link").fadeOut(100);
		e.preventDefault();
	});
});