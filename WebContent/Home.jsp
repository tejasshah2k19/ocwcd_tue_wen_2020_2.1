<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title><%=application.getInitParameter("appName")%></title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>



	<jsp:include page="Header.jsp"></jsp:include>


	<%
		//=g
		int a=90;
	%>
	<h2>Welcome......${sessionScope.email }</h2>

	<form action="AddPostServlet" method="post">

		Post :
		<textarea rows="13" cols="50"></textarea>
		<input type="submit" value="Post" />
	</form>
	<br>
	<BR>
	<BR>

	<a href="<%=response.encodeURL("ListALlCookies.jsp")%>">List All
		Cookies</a>
	<br>
	<a href="LogoutServlet">LogOut</a>
	<br>
	<a href="<%=response.encodeURL("TimeOutConfig.jsp")%>">TimeOut</a>
</body>
</html>