package com.manish.servlet;

public class DAOutility {
	
	public static Iuser_Dao getUserDao()
	{
		return new UserDAO_v2();
	}

}
