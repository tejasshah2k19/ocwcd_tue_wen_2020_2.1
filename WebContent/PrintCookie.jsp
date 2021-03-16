<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<%
		Cookie c[] = (Cookie[]) request.getAttribute("c");
	%>


	<%
		for (Cookie x : c) {
	%>
	<%=x.getName()%>
	:
	<%=x.getValue()%><bR>

	<%
		}
	%>


	<br>
	<BR>
	<a href="InputCookie.jsp">Add Cookie</a>
</body>
</html>