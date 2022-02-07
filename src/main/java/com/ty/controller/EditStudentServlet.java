package com.ty.controller;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.dao.StudentDao;
import com.ty.dto.Student;

public class EditStudentServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Student student = new Student();
		String id = req.getParameter("id");
		String name = req.getParameter("studentName");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String password = req.getParameter("password");
		String age = req.getParameter("age");

		student.setId(Integer.parseInt(id));
		student.setName(name);
		student.setEmail(email);
		student.setPassword(Integer.parseInt(password));
		student.setPhone(Long.parseLong(phone));
		student.setAge(Integer.parseInt(age));

		StudentDao dao = new StudentDao();
		dao.updateStudent(student);

		PrintWriter pw =resp.getWriter();
		pw.print("<html><body><h1>Student updated</h1></body></html>");
	}
}