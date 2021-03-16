package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class AddPostServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String email = "";
		for(Cookie c:request.getCookies()) {
			if(c.getName().equals("email")) {
				email = c.getValue();
			}
		}
		
		
		
		PrintWriter  out = response.getWriter();
		
		response.setContentType("text/html");
		
		
		out.print("<html><body>");
		
		out.print("Post submited by :"+email);
		
		out.print("</body></html>");
		
	
	}

}
