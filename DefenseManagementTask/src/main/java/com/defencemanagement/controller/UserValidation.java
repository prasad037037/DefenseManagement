package com.defencemanagement.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.defencemanagement.model.Credentials;



public class UserValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UserValidation() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<center>");
		String get_username = request.getParameter("name");
		String get_password = request.getParameter("pwd");
		if (get_username.equals(Credentials.username) && get_password.equals(Credentials.userpassword)) {

			RequestDispatcher dispatcher = request.getRequestDispatcher("findthief.jsp");
			dispatcher.include(request, response);
	}
		else
		{
			out.println("<font color=red><b>Invalid:Please enter the valid details<b></font>");
			RequestDispatcher dispatcher = request.getRequestDispatcher("userlogin.jsp");
			dispatcher.include(request, response);
		}

}
	
}