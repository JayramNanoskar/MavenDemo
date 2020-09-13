<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="com.jayram.model.Student" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		//Student s = (Student)request.getAttribute("student");
		Student s = (Student)session.getAttribute("student");
		out.println(s);
	%>
</body>
</html>