package org.fredbang.sec;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class SecurityContrllr {

	@RequestMapping(value="/login",method = RequestMethod.GET)
	public String login() {
		
		return "logine";
	}
	
	@GetMapping("/registre")
	public String registre() {
		
		return "registre";
	}

	@RequestMapping(value="/")
	public String home() {
			
			return "redirect:/index";
		}
}
