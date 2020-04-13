 /*$("#btnLogin").click(function(event) {

    //Fetch form to apply custom Bootstrap validation
    var form = $("#formLogin")

    if (form[0].checkValidity() === false) {
      event.preventDefault()
      event.stopPropagation()
    }
    
    form.addClass('was-validated');
  });*/

$('document').ready(function(){			
	/*var password = document.getElementById("password")
	var confirmPassword = document.getElementById("confirm");
	
	function validatePassword(){
	  if(password.value != confirmPassword.value) {
	    confirmPassword.setCustomValidity("Passwords Don't Match");
	  } else {
	    confirmPassword.setCustomValidity('');
	  }
	}	
	password.onchange = validatePassword;
	confirmPassword.onkeyup = validatePassword;		*/
	
	var password = document.getElementById("#password");
	
	console.log(password);
});