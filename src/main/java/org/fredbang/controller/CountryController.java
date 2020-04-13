package org.fredbang.controller;

import java.util.List;

import org.fredbang.model.Country;
import org.fredbang.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CountryController {
	
	@Autowired
	private CountryService countryService;
	
	@GetMapping("/countries")
	public String AffichageCountry(Model model) {
			List<Country> listecountry = countryService.listecountry();
		
			model.addAttribute("listepays",listecountry);
		
		return "country";
	}
	
	@PostMapping("/countrie/add")
	public String addcountry(Country country) {
		
		countryService.enregistrer(country);
		//System.out.println("entree deux");
		return "redirect:/countries";	
	}
	
	@GetMapping("/country/rechercheid")
	@ResponseBody
	public Country rechercheid(int id) {
		
		Country country = countryService.findid(id);		
		return country;
	}
	
	@PostMapping("/country/update")
	public String update(Country country) {
		
	Country count=	countryService.findid(country.getId());
	count.setCapital(country.getCapital());
	count.setCode(country.getCode());
	count.setContinent(country.getContinent());
	count.setDescription(country.getDescription());
	count.setNationality(country.getNationality());
	
	countryService.enregistrer(count);
		
		//System.out.println("WWWWWWWWWWWW"+country.getId());
		
		return "redirect:/countries";
	}
	
	@RequestMapping(value="/country/delete",method = {RequestMethod.DELETE,RequestMethod.GET})
	public String delcountry(int id) {
		
	  countryService.delete(id);
		
		return "redirect:/countries";
	}
}


