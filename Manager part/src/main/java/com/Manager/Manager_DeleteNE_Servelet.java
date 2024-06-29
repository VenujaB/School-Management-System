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


@WebServlet("/Manager_DeleteNE_Servelet")
public class Manager_DeleteNE_Servelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		//taking values from ManagerNEDelete page
		
		String id=request.getParameter("Mid");
		String userName=request.getParameter("Uname");
		
		boolean isTrue;
		
		isTrue=managerDButil.ManagerNEdelete(id);
		
		if(isTrue==true) {
			
			//alert successful message and redirect to HR main page
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Account Deleted Successfully..!');");
			out.println("location='HR_main_page.jsp'");
			out.println("</script>");
			
		}
		
		else {
			
			//taking employee array-list
			
			List<Employee> employeeDetails=managerDButil.getManagerEmployee(userName);
			request.setAttribute("employeeDetails", employeeDetails);
			
			//direct to ManagerDetails page 
			
			RequestDispatcher dis=request.getRequestDispatcher("ManagerDetails.jsp");
			dis.forward(request, response);
			
		}
		
	}

}
