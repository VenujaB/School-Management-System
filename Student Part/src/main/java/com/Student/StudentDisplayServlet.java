package com.Student; // Student Package

import java.io.IOException; // Import java IOException 



import javax.servlet.RequestDispatcher; // Import javax  RequestDispatcher
import javax.servlet.ServletException;  // Import javax  ServletException
import javax.servlet.annotation.WebServlet; // Import javax annotation WebServlet
import javax.servlet.http.HttpServlet;  // Import javax HttpServlet
import javax.servlet.http.HttpServletRequest; // Import javax HttpServletRequest 
import javax.servlet.http.HttpServletResponse; // Import javax HttpServletResponse
import javax.servlet.http.HttpSession; // Import javax Http Session


@WebServlet("/StudentDisplayServlet")
public class StudentDisplayServlet extends HttpServlet { // Beginning of the Student Display Servlet
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session = request.getSession(); // session 
		String StudentEmail = (String) session.getAttribute("SEmail"); // pass the session id with user login email
	
		Student student = StudentDBUtil.getStudent(StudentEmail); // get attribute 
		request.setAttribute("student", student); // Set Student Attribute
				
		RequestDispatcher dis = request.getRequestDispatcher("StudentDisplay.jsp"); // send to student display
		dis.forward(request, response); // Request And response
			
	} 

} // End of the Student Display Servlet
