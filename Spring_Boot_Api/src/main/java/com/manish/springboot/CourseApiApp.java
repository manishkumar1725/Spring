package com.manish.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication   // This Annotation tells spring-boot that this is the starting point of our spring-boot app.
public class CourseApiApp {

    public static void main(String args[])
    {
    	SpringApplication.run(CourseApiApp.class, args);
    }
}
