<%@page import="com.ty.dto.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="NavBar.jsp" %>
<% Student student=(Student)request.getAttribute("myStudent");  %>
<h1>Edit Student</h1>
	<form action="edits" method="post">
		
		ID : <input type="number" name="id" value="<%=student.getId() %>"> </br></br>
		Name : <input type="text" name="studentName" value="<%=student.getName()%>"> </br></br>
		Password : <input type="text" name="password" value="<%=student.getPassword() %>"> </br></br>
		Phone : <input type="number" name="phone" value="<%=student.getPhone() %>"> </br></br>
		Email : <input type="text" name="email" value="<%=student.getEmail() %>"> </br></br>
		Age : <input type="number" name="age" value="<%=student.getAge() %>"> </br></br>
		
		<input type="submit" value="Update Student">
	
	</form>
</body>

</html>