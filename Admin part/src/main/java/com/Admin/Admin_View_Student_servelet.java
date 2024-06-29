package com.Admin;

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


@WebServlet("/Admin_View_Student_servelet")
public class Admin_View_Student_servelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		//taking values from student search page
		
		String userName=request.getParameter("user");
		
		//calling view student function
		
		boolean isTrue=adminDButil.viewStudent(userName);
		
		if(isTrue==true) {
			
			//taking array list of given student

			List<Student>studentDetails=adminDButil.getStudent(userName);	
			request.setAttribute("studentDetails",studentDetails);
			
			//directing to studentDetails
			
	RequestDispatcher dis=request.getRequestDispatcher("studentDetails.jsp");
			dis.forward(request, response);
			
		}
		
		else {
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Entered username is Incorrect!!');");
			out.println("location='adminSearchTeacher.jsp'");
			out.println("</script>");
		
		}
		
	}

}
