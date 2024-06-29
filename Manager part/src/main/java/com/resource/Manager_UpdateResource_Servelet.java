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

import org.apache.catalina.Session;



@WebServlet("/Manager_UpdateResource_Servelet")
public class Manager_UpdateResource_Servelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		
		String id=request.getParameter("rid");
		String rname=request.getParameter("rname");
		String type=request.getParameter("type");
		String price=request.getParameter("price");
		String rNO=request.getParameter("rNO");
		String capacity=request.getParameter("capacity");
		String details=request.getParameter("details");
		
		
		boolean isTrue;
		
		isTrue=resourceDButil.updateResource(id, rname, type , price ,rNO ,capacity, details);
		
		if(isTrue==true) {
			
			/*out.println("<script type='text/javascript'>");
			out.println("alert('Updated Successfully!!');");
			out.println("</script>");*/
			
			List<Resource> resourceDetails=resourceDButil.getManagerResource(rNO);
			request.setAttribute("resourceDetails", resourceDetails);
			
			RequestDispatcher dis=request.getRequestDispatcher("ResourceDetails.jsp");
			dis.forward(request, response);
		}
		else {
			
			RequestDispatcher dis=request.getRequestDispatcher("unsuccess.jsp");
			dis.forward(request, response);
			
		}
		
	}
	
}
	
	
		
		


