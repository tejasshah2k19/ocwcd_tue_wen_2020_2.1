package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddTwoNumbersServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int n1 = Integer.parseInt(request.getParameter("num1"));
		int n2 = Integer.parseInt(request.getParameter("num2"));

		int ans = n1 + n2;

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.print("<html>");
		out.print("<body>");
		out.print("add = " + ans);

		out.print("</body>");
		out.print("</html>");

	}

}
