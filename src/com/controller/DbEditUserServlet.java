package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.UserBean;
import com.dao.UserDao;
import com.util.DbConnection;

public class DbEditUserServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int userId = Integer.parseInt(request.getParameter("userId"));

		UserDao userDao = new UserDao();
		UserBean userBean = userDao.getDataByUserId(userId);
		request.setAttribute("userBean", userBean); // user -> userId,firstName,email
		request.getRequestDispatcher("DbEditUser.jsp").forward(request, response);

	}

}
