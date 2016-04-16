$(function() {
	$('#facturas').tab('show');

	$('#headerTabs a').click(function(e) {
		e.preventDefault()
		$(this).tab('show')
	})
});