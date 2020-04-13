
$('document').ready(function(){
	
	$('table #editerlocalButton').on('click',function(event){
		
		 event.preventDefault();
		 var href = $(this).attr('href');
		 $.get(href,function(local,status){
			
			 $('#idediadressloca').val(local.id);
		 });
		 
		$('#editerlocalModal').modal();
	});
	
	
});