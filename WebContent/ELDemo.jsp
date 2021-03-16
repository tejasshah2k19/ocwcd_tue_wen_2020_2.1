<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	${3+3 }
	<br> ${4 > 5 }
	<br> ${ 4 gt 5 }
	<br> ${ 4 lt 5 }
	<br> ${"123" + 2 }
	<br> ${5 > 4 && 5 > 3 }
	<br> ${5 > 4 and 5 > 3 }
	<br>cookies::=> ${cookie.JSESSIONID.value }<br>Cd  
 	<br>${cookie }
 	<br>ERROR=>${requestScope.error }<br>
 	ERROR=>${error }

	<br>
	end








</body>
</html>