package org.fredbang.controller;

import org.fredbang.model.Client;
import org.fredbang.service.ClientService;
import org.fredbang.service.CountryService;
import org.fredbang.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ClientController {
	
	@Autowired
	private ClientService ClientService;
	@Autowired
	private CountryService countryService;
	@Autowired
	private StateService stateService;
	
	@GetMapping("/client")
	public String affichageclient(Model model) {
		
		model.addAttribute("listeclt", ClientService.listeclt());
		model.addAttribute("country", countryService.listecountry());
		model.addAttribute("state", stateService.listState());
		
		return "Client";
	}

	@PostMapping("/client/save")
	public String saveClt(Client client) {
		ClientService.enregistreclt(client);
		
		return "redirect:/client";
	}
	
	@GetMapping("/clientid")
	@ResponseBody
	public Client rechercheclt(int id) {
		
		return ClientService.findid(id);
	}
	
	// fonction permettant de faire la mise a jour
	
	@RequestMapping(value="/client/update" , method = {RequestMethod.PUT,RequestMethod.GET})
	public String clientupdate(Client client) {
		ClientService.enregistreclt(client);
		
		return "redirect:/client";
	}
	
	// fonction permettant de supprimer
	@RequestMapping(value="/deleteid",method = {RequestMethod.DELETE,RequestMethod.GET})
	public String  delete(int id) {
		
		ClientService.deleteid(id);
		
		return "redirect:/client";
	}
}

