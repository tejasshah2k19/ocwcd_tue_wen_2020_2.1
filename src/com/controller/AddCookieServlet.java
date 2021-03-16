package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddCookieServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String cookieName = request.getParameter("cookieName");
		String cookieValue = request.getParameter("cookieValue");
		
		Cookie c  = new Cookie(cookieName, cookieValue);
		response.addCookie(c);
		
		response.sendRedirect("InputCookie.jsp");
		
	}

}
