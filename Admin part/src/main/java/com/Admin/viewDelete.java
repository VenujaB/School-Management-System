package com.Admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class viewDelete
 */
@WebServlet("/viewDelete")
public class viewDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		
		String username=request.getParameter("Uname");
		System.out.println("username"+username);
		
		boolean isTrue;
		
		isTrue=adminDButil.ViewDelete(username);
		
		if(isTrue==true) {
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Account Deleted Successfully!');");
			out.println("location='Admin dashbord.jsp'");
			out.println("</script>");
			
			
		}
		else {
			
			/*List<Admin> adminDetails=adminDButil.getAdminStudent(userName);
			request.setAttribute("adminDetails",adminDetails);
			RequestDispatcher dis=request.getRequestDispatcher("AdminDetails.jsp");
			dis.forward(request, response);
			*/
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Account deletion failed!');");
			out.println("location='viewAll.jsp'");
			out.println("</script>");
			

			
		}
		
	}

}
