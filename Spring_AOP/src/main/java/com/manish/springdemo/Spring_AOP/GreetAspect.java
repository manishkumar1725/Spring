package com.manish.springdemo.Spring_AOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class GreetAspect {
	
	@Before("execution(public String getMessage())")
	public void display()
	{
		System.out.println("PRINT THIS BEFORE SAYING HELLO!!");
	}
	
	

}
