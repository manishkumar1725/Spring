package com.manish.servletdemo;

public class User {
	
	String username;
	String password;
	String type;
	
	public User(String username, String password, String type)
	{
		this.username = username;
		this.password = password;
		this.type = type;
	}
	
	//GETTERS..

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getType() {
		return type;
	}

    //SETTERS..
	
	public void setUsername(String username) {
		this.username = username;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password
				+ ", type=" + type + "]";
	}
	
	
	
	
	

}
