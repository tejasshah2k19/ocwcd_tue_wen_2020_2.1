package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AddTwoNumbersFilter implements Filter {

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String n1 = request.getParameter("num1");
		String n2 = request.getParameter("num2");
		boolean isError = false;
		if (n1 == null || n1.trim().length() == 0) {
			isError = true;
			request.setAttribute("num1Error", "Please Enter Number1");
		}
		if (n2 == null || n2.trim().length() == 0) {
			isError = true;
			request.setAttribute("num2Error", "Please Enter Number2");
		}

		if (isError == true) {
			request.getRequestDispatcher("AddTwoNumbers.jsp").forward(request, response);

		} else {
			chain.doFilter(request, response);
		}

	}

	public void init(FilterConfig config) throws ServletException {
		System.out.println("init called from addtwonumbers filter...");
	}

}
