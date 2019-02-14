package com.manish.servletdemo;

public class InvalidUserException extends RuntimeException 
{
	public InvalidUserException(String msg)
	{
		super(msg);
	}
	

}
