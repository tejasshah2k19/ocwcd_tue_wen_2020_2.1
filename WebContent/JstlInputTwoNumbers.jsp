<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>


	<form action="JstlOutput.jsp" method="post">

		No1. <input type="text" name="num1" /> <br> No2. <input
			type="text" name="num2" /> <br> Operation : <br> Add :<input
			type="radio" name="calc" value="add" /> <br> Sub :<input
			type="radio" name="calc" value="sub" /> <br> Mul :<input
			type="radio" name="calc" value="mul" /> <br> Div :<input
			type="radio" name="calc" value="div" /> <br> <input
			type="submit" value="Process" />
	</form>
	<br> ${error}
</body>
</html>