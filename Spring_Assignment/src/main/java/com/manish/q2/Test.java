package com.manish.q2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
   ApplicationContext context = new ClassPathXmlApplicationContext("second.xml");
		
		Question info= (Question) context.getBean("info");
		
		QuestionSet info_1= (QuestionSet) context.getBean("info_1");
		
		QuestionMap info_2= (QuestionMap) context.getBean("info_2");
		
		info.display();
		
		info_1.displaySet();
		
		info_2.displayMap();

	}

}
