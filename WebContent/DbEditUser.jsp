<%@page import="com.bean.UserBean"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<%
		UserBean userBean = (UserBean) request.getAttribute("userBean");
	%>


	<form action="DbUpdateUserServlet">
		<input type="hidden" name="userId" value="<%=userBean.getUserId()%>" />
		FirstName: <input type="text" name="firstName"
			value="<%=userBean.getFirstName()%>" /> <br> Email : <input
			type="text" name="email" value="<%=userBean.getEmail()%>" />${emailError }
		<br> Password : <input type="password" name="password"
			value="<%=userBean.getPassword()%>" />${passwordError } <br> <input
			type="submit" value="Update" />

	</form>

	<br>
	<a href="DbListUserServlet">List Users</a>


</body>
</html>