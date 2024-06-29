package com.Manager;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Manager_NE_Insert_servelet")
public class Manager_NE_Insert_servelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//taking values from insert form
		
		String name=request.getParameter("name");
		String NIC=request.getParameter("nic");
		String email=request.getParameter("email");
		String Pno=request.getParameter("phone");
		String DOB=request.getParameter("dob");
		String User=request.getParameter("user");
		String password=request.getParameter("pass");
		
		boolean isTrue;
		
		//calling data insert function
		isTrue=managerDButil.InsertManager(name,NIC, email, Pno,DOB , User , password);
		
		if(isTrue==true) {
			
			//directing to Manager Search page
			RequestDispatcher dis=request.getRequestDispatcher("ManagerSearch.jsp");
			dis.forward(request, response);
			
		}else {
			
			//print unsuccessful message
			RequestDispatcher dis2=request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request , response);
			
		}
		
		
		
	}

}
