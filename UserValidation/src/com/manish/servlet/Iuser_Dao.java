package com.manish.servlet;

public interface Iuser_Dao {
	
	public String getType(String username,String password);
	
	public void addUsername(user user_1);
	
	public void changePassword(String username,String newPassword);
	
	public void removeUser(String username);
	
	

}
