package com.manish.servletdemo;

import java.util.ArrayList;

public class User_Dao {


	ArrayList<User> userList;
		
	public User_Dao()
	{
		userList = new ArrayList<>();
		
		userList.add(new User("MANISH","123456","ADMIN"));
		userList.add(new User("AKASH","12345","USER"));
		userList.add(new User("ABHI","1234","ADMIN"));
		
	}
	
	public String getType(String username,String password)
	{
	for(User user :userList)
	{
			if(user.getUsername().equals(username) && user.getPassword().equals(password))
		{
			return user.getType();	
		}
	}
		
		throw new InvalidUserException("ACCOUNT DOES NOT EXIST!!");
		
		
	}

	

}
