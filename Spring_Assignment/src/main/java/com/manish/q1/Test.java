package com.manish.q1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
		
		ApplicationContext context = new ClassPathXmlApplicationContext("first.xml");
		
		Customer info= (Customer) context.getBean("info");
		info.show();
		

	}

}
