package com.example.HAD.login.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LoginBean {
	
	  @Id
	  @Column( length = 50)
	    private String id;

	    public String getId() {
	        return id;
	    }

	    private String password;

	    public String getPassword() {
	        return password;
	    }

	    public void setId(String id) {
	        this.id = id;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public void setType(String type) {
	        this.type = type;
	    }

	    public String getType() {
	        return type;
	    }

	    private String type;


}
