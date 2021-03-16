<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" session="false"
	info="this jsp demonstrate directive"%>

<%@page import="java.util.Date,java.util.Scanner,java.io.File"
	import="java.applet.Applet" buffer="8kb" autoFlush="true"
	isELIgnored="false" errorPage="MyError.jsp" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	hello
	<%
	int a = 90;
	Date d = new Date();
	File f = null;
	
	int asd = 90;
	int b = 0;
	int c = asd/b;
	
%>

	<%=a%>

	bye

	<%!void add() {
	}%>

	${msg}
</body>
</html>