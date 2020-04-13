package org.fredbang.service;

import java.util.List;

import org.fredbang.model.Employee;
import org.fredbang.repository.CountryRepository;
import org.fredbang.repository.EmployeeRepository;
import org.fredbang.repository.EmployeeTypeRepository;
import org.fredbang.repository.JobTitleRepository;
import org.fredbang.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeService {
	
	@Autowired
	private EmployeeRepository employeRepository;
	
	
	public List<Employee> affichageEmp(){
		
		return employeRepository.findAll();
	}

	
	public void savEmpl(Employee employe) {
		
		employeRepository.save(employe);
	}
}
