package com.Manager;

import java.io.IOException;
import java.util.List;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Manager_ViewNE_servelet")
public class Manager_ViewNE_servelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		//taking values from employee search page
		String userName=request.getParameter("username");
		
		//calling view Manager function
		
		boolean isTrue=managerDButil.viewManager(userName);
		
		if(isTrue==true) {
			
           //taking array-list of given employee
			
			List<Employee>employeeDetails=managerDButil.getEmployee(userName);	
			request.setAttribute("employeeDetails",employeeDetails);
			
			//directing ManagerDetails Page
			
	RequestDispatcher dis=request.getRequestDispatcher("ManagerDetails.jsp");
			dis.forward(request, response);
			
		}
		
		else {
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Entered username is Incorrect!!');");
			out.println("location='ManagerSearch.jsp'");
			out.println("</script>");
		
		}
		
	}

}
