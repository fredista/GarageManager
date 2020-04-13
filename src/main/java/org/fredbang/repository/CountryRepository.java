package org.fredbang.repository;

import java.util.List;

import org.fredbang.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;




public interface CountryRepository extends JpaRepository<Country, Integer> {
	
	
	@Query("Select capital from Country ")
	public List<String> listecapitale();
}
