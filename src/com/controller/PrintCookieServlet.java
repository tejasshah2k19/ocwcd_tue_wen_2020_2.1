package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrintCookieServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Cookie c[] = request.getCookies(); // all cookies from browser...
		request.setAttribute("c", c);
		request.getRequestDispatcher("PrintCookie.jsp").forward(request, response);
		
	}

}
