package com.Admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Admin_Student_Insert")
public class Admin_Student_Insert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//taking values from insert form
		
		String name=request.getParameter("nme");
		String email=request.getParameter("email");
		String Pno=request.getParameter("phone");
		String Address=request.getParameter("address");
		String DOB=request.getParameter("DOB");
		String User=request.getParameter("uNme");
		String password=request.getParameter("pwd");
		
		boolean isTrue;
		
		//calling data insert function
		
		isTrue=adminDButil.InsertStudent(name, email, Pno,Address,DOB, User, password);
		
		if(isTrue==true) {
			
			//directing to adminSearch
			
			RequestDispatcher dis=request.getRequestDispatcher("adminSearch.jsp");
			dis.forward(request, response);
			
		}else {
			
			//print unsuccessful page
			
			RequestDispatcher dis2=request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request , response);
			
		}
		
		
		
	}

}
