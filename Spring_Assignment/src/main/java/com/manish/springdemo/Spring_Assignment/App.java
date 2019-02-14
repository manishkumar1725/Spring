package com.manish.springdemo.Spring_Assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
    	Main main = context.getBean(Main.class);
    	main.show();
    	
    }
}

