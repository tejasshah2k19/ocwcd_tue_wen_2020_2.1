package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	public static Connection getConnection() {

		String driverName = "com.mysql.jdbc.Driver";// class
		String url = "jdbc:mysql://localhost:3306/ocwcd";// where
		String userName = "root";
		String password = "root";

		try {
			// step 1 : load driver into memory
			Class.forName(driverName);

			// step 2: establish the connection
			Connection c = DriverManager.getConnection(url, userName, password);

			if (c == null) {
				System.out.println("dbNotConnected");
			} else {
				System.out.println("dbConnected....");
			}

			return c;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public static void main(String[] args) {
		DbConnection.getConnection();
	}
}
