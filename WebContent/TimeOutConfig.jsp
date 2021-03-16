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
		/* if (session == null || session.getAttribute("isLogin") == null) {
			request.setAttribute("msg", "Please Login");
			request.getRequestDispatcher("Login.jsp").forward(request, response);
		} */
	%>


	<%=session.getAttribute("email")%>

	<br>
	<BR>
	<BR>

	<form action="SessionTimeOutConfig">
		SessionTimeOut(minutes) : <input type="text" name="timeout" /><Br>
		<input type="submit" value="SetMyTimeOut" />

	</form>
</body>
</html>