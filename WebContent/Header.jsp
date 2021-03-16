<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%
	if (session == null || session.getAttribute("isLogin") == null) {
		System.out.print(request.getRequestURL());
		request.setAttribute("pastUrl", request.getRequestURL());
		request.setAttribute("msg", "Please Login");
		request.getRequestDispatcher("Login.jsp").forward(request, response);
	}
%>
<style>
.header {
	height: 150px;
	background-color: aqua;
	margin-top: -10px;
	margin-left: -10px;
	margin-right: -10px;
}
</style>
</head>
<body>
	<%
		int g = 90;
	%>
	<div class="header"></div>

</body>
</html>