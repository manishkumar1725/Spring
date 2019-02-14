package com.manish.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ValidateInfo 
{
    
	public ModelAndView check()
	{
		ModelAndView model=new ModelAndView("LoginForm");
		
		model.addObject("msg", "Hello User");
		
		
		return model;
		
		
	}
}
