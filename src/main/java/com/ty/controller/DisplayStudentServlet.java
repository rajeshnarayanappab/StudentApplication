package com.ty.controller;


import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.dao.StudentDao;
import com.ty.dto.Student;

public class DisplayStudentServlet extends HttpServlet {


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


		StudentDao dao = new StudentDao();
		List<Student> students= dao.getAllStudent();
		
		req.setAttribute("myStudent", students);
		RequestDispatcher dispatcher = req.getRequestDispatcher("DisplayStudent.jsp");
		dispatcher.forward(req, resp);
	}
}