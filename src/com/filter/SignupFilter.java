package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SignupFilter implements Filter {
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("signup-filter initialized");
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// validation
		System.out.println("signupFilter");
		String firstName = request.getParameter("firstName");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		boolean isError = false;
		if (firstName == null || firstName.trim().length() == 0) {
			isError = true;
			request.setAttribute("firstNameError", "Please Enter FirstName");
		}
		if (email == null || email.trim().length() == 0) {
			isError = true;
			request.setAttribute("emailError", "Please Enter Email");
		}
		if (password == null || password.trim().length() == 0) {
			isError = true;
			request.setAttribute("passwordError", "Please Enter Password");
		}
		if (isError == true) {
			RequestDispatcher rd = request.getRequestDispatcher("Signup.jsp");
			rd.forward(request, response);
		} else {
			System.out.println("NO ERROR ===> GOTO SIGNUP SERVLET ");
			chain.doFilter(request, response);// next filter , servlet
		}
	}
	public void destroy() {
		System.out.println("signup filter release...");
	}

}
