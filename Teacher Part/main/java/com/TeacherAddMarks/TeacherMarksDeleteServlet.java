package com.TeacherAddMarks; 

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TeacherMarksDeleteServlet")

public class TeacherMarksDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String ID =request.getParameter("studentid");
		
		
		 boolean isTrue;
		  
		 isTrue=TeacherAddMarksDBUtil.MarksDelete(ID);
		 
		 if(isTrue==true) {
				
				
				out.println("<script type='text/javascript'>");
				out.println("alert('Deleted successfully!');");
				out.println("location='TeacherDashboard.jsp'");
				out.println("</script>");
				
				
				
				
			}
			else {
				
				out.println("<script type='text/javascript'>");
				out.println("alert('Deleted Unsuccessfully!');");
				out.println("location='TeacherDashboard.jsp'");
				out.println("</script>");
				
			}
		
	}

}
