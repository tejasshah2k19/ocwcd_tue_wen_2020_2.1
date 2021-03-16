<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>

<form action="AddCookieServlet">
	CookieName: <input type="Text" name="cookieName"/><br>
	CookieValue : <input type="text" name="cookieValue"/><br>
	<input type="submit" value="Add Cookie"/>
<br><br>
<a href="PrintCookieServlet">PrintCookie</a>
<br>
<br>
<a href="PrintCookieEL.jsp">PrintCookieEL</a></form>
</body>
</html>