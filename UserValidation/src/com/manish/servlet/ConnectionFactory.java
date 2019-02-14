package com.manish.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConnectionFactory {
	
	private static Connection connection;
	
	public static Connection getConnection()
	{
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
	  connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","orcl11g");
		}catch(SQLException e)
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		return connection;
	}
	
	public static Connection closeConnection()
	{
		
		try{
		connection.close();
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		return connection;
	  
	}
	
	public static void main(String args[])
	{
		System.out.println(ConnectionFactory.getConnection());
	}


}
