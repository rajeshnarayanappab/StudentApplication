<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>

<%
	String name = (String)session.getAttribute("name"); 
	if(name == null) {
		response.sendRedirect("Login.jsp");
	}
%>

<%@ include file="mynavBar.jsp" %>

<h1>Hi You are in home page</h1>
<li><a href="NavBar.jsp">View Students List</a></li>


</body>
</html>