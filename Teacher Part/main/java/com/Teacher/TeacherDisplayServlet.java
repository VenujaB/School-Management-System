package com.Teacher; //Teacher Package

import java.io.IOException; // Import java IOException

import javax.servlet.RequestDispatcher; // Import javax RequestDispatcher
import javax.servlet.ServletException;  // Import javax ServletException
import javax.servlet.annotation.WebServlet; // Import javax annotation.WebServlet
import javax.servlet.http.HttpServlet; // Import javax HttpServlet
import javax.servlet.http.HttpServletRequest; // Import HttpServletRequest
import javax.servlet.http.HttpServletResponse; // Import javax HttpServletResponse
import javax.servlet.http.HttpSession; // Import javax HttpSession


@WebServlet("/TeacherDisplayServlet")
public class TeacherDisplayServlet extends HttpServlet { // Beginning of the teacher display servalet
	
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		HttpSession session = request.getSession(); // session 
		String TeacherEmail = (String) session.getAttribute("TEmail"); // pass the session id with user login email
	
		Teacher teacher = TeacherDBUtil.getTeacher(TeacherEmail);  // get attribute
		request.setAttribute("teacher", teacher); //set teacher attribute 
				
		RequestDispatcher dis = request.getRequestDispatcher("TeacherDisplay.jsp"); //send to student display
		dis.forward(request, response); //request and response
		
		
		
	}

}
