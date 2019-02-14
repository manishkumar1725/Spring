package com.manish.servlet;

import java.util.ArrayList;

import com.manish.servlet.user;

public class UserDAO implements Iuser_Dao {
	
	ArrayList<user> userlist;
	
	public UserDAO()
	{
	userlist = new ArrayList<>();
	
	userlist.add(new user("MANISH","123456","ADMIN"));
	userlist.add(new user("RISHAV","12345","USER"));
	userlist.add(new user("AMIT","1234","ADMIN"));
	
	}
	
	public String getType(String username,String password)
	{
		
		
		for(user user_1:userlist)
		{
			if(user_1.getUsername().equals(username) && user_1.getPassword().equals(password))
			{
				return user_1.getType();
			}
		}
		
		throw new InvalidUserException("ACCOUNT DOES NOT EXIST!!");
		
		
	
			
	 }

	@Override
	public void addUsername(user user_1) {
		
		
	}

	@Override
	public void changePassword(String username, String newPassword) {
		
		
	}

	@Override
	public void removeUser(String username) {
		
		
	}
	
}

