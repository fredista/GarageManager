package org.fredbang.service;

import java.util.List;

import org.fredbang.model.Client;
import org.fredbang.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClientService {
	
	@Autowired
	private ClientRepository clientRepository;
	
	public List<Client> listeclt(){
		
		return clientRepository.findAll();
	}

	public void enregistreclt(Client client) {
		clientRepository.save(client);
	}
	
	// rechere un client par son id il prend en entree le id du client
	public Client findid(int id) {
		
		return clientRepository.findById(id).get();
	}
	
	// fonction permettant de supprimer par id
	public void deleteid(int id) {
		
		clientRepository.deleteById(id);
	}
}
