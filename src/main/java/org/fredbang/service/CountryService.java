package org.fredbang.service;

import java.util.List;
import java.util.Optional;

import org.fredbang.model.Country;
import org.fredbang.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

	@Autowired
	private CountryRepository countryRepository;
	
	
	public List<Country> listecountry() {
		
		
		return countryRepository.findAll();
	}
	
	public void enregistrer(Country country) {
		countryRepository.save(country);
	}
	
	public Country findid(int id) {
		return countryRepository.findById(id).get();
	}
	
	public void delete(int id) {
		
		countryRepository.deleteById(id);
	}
		
public List<String> listcapitale(){
		
		return countryRepository.listecapitale();
	}
}
