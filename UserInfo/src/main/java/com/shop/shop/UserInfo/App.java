package com.shop.shop.UserInfo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    
    	    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

    			UserDAO dao = (UserDAO) context.getBean("userdao");
    			
    			User user=new User();
    			
    			user.setId(1);
    			user.setName("abc");
    			
    			dao.saveUser(user);
    			((AbstractApplicationContext) context).close();
    			
    	    }
    	

    }

