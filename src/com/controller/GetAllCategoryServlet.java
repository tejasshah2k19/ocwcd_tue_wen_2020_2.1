package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.DbConnection;

@WebServlet("/GetAllCategoryServlet")
public class GetAllCategoryServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			Connection con = DbConnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from category");
			ResultSet rs = pstmt.executeQuery();// select
			// bad appr.
			request.setAttribute("rs", rs);
			request.getRequestDispatcher("DbAddProduct.jsp").forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
