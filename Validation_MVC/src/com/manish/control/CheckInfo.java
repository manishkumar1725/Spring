package com.manish.control;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.manish.model.UserInfo;;

public class CheckInfo {
	
	
	@RequestMapping(value = "/LoginForm", method = RequestMethod.GET)
	public String init(Model model) {
		model.addAttribute("msg", "Please Enter Your Login Details");
		return "LoginForm";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String submit(Model model, @ModelAttribute("UserDAO") UserInfo userinfo) 
	{
		if (userinfo != null && userinfo.getUsername() != null & userinfo.getPassword() != null) 
		{
			if (userinfo.getUsername().equals("MANISH") && userinfo.getPassword().equals("123456")) 
			{
				model.addAttribute("msg", userinfo.getUsername());
				
				return "Show";
			} 
			else 
			{
				model.addAttribute("error", "Invalid Details");
				return "LoginForm";
			}
		} 
		else 
		{
			model.addAttribute("error", "Please enter Details");
			return "LoginForm";
		}
	}
}


