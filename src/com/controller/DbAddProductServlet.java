package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.DbConnection;

public class DbAddProductServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String productName = request.getParameter("productName");
		int price = Integer.parseInt(request.getParameter("productPrice"));
		int categoryId = Integer.parseInt(request.getParameter("category"));

		System.out.println(productName);
		System.out.println(price);
		System.out.println(categoryId);
		try {
			// open connection
			Connection c = DbConnection.getConnection();

			// to execute any query in db we need prepared stmt.
			PreparedStatement pstmt = c
					.prepareStatement("insert into product (productName,price,categoryId) values (?,?,?)");
			pstmt.setString(1, productName);
			pstmt.setInt(2, price);
			pstmt.setInt(3, categoryId);

			// db - query -run/execute // insert update delete
			pstmt.executeUpdate();// state change

		} catch (Exception e) {
			e.printStackTrace();
		}

		response.sendRedirect("index.jsp");
	}

}
