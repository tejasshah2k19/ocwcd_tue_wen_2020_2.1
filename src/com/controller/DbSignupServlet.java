package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.UserBean;
import com.dao.UserDao;
import com.util.DbConnection;

public class DbSignupServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		float salary = Float.parseFloat(request.getParameter("salary"));

		UserBean userBean = new UserBean();
		userBean.setEmail(email);
		userBean.setPassword(password);
		userBean.setFirstName(firstName);
		userBean.setSalary(salary);

		UserDao userDao = new UserDao();
		userDao.insertUser(userBean);
		// userDao.insertUSer(email,password);

		response.sendRedirect("DbSignup.jsp");
	}

	// protected void service(HttpServletRequest request, HttpServletResponse
	// response)
//			throws ServletException, IOException {
//
//		String firstName = request.getParameter("firstName");
//		String email = request.getParameter("email");
//		String password = request.getParameter("password");
//
//		try {
//			// open connection
//			Connection c = DbConnection.getConnection();
//
//			// to execute any query in db we need prepared stmt.
//			PreparedStatement pstmt = c.prepareStatement("insert into user (firstName,email,password) values (?,?,?)");
//			pstmt.setString(2, email);
//			pstmt.setString(3, password);
//			pstmt.setString(1, firstName);
//
//			// db - query -run/execute // insert update delete 
//			pstmt.executeUpdate();//state change 
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		response.sendRedirect("DbSignup.jsp");
//	}

}
