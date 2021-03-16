<%@page import="com.bean.UserBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>

	<%
		ArrayList<UserBean> users = (ArrayList<UserBean>) request.getAttribute("users");
	%>
	<table border="1" height="50%" width="50%">
		<tr>
			<th>UserId</th>
			<th>FirstName</th>
			<th>Email</th>
			<th>Password</th>
			<th>Action</th>
		</tr>
		<%
			for (UserBean u : users) {
		%>
		<tr>
			<td><%=u.getUserId()%></td>
			<td><%=u.getFirstName()%></td>
			<td><%=u.getEmail()%></td>
			<td><%=u.getPassword()%></td>
			<td><a href="DbDeleteUserServlet?userId=<%=u.getUserId()%>">Delete</a>
				<a href="DbEditUserServlet?userId=<%=u.getUserId()%>">Edit</a></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>