package com.resource;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Manager.managerDButil;


@WebServlet("/Manager_InsertResource_servlet")
public class Manager_InsertResource_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("nm");
		String type = request.getParameter("type");
		String price = request.getParameter("price");
		String no = request.getParameter("no");
		String capacity = request.getParameter("capacity");
		String details = request.getParameter("details");
		
		boolean isTrue;
		
		isTrue=resourceDButil.insertresource(name, type, price, no, capacity, details);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("ManagerResourceSearch1.jsp");
			dis.forward(request, response);
		}else
		{
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
		
	}

}
