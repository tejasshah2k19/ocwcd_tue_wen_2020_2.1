<%@page import="com.bean.StudentBean"%>
<%@page import="java.util.ArrayList"%>
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
		ArrayList<StudentBean> students = (ArrayList<StudentBean>) request.getAttribute("students");
	%>

	<table border="1" >
		<tr>
			<th>StudentId</th>
			<th>FirstName</th>
			<th>Email</th>
			<th>Password</th>

		</tr>


		<%
			for (StudentBean sb : students) {
		%>

		<tr>
			<td><%=sb.getStudentId()%></td>

			<td><%=sb.getFirstName()%></td>
			<td><%=sb.getEmail()%></td>
			<td><%=sb.getPassword()%></td>
		</tr>

		<%
			}
		%>


	</table>

</body>
</html>





