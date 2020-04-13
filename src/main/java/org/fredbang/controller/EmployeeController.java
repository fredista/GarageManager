package org.fredbang.controller;

import org.fredbang.model.Employee;
import org.fredbang.repository.EmployeeRepository;
import org.fredbang.service.CountryService;
import org.fredbang.service.EmployeService;
import org.fredbang.service.EmployeeTypeService;
import org.fredbang.service.JobTitleService;
import org.fredbang.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeService employeService;
	@Autowired
	private CountryService CountryService;
	@Autowired
	private JobTitleService JobTitleService;
	@Autowired
	private EmployeeTypeService employeTypeService;
	@Autowired
	private StateService stateService;
	@GetMapping("/employe")
	public String Affichagempl(Model model) {
		
		model.addAttribute("empl", employeService.affichageEmp());
		model.addAttribute("country", CountryService.listecountry());
		model.addAttribute("jobtitle", JobTitleService.AffichageList());
		model.addAttribute("empltype", employeTypeService.listEmpType());
		model.addAttribute("stat", stateService.listState());
		
		//System.out.println("test job##############"+JobTitleService.AffichageList().size());
		return "Employee";
	}
	
	
	@PostMapping("/client/add")
	public String saveclt(Employee employe) {
		
		employeService.savEmpl(employe);
		
		return "redirect:/employe";
	}
}
