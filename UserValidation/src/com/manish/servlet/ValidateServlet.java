package com.manish.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/validate")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
     
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		
		String username,password;
		
		PrintWriter out = response.getWriter();
		
		username=request.getParameter("username");
		password=request.getParameter("password");
		String type = "invalid";
		
		try
		{
			type = getType(username,password);

		    RequestDispatcher requestDispatcher=null;
		
		if(type.equals("ADMIN"))
		{
			requestDispatcher = request.getRequestDispatcher("/admin");
			//out.println("<h2>HELLO ADMIN "+username+"<h2>");
	    }
		
		else if(type.equals("USER"))
		{
			requestDispatcher = request.getRequestDispatcher("/user");
			//out.println("<h2>HELLO USER "+username+"<h2>");
		}
		else
		{
			requestDispatcher = request.getRequestDispatcher("/invalid");
			out.println("INVALID USER");
		}
		
		//out.println("<H1>HELLO MANISH!!</H1>");
	    requestDispatcher.forward(request,response);
		}
		catch(InvalidUserException e)
		{
		  out.println(e.getMessage());
		}
		
	}

	
	

	private String getType(String username, String password) {
		
		Iuser_Dao dao =DAOutility.getUserDao();
		return dao.getType(username, password);
		
	}




	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}
	
	

}
