package org.fredbang.controller;

import org.fredbang.model.Location;
import org.fredbang.service.CountryService;
import org.fredbang.service.LocationService;
import org.fredbang.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LocationController {

	@Autowired
	private LocationService LocationService;
	@Autowired
	private CountryService countryService;
	@Autowired
	private StateService stateService;
	
	@GetMapping("/location")
	public String Affichageloca(Model model) {
		
		model.addAttribute("location" , LocationService.AffichageLocat());
		model.addAttribute("country", countryService.listecountry());
		model.addAttribute("statelocation", stateService.listState());
		return "Location";
	}
	
	@PostMapping("/location/add")
	public String ajouterloca(Location location) {
		LocationService.Enregistreloca(location);
		
		return "redirect:/location";
	}
	
	@GetMapping("/findlocation")
	@ResponseBody
	public Location rercherlocst(int id) {
		
		return LocationService.findbyid(id);
	}
}
