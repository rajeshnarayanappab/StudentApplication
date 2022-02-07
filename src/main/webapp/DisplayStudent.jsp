<%@page import="com.ty.dto.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Student</title>
</head>
<body>



<%

	List<Student> students = (List<Student>)request.getAttribute("myStudent");
%>

<table border="3">
	<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Password</th>
		<th>Email</th>
		<th>Phone</th>
		<th>Age</th>
		<th>Delete</th>
		<th>Edit</th>
	</tr>
	
	<%
		for(Student student : students) {
			%>
			
			<tr>
				<td><%=student.getId() %></td>
				<td><%=student.getName() %></td>
				<td><%=student.getEmail() %></td>
				<td><%=student.getPhone() %></td>
				<td><%=student.getPassword() %></td>
				<td><%=student.getAge() %></td>
				<td>
					<a href="deletes?id=<%=student.getId() %>">Delete</a>
				</td>
				<td>
					<a href="getstudents?id=<%=student.getId() %>">Edit</a>
				</td>
			</tr>
			
	<%
		}
	%>
	
		
</table>


</body>
</html>