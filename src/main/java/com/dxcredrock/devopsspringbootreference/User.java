/**
 * 
 */
/**
 * @author gn35
 *
 */
package com.dxcredrock.devopsspringbootreference;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	public User() {}
	public User(String name1,String name2, String string) {
		this.firstName = name1;
		this.lastName = name2;
		this.email = string;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String firstName;
	private String lastName;
	private String email;

	public long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String name) {
		this.firstName = name;
	}

	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	  @Override
	  public String toString() {
	    return "id = "+id+"; FirstName = "+firstName+"; LastName = "+lastName+"; email = "+email;
	  }

	// standard constructors / setters / getters / toString
}