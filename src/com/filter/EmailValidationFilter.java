package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EmailValidationFilter implements Filter {

	public void init(FilterConfig arg0) throws ServletException {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		System.out.println("EmailValidatioFilter");
		String email = request.getParameter("email");

		if (!email.endsWith(".com") || !email.contains("@")) {
			request.setAttribute("emailError", "Please Enter Valid Email");
			RequestDispatcher rd = request.getRequestDispatcher("Signup.jsp");
			rd.forward(request, response);
		} else {
			chain.doFilter(request, response);
		}
	}

	public void destroy() {

	}
}
