package com.resource;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Manager_DeleteResource_Servelet")
public class Manager_DeleteResource_Servelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String rID=request.getParameter("rid");
		
		
		boolean isTrue;
		
		isTrue=resourceDButil.ManagerResourcedelete(rID);
		
		if(isTrue==true) {
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Account Deleted Successfully..!');");
			out.println("location='HR_main_page.jsp'");
			out.println("</script>");
			
		}
		
		else {
			
			List<Resource> managerDetails=resourceDButil.getManagerResource(rID);
			request.setAttribute("managerDetails", managerDetails);
			
			RequestDispatcher dis=request.getRequestDispatcher("ResourceDetails.jsp");
			dis.forward(request, response);
			
		}
		
	}

}
