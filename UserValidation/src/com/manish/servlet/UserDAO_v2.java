package com.manish.servlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO_v2 implements Iuser_Dao{

	@Override
	public String getType(String username, String password) {
	
		Connection connection =ConnectionFactory.getConnection();
		
		try{
		PreparedStatement statement = connection.prepareStatement("select * from UserInfo where username = ? and password = ?");
		statement.setString(1, username);
		statement.setString(2, password);
		
		ResultSet set = statement.executeQuery();
		
		while(set.next())
		{
			if(set.getString("username").equals(username) && set.getString("password").equals(password))
			{
				return set.getString("usertype");
			}
		}
		
	}catch(SQLException e)
	{
		e.printStackTrace();
	}
	
		return null;
	}	
	@Override
	public void addUsername(user user_1) {
		
		
	}

	@Override
	public void changePassword(String username, String newPassword) {
		
		
	}

	@Override
	public void removeUser(String username) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String args[])
	{
		System.out.println(new UserDAO_v2().getType("manish","123456"));
	}

}


