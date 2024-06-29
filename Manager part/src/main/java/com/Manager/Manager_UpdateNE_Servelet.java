package com.Manager;



import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.Session;



@WebServlet("/Manager_UpdateNE_Servelet")
public class Manager_UpdateNE_Servelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		//taking values from ManagerUpdate page
		
		String id=request.getParameter("Mid");
		String name=request.getParameter("name");
		String NIC=request.getParameter("nic");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		String DOB=request.getParameter("dob");
		String userName=request.getParameter("Uname");
		String password=request.getParameter("pass");
		
		boolean isTrue;
		//calling updateManager function 
		isTrue=managerDButil.updateManager(id, name, NIC ,  email, phone,DOB, userName, password);
		
		if(isTrue==true) {
			
			//taking employee array-list
			
			List<Employee> employeeDetails=managerDButil.getManagerEmployee(userName);
			request.setAttribute("employeeDetails", employeeDetails);
			
			//directing to managerDetails page
			
			RequestDispatcher dis=request.getRequestDispatcher("ManagerDetails.jsp");
			dis.forward(request, response);
		}
		else {
			
			RequestDispatcher dis=request.getRequestDispatcher("unsuccess.jsp");
			dis.forward(request, response);
			
		}
		
	}
	
}
	
	
		
		


