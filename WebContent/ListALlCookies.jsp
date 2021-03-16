<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%@include file="Header.jsp"%>
	<%=g%>

	<%
		Cookie c[] = request.getCookies();
	%>


	<%
		if (c != null)
			for (int i = 0; i < c.length; i++) {
	%>

	<%
		out.print(c[i].getName());
	%>
	:
	<%
		out.print(c[i].getValue());
	%>
	<br>


	<%
		}
	%>


</body>
</html>