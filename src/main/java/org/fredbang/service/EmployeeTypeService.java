package org.fredbang.service;

import java.util.List;

import org.fredbang.model.EmployeeType;
import org.fredbang.repository.EmployeeTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeTypeService {

	@Autowired
	private EmployeeTypeRepository employeeTypeRepository;
	
	
	
	public List<EmployeeType> listEmpType(){
		
		return employeeTypeRepository.findAll();
	}
	
	
	// enregistrement
	
	
}
