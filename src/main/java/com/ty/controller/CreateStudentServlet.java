package com.ty.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.dao.StudentDao;
import com.ty.dto.Student;


public class CreateStudentServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Student student = new Student();
		String name = req.getParameter("studentName");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String password = req.getParameter("password");
		String age = req.getParameter("age");
		
		
		student.setName(name);
		student.setEmail(email);
		student.setPassword(Integer.parseInt(password));
		student.setPhone(Long.parseLong(phone));
		student.setAge(Integer.parseInt(age));
		
		StudentDao dao = new StudentDao();
		dao.saveStudent(student);
		
		PrintWriter pw =resp.getWriter();
		pw.print("<html><body><h1>Item Stored</h1></body></html>");
		
	}	

}