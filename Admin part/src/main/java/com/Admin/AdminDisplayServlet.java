package com.Admin; // Student Package

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


@WebServlet("/AdminDisplayServlet")
public class AdminDisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session = request.getSession(); // session 
		String username = (String) session.getAttribute("login");// pass the session id with user login user name
	
		System.out.println("Usernamesession="+username);
		
		Admin adminDetails=adminDButil.getAdmin1(username);
		request.setAttribute("adminDetails", adminDetails);
				
		RequestDispatcher dis = request.getRequestDispatcher("AdminDisplay.jsp"); // send to admin display
		dis.forward(request, response);
			
		
	} 

}
