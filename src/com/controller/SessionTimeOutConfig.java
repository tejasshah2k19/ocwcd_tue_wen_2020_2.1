package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionTimeOutConfig extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
		int timeOut = Integer.parseInt(request.getParameter("timeout"));	//minutes [2]  
	
		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(timeOut*60);//seconds 
		session.setAttribute("name","i am user");
		response.sendRedirect("Home.jsp");
	}

}
