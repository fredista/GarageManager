package org.fredbang.service;

import java.util.List;

import org.fredbang.model.JobTitle;
import org.fredbang.repository.JobTitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class JobTitleService {
	
	@Autowired
	private JobTitleRepository jobTitleRepository;
	
	
	public List<JobTitle> AffichageList(){
		
		return jobTitleRepository.findAll();
	}

}
