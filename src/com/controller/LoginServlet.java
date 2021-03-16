package com.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	
	int k;
	
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// servlet ->parameter --> get -->ServletConfig

		ServletConfig config = getServletConfig();
		ServletContext context = getServletContext();

		String cEmail = config.getInitParameter("email");
		String cPassword = config.getInitParameter("password");

		String appName = context.getInitParameter("appName");
		System.out.println("LoginServlet ==> " + appName);

		String email = request.getParameter("email");
		String password = request.getParameter("password");

//		if (cEmail.equalsIgnoreCase(email) && cPassword.equals(password)) {
//		
		if (cPassword.equals(password)) {

			//session
			HttpSession session = request.getSession();
			session.setAttribute("email",email);
			session.setAttribute("isLogin", true);
			
			// adding cookie
			Cookie c = new Cookie("email", email);
			response.addCookie(c);

			String redirectUrl  = response.encodeURL("Home.jsp"); // ;jsessionid=1223323 
			
			//request.getRequestDispatcher(redirectUrl).forward(request, response);

			response.sendRedirect(redirectUrl);
		} else {
			request.setAttribute("msg", "Invalid Credentials");
			request.getRequestDispatcher("Login.jsp").forward(request, response);

		}

	}

	
	void add() {
		
	}
	
}
