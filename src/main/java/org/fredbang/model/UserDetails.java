package org.fredbang.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserDetails {
	
	@Id @GeneratedValue
	private int id;
	

}
