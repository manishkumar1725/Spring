package com.manish.servletdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/validate")
public class Validate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		 String username,password;
		 
		 username=request.getParameter("username");
		 password = request.getParameter("password");
		 String type="invalid";
		 
	     PrintWriter out = response.getWriter();
	     
	  try{
		  type = getType(username,password);
		  
		  RequestDispatcher requestDispatcher = null;
		  
		  if(type.equals("ADMIN"))
		  {
			  requestDispatcher = request.getRequestDispatcher("/admin");
		  }
		  else if(type.equals("USER"))
		  {
			  requestDispatcher = request.getRequestDispatcher("/user");
		  }
		  else
			  requestDispatcher = request.getRequestDispatcher("/invalid");
			  
		  }
	  catch(InvalidUserException e)
	  {
		  out.println(e.getMessage());
	  }
	    
	   
	     
	}
	private String getType(String username, String password) 
	{
		User_Dao dao = new User_Dao();
		
		return dao.getType(username, password);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 doGet(request, response);

}
}