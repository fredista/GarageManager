
$('document').ready(function(){
	
	$('table #editButton').on('click',function(event){
		
		 event.preventDefault();
		 
		 var href = $(this).attr('href');
		 $.get(href,function(state,status){
			 $("#ideditstate").val(state.id);
			 $("#ideditcapital").val(state.id);
			 $("#ideditcode").val(state.code);
			 $("#ideditcountry").val(state.country.capital);
			 $("#ideditname").val(state.name);
		 });
		
		$('#editModal').modal();
	});
	
	
	$('table #deletestateButton').on('click',function(event){
		event.preventDefault();
		
		var href = $(this).attr('href');
		$('#iddeletestatefinal').attr('href',href)
		
		$('#deletestatemodal').modal();
	});
	
});