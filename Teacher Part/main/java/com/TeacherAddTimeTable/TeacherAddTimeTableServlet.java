package com.TeacherAddTimeTable;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.TeacherAddMarks.TeacherAddMarksDBUtil;


@WebServlet("/TeacherAddTimeTableServlet")
public class TeacherAddTimeTableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String ModuleID = request.getParameter("moduleid"); 
		String Grade = request.getParameter("grade"); 
		String Time= request.getParameter("time"); 
		String Date = request.getParameter("date"); 
		
		boolean isTrue;
		
		isTrue = TeacherAddTimeTableDBUtil.insertTimeTable(ModuleID, Grade, Time, Date);
		
		if (isTrue == true) {
			
			out.println("<script type = 'text/javascript'>");
		    out.println("alert('Successfully Time Table Added');");
		    out.println("location ='TeacherDashboard.jsp'");
			out.println("</script>");
		}
		
		else {
			out.println("<script type = 'text/javascript'>");
			out.println("alert('Time Table Added Unsuccessfully ');");
			out.println("location ='TeacherDashboard.jsp'");
			out.println("</script>");
			
		}
		
		
		
	}

}
