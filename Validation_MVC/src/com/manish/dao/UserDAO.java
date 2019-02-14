package com.manish.dao;

import java.util.ArrayList;

import com.manish.model.UserInfo;

public class UserDAO
{	
	ArrayList<UserInfo> userlist;
	
	public UserDAO()
	{
	userlist = new ArrayList<>();
	
	userlist.add(new UserInfo("MANISH","123456"));
	userlist.add(new UserInfo("RISHAV","12345"));
	userlist.add(new UserInfo("AMIT","1234"));
	
	}
}
	


