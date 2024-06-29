package com.Manager;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Manager_LogOut_servelet")
public class Manager_LogOut_servelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		//closing the session
		HttpSession session = request.getSession();
		session.removeAttribute("login");
		response.sendRedirect("Hr_manager_login.jsp");
		
		
	}

}
