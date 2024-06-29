package com.Teacher;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Admin_Delete_Teacher_Servelet")
public class Admin_Delete_Teacher_Servelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String id=request.getParameter("tid");
		String userName=request.getParameter("Uname");
		
		boolean isTrue;
		
		isTrue=teacherDButil.AdminTeacherDelete(id);
		
		if(isTrue==true) {
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Account Deleted Successfully!');");
			out.println("location='Admin dashbord.jsp'");
			out.println("</script>");
			
			
		}
		else {
			
			List<Teacher> teacherDetails=teacherDButil.getAdminTeacher(userName);
			request.setAttribute("teacherDetails",teacherDetails);
			RequestDispatcher dis=request.getRequestDispatcher("TeacherDetails.jsp");
			dis.forward(request, response);
			
		}
		
	}

}
