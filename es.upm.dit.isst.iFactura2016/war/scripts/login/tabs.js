$(function() {
	$('#editProfile').click(function(e) {
		$("#editProfileDiv").show();
		$("#homeDiv").hide();
		e.preventDefault();
	});

	$('#editBack').click(function(e) {
		$("#editProfileDiv").hide();
		$("#homeDiv").show();
		e.preventDefault();
	});
});