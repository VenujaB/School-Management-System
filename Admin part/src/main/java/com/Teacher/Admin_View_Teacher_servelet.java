package com.Teacher;

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


@WebServlet("/Admin_View_Teacher_servelet")
public class Admin_View_Teacher_servelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String userName=request.getParameter("user");
		
		boolean isTrue=teacherDButil.viewTeacher(userName);
		
		if(isTrue==true) {
			

			List<Teacher>teacherDetails=teacherDButil.getTeacher(userName);	
			request.setAttribute("teacherDetails",teacherDetails);
			
			
	RequestDispatcher dis=request.getRequestDispatcher("TeacherDetails.jsp");
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
