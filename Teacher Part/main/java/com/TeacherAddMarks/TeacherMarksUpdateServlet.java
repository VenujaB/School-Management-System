package com.TeacherAddMarks; // add mark teacher package

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TeacherMarksUpdateServlet")
public class TeacherMarksUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
		
			  
			  String StudentID =request.getParameter("studentid");
			  String StudentName =request.getParameter("studentname");
			  String ModuleID =request.getParameter("moduleid");
			  String ModuleName =request.getParameter("modulename");
			  String Marks=request.getParameter("mark");
		  
		  boolean isTrue;
			
			
			
			isTrue = TeacherAddMarksDBUtil.updateMarks(StudentID, StudentName, ModuleID, ModuleName, Marks);
			
			
			
			if(isTrue == true) {
							
				ArrayList<TeacherAddMarks> MarkDetails = (ArrayList<TeacherAddMarks>) TeacherAddMarksDBUtil.getView();
				request.setAttribute("MarkDetails",MarkDetails);
				System.out.println(MarkDetails);
				RequestDispatcher dis = request.getRequestDispatcher("TeacherMarksDisplay.jsp");
				dis.forward(request, response);
			}
			
			else {
				
				out.println("<script type = 'text/javascript'>");
				out.println("alert('Update Unsuccessful');");
				out.println("location ='TeacherDashboard.jsp'");
				out.println("</script>");
				
			}
		
		
	}

}
