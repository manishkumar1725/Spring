package com.manish.servlet;



public class user {
	
	String username;
	String password;
	String type;
	
	public user(String username, String password,String type) 
	{
		
		this.username = username;
		this.password = password;
		this.type = type;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}
	
	public String getType() {
		return type;
	}

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
		return "user [username=" + username + ", password=" + password
				+ ", type=" + type + "]";
	}
	
	
	
	
	
	
	
	

}
