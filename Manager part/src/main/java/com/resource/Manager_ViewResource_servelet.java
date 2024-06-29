package com.resource;

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


@WebServlet("/Manager_ViewResource_servelet")
public class Manager_ViewResource_servelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String resNO=request.getParameter("resNO");
		
		boolean isTrue=resourceDButil.viewResource(resNO);
		
		if(isTrue==true) {
			

			List<Resource>resourceDetails=resourceDButil.getResource(resNO);	
			request.setAttribute("resourceDetails",resourceDetails);
			
			
	RequestDispatcher dis=request.getRequestDispatcher("ResourceDetails.jsp");
			dis.forward(request, response);
			
		}
		
		else {
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Entered Resource ID is Incorrect!!');");
			out.println("location='ManagerResourceSearch.jsp'");
			out.println("</script>");
		
		}
		
	}

}
