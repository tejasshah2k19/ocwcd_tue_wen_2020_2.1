<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="adminElFunction" prefix="a"%>
<%@taglib uri="stag" prefix="k"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<k:greet></k:greet>
	<br> Price :: USD
	<k:currency type="usd" price="7500" />
	<Br> Price :: POUND
	<k:currency type="pound" price="7500" />
	<Br>	
	<k:sum a="10" b="20" c="40"/>
	<br>
	<k:sum a="10" b="20" c="40" d="30"/>
	
	<!-- weather  -->
</body>
</html>