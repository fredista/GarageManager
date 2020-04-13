
$('document').ready(function(){
	$('table #editButton').on('click',function(event){
		 event.preventDefault();
		var href = $(this).attr('href');
		$.get(href,function(country,status){
			$('#id').val(country.id);
			$('#iddesciption').val(country.description);
			$('#idcapital').val(country.capital);
			$('#idcode').val(country.code);
			$('#idcontinent').val(country.continent);
			$('#idnationality').val(country.nationality);
			
			
			
		});
		$('#editmodal').modal();
	});
	
	$('table #deleteButton').on('click',function(event){
		event.preventDefault();
		var href = $(this).attr('href');
		$('#iddelete').attr('href',href)
		
		$('#deleteModal').modal();
	});
	
	$('table #audiblebutton').on('click', function(event){
		
		event.preventDefault();
		var href = $(this).attr('href');
		$.get(href,function(country,status){
			$('#id').val(country.id);
			$('#iddesciption').val(country.description);
		//$('#idcapit').val(country.createby);
			//$('#idco').val(country.createddate);
			//$('#idcontine').val(country.lastmodifiedby);
			//$('#idnationali').val(country.lastmodifieddate);
			
			console.log(country.lastmodifieddate);
				console.log(country.id);
				console.log(country.capital);
				console.log(country.createdby);
		$('#audiblemodal').modal();
	});

});
});