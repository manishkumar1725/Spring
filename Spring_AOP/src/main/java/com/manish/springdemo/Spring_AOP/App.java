package com.manish.springdemo.Spring_AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
       
        Greet greet = (Greet) context.getBean("greet");
       
        System.out.println(greet.getMessage());
    }
}
