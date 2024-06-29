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


@WebServlet("/Admin_Delete_Student_Servelet")
public class Admin_Delete_Student_Servelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		//taking values from deleteAdminStudent page
		
		String id=request.getParameter("sid");
		String userName=request.getParameter("Uname");
		
		boolean isTrue;
		
		isTrue=adminDButil.AdminStuDelete(id);
		
		if(isTrue==true) {
			
			//alert successful message and redirect to Admin dashbord
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Account Deleted Successfully!');");
			out.println("location='Admin dashbord.jsp'");
			out.println("</script>");
			
			
		}
		else {
			
			//taking student array-list
			
			List<Student> studentDetails=adminDButil.getAdminStudent(userName);
			request.setAttribute("studentDetails",studentDetails);
			
			//direct to studentDetails page
			
			RequestDispatcher dis=request.getRequestDispatcher("studentDetails.jsp");
			dis.forward(request, response);
			
		}
		
	}

}
