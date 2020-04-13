package org.fredbang.service;

import org.fredbang.model.User;
import org.fredbang.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepositroy;
	
	 //@Autowired private BCryptPasswordEncoder encoder;

	public void saveuser(User user) {
		
		//user.setPassword(encoder.encode(user.getPassword()));
		
		userRepositroy.save(user);
		
	}
}
