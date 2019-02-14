package com.manish.springboot.Hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//By Making a class as RestController it means we have method in here which will map to url request.

@RestController
public class HelloController {
	
 // @RequestMapping maps only to GET Method by Default.To map other HTTP methods,we have to specify it in annotations
	
	@RequestMapping("/hello")
	public String sayHello()
	{
		return "Welcome to Spring-Boot Demo";
	}
	

}
