package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.StudentBean;
import com.dao.StudentDao;

public class DbListStudentServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ArrayList<StudentBean> students = new StudentDao().getAllStudents();

		request.setAttribute("students", students);

		request.getRequestDispatcher("DbListStudent.jsp").forward(request, response);

	}

}
