package com.Admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/form_insert")
public class form_insert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("nme");
		String email=request.getParameter("email");
		String gender=request.getParameter("gender");
		
		
		boolean isTrue;
		
		isTrue=formDButil.InsertForm(name, email,gender);
		
		if(isTrue==true) {
			
			RequestDispatcher dis=request.getRequestDispatcher("success.jsp");
			dis.forward(request, response);
			
		}else {
			
			RequestDispatcher dis2=request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request , response);
			
		}
		
		
		
	}

}

