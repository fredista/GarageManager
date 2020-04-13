package org.fredbang.service;

import java.util.List;

import org.fredbang.model.State;

import org.fredbang.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StateService {

	@Autowired
	private StateRepository stateRepository;
	
	
	
	
	public List<State> listState(){
		
		return stateRepository.findAll();
	}
	
	
	public void saveState(State state) {
		
		stateRepository.save(state);
	}
	
	public State findid(int id) {
		
		return stateRepository.findById(id).get();
	}
	
	
	public void deletestate(int id) {
		
		stateRepository.deleteById(id);
	}
}
