package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DbConnectionRev {

	static Scanner scr = new Scanner(System.in);

	public static Connection openConnection() {
		String driverName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/ocwcd";
		String userName = "root";
		String password = "root";
		Connection con = null;
		try {

			Class.forName(driverName);

			con = DriverManager.getConnection(url, userName, password);

			if (con != null) {
				System.out.println("connected....");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	public static void insertUser() {

		System.out.println("Enter FirstName, email and password.........");
		String firstName = scr.next();
		String email = scr.next();
		String password = scr.next();

		try {
			Connection con = DbConnectionRev.openConnection();

			// Query
			// Statement
			// PrepareStatement
			// CallableStatement

			PreparedStatement pstmt = con
					.prepareStatement("insert into student (firstName,email,password) values (?,?,?)");
			pstmt.setString(1, firstName);
			pstmt.setString(2, email);
			pstmt.setString(3, password);

			pstmt.executeUpdate();// this will actual execute query in database
			con.close();
			// executeUpdate - [ insert update delete ]
			// executeQuery - [ select ]

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		DbConnectionRev.insertUser();
	}
}
