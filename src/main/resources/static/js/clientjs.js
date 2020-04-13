
$('document').ready(function(){
	
	$('table #editcltButton').on('click',function(event){
		
		event.preventDefault();
		
		var href = $(this).attr('href');
		$.get(href,function(stat,status){
			$('#ideditcltdetail').val(stat.details);
		});
		
		
		$('#editcltmodal').modal();
	});
	
	$('table #deletecltButton').on('click',function(event){
		
		event.preventDefault();
		
		var href = $(this). attr('href');
		console.log(href);
		$('#idcltbtn').attr('href',href)
		
		
		$('#idcltdeleteModal').modal();
	});
	
});