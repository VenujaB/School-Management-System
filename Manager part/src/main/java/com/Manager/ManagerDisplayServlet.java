package com.Manager; // Student Package

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ManagerDisplayServlet")
public class ManagerDisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session = request.getSession(); // session 
		String username = (String) session.getAttribute("login");// pass the session id with user login username
	
		System.out.println("Usernamesession="+username);
		
		Manager managerDetails=managerDButil.getManager1(username);
		request.setAttribute("managerDetails", managerDetails);
				
		RequestDispatcher dis = request.getRequestDispatcher("ManagerDisplay.jsp"); // send to manager display
		dis.forward(request, response);
			
		
	} 

}
