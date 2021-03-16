package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.bean.UserBean;
import com.util.DbConnection;

public class UserDao {
	// model{data} view{frontend input output} controller{logic servlet}
	// bean dao | jsp | Servlet

	public void insertUser(UserBean userBean) {
		try {
			// open connection
			Connection c = DbConnection.getConnection();

			// to execute any query in db we need prepared stmt.
			PreparedStatement pstmt = c
					.prepareStatement("insert into user (firstName,email,password,roleId) values (?,?,?,?)");
			pstmt.setString(2, userBean.getEmail());
			pstmt.setString(3, userBean.getPassword());
			pstmt.setString(1, userBean.getFirstName());
			pstmt.setInt(4, userBean.getRoleId());// 0

			// db - query -run/execute // insert update delete
			pstmt.executeUpdate();// state change

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// getAllProducts(String category) //null
	public ArrayList<UserBean> getAllUsers() {
		ArrayList<UserBean> users = new ArrayList<>();
		try {

			Connection con = DbConnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from user");
			ResultSet rs = pstmt.executeQuery();// select
			while (rs.next()) {
				UserBean userBean = new UserBean();

//				String firstName = rs.getString("firstName");
//				String email = rs.getString("email");
//				String password = rs.getString("password");
//				int userId = rs.getInt("userId");

				userBean.setFirstName(rs.getString("firstName"));
				userBean.setEmail(rs.getString("email"));
				userBean.setPassword(rs.getString("password"));
				userBean.setUserId(rs.getInt("userId"));

				users.add(userBean);
			}

			con.close();
			pstmt.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return users;
	}

	public void deleteUser(int userId) {

		try {
			Connection con = DbConnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement("delete from user where userId = ?");
			pstmt.setInt(1, userId);
			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public UserBean getDataByUserId(int userId) {
		try {

			Connection con = DbConnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from user where userId = ? ");
			pstmt.setInt(1, userId);

			ResultSet rs = pstmt.executeQuery();// select -> single record

			if (rs.next()) {
				UserBean userBean = new UserBean();
				userBean.setUserId(rs.getInt("userId"));
				userBean.setEmail(rs.getString("email"));
				userBean.setPassword(rs.getString("password"));
				userBean.setFirstName(rs.getString("firstName"));
				return userBean;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public void updateUser(UserBean userBean) {

		try {
			// open connection
			Connection c = DbConnection.getConnection();

			// to execute any query in db we need prepared stmt.
			PreparedStatement pstmt = c
					.prepareStatement("update user set firstName = ? , email = ? , password = ? where userId = ? ");
			pstmt.setString(2, userBean.getEmail());
			pstmt.setString(3, userBean.getPassword());
			pstmt.setString(1, userBean.getFirstName());
			pstmt.setInt(4, userBean.getUserId());
			// db - query -run/execute // insert update delete
			pstmt.executeUpdate();// state change

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
