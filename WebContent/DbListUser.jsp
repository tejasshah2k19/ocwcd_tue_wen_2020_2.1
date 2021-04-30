<%@page import="com.bean.UserBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="stag" prefix="k"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<%-- 
	<%
		ArrayList<UserBean> users = (ArrayList<UserBean>) request.getAttribute("users");
	%>
	<table border="1" height="50%" width="50%">
		<tr>
			<th>UserId</th>
			<th>FirstName</th>
			<th>Email</th>
			<th>Password</th>
			<th>Salary
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
			<td><%=u.getSalary()%> | <k:currency type="usd"
					price="<%=u.getSalary()%>" /></td>
			<td><a href="DbDeleteUserServlet?userId=<%=u.getUserId()%>">Delete</a>
				<a href="DbEditUserServlet?userId=<%=u.getUserId()%>">Edit</a></td>
		</tr>
		<%
			}
		%>
	</table> --%>

	<c:url var="googleurl" value="http://www.google.com"></c:url>
	<c:url var="gmailurl" value="http://www.gmail.com"></c:url>
	<c:url var="editurl" value="DbEditUserServlet?userId="></c:url>

	<h2>Users using ForEach core tag</h2>
	<table border="1" height="50%" width="50%">
		<tr>
			<th>UserId</th>
			<th>FirstName</th>
			<th>Email</th>
			<th>Password</th>
			<th>Salary
			<th>Action</th>
		</tr>
   
		<c:forEach items="${users}" var="u">
			<tr>
				<td>${u.userId}</td>
				<td>${u.firstName }</td>
				<td>${u.email }</td>
				<td>${u.password }</td>
				<td>${u.salary}</td>
				<td><a href="DbDeleteUserServlet?userId=${u.userId}">Delete</a>
					<a href="${editurl}${u.userId}">Edit</a>|
					<a href="${googleurl}">Google</a>|
					<a href="${gmailurl}"> Gmail</a>
					</td>
			</tr>

		</c:forEach>

	</table>


</body>
</html>