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

public class DbUpdateUserServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int userId = Integer.parseInt(request.getParameter("userId"));
		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		UserBean userBean = new UserBean();
		userBean.setUserId(userId);
		userBean.setFirstName(firstName);
		userBean.setEmail(email);
		userBean.setPassword(password);

		UserDao userDao = new UserDao();
		userDao.updateUser(userBean);

		response.sendRedirect("DbListUserServlet");
	}

}
