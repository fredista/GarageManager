package org.fredbang.service;

import java.util.List;

import org.fredbang.model.Location;
import org.fredbang.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class LocationService {
	
	@Autowired
	private LocationRepository locationRepository;
	
	public List<Location> AffichageLocat(){
		
		return locationRepository.findAll(); 
	}

	
	
	public void Enregistreloca(Location location) {
		locationRepository.save(location);
	}
	
	
	public Location findbyid(int id) {
		
		return locationRepository.findById(id).get();
	}
}


