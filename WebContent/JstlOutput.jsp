<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>


	<c:catch var="e">
		<c:set var="num1" value="${param.num1}">
		</c:set>

		<c:set var="num2" value="${param.num2}">
		</c:set>


		<c:choose>
			<c:when test="${param.calc == 'add' }">
				<c:out value="${num1+num2}"></c:out>
			</c:when>

			<c:when test='${param.calc == "mul" }'>
				<c:out value="${num1*num2}"></c:out>
			</c:when>

			<c:when test='${param.calc == "sub" }'>
				<c:out value="${num1-num2}"></c:out>
			</c:when>

			<c:when test='${param.calc == "div" }'>
				<c:out value="${num1/num2}"></c:out>
			</c:when>

			<c:otherwise>
			Invalid Choice
		</c:otherwise>

		</c:choose>

		<br>
		<br>

		<c:if test="${param.calc == 'add' }">
			<c:out value="${num1+num2}"></c:out>
		</c:if>




		<c:remove var="num1" />
		<c:remove var="num2" />

		<c:out value="${num1}"></c:out>


	</c:catch>

	<c:if test="${e != null }">
			Strings are not allowed...
	
	<%
		request.setAttribute("error", "Invalid Input");
			request.getRequestDispatcher("JstlInputTwoNumbers.jsp").forward(request, response);
	%>
	</c:if>




</body>
</html>