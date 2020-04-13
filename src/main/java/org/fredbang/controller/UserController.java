package org.fredbang.controller;

import org.fredbang.model.User;
import org.fredbang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class UserController {
	
	
	@Autowired private UserService userService;
	
	
	
	@PostMapping(value="users/addNew")
	public RedirectView addNew(User user, RedirectAttributes redir) {
		//user.setPassword(encoder.encode(user.getPassword()));
		user.setActive(true);
		userService.saveuser(user);	
		RedirectView  redirectView= new RedirectView("/login",true);
	        redir.addFlashAttribute("message",
	    		"You successfully registered! You can now login");
	    return redirectView;				
	}	
}
