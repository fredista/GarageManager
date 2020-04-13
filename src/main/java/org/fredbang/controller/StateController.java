package org.fredbang.controller;

import org.fredbang.model.State;
import org.fredbang.service.CountryService;
import org.fredbang.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StateController {
	
	@Autowired
	private StateService StateService;
	
	@Autowired
	private CountryService CountryService;

	@GetMapping("/state")
	public String affichage( Model model) {
		
		model.addAttribute("liststate", StateService.listState());
		model.addAttribute("listcpitale", CountryService.listecountry());
		
		//System.out.println("###########"+StateService.listState().size());
		return "State";
	}
	
	@PostMapping("/state/add")
	public String enregistreState( State state) {
		
		//state.setCountryid(5);
		StateService.saveState(state);
		//System.out.println("check value############################"+state.getCountry());
		return "redirect:/state";
	}
	
	
	@GetMapping("/state/update")
	@ResponseBody
	public State recherchebyid(int id) {
		
		return StateService.findid(id);
	}
	
	@GetMapping("/state/delete")
	public String deletestate (int id) {
		
		StateService.deletestate(id);
		
		return "redirect:/state";
	}
}
