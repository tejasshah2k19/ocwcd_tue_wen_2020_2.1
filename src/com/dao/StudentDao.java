package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.bean.StudentBean;
import com.util.DbConnectionRev;

public class StudentDao {

	public void insertStudent(String firstName, String email, String password) {

		try {

			Connection con = DbConnectionRev.openConnection();
			PreparedStatement pstmt = con
					.prepareStatement("insert into student (firstName,email,password) values (?,?,?)");

			pstmt.setString(1, firstName);
			pstmt.setString(2, email);
			pstmt.setString(3, password);
			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<StudentBean> getAllStudents() {
		ArrayList<StudentBean> students = new ArrayList<>();
		try {

			Connection con = DbConnectionRev.openConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from student");

			ResultSet rs = pstmt.executeQuery();// all students records

			while (rs.next()) {

				StudentBean sb = new StudentBean();
				sb.setStudentId(rs.getInt("studentId"));// rs->db --> set bean
				sb.setFirstName(rs.getString("firstName"));
				sb.setEmail(rs.getString("email"));
				sb.setPassword(rs.getString("password"));
				students.add(sb);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return students;
	}

}
