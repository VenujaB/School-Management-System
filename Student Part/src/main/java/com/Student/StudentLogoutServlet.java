package com.Student; // Student Package
 
import java.io.IOException;

import javax.servlet.ServletException; // Import javax  ServletException
import javax.servlet.annotation.WebServlet; // Import javax annotation WebServlet
import javax.servlet.http.HttpServlet; // Import javax HttpServlet
import javax.servlet.http.HttpServletRequest; // Import javax HttpServletRequest 
import javax.servlet.http.HttpServletResponse; // Import javax HttpServletResponse
import javax.servlet.http.HttpSession; // Import javax Http Session


@WebServlet("/StudentLogoutServlet")
public class StudentLogoutServlet extends HttpServlet { // Beginning of the Student Logout  Servlet
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();		// Session
		session.removeAttribute("student"); // Remove Session Attribute
		response.sendRedirect("Login.jsp"); // Redirect to login page
		
		
	}

}  // End of the Student Logout  Servlet
