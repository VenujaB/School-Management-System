package com.Admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/VA")
public class VA extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		
		boolean isTrue=adminDButil.viewAll();
		
if(isTrue==true) {
			

			List<Admin>adminDetails=adminDButil.getView();	
			request.setAttribute("adminDetails",adminDetails);
			
			
	RequestDispatcher dis=request.getRequestDispatcher("viewAll.jsp");
			dis.forward(request, response);
			
		}
		
		else {
			
			
		
		}
		
		
	}
	
	

}
