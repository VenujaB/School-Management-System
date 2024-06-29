package com.TeacherAddMarks;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TeacherMarkInsertServlet")
public class TeacherMarkInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter(); // print writer   
		response.setContentType("text/html");
		
		String StudentID = request.getParameter("studentid"); // get parameter form
		String StudentName = request.getParameter("studentname"); // get parameter form
		String ModuleID = request.getParameter("moduleid");
		String ModuleName = request.getParameter("modulename");
		String Marks = request.getParameter("mark");
		
		boolean isTrue;
		
		isTrue = TeacherAddMarksDBUtil.insertaddmarks(StudentID, StudentName, ModuleID, ModuleName, Marks);
		
		
		if(isTrue == true) {
			
			out.println("<script type = 'text/javascript'>");  // java script
			out.println("alert('Successfully Marks Added');"); // alert added successful
			out.println("location ='TeacherDashboard.jsp'"); // redirect to home page
			out.println("</script>"); // end of the script
		}
		
		else {
			
			out.println("<script type = 'text/javascript'>"); // java script
			out.println("alert('Marks Added Unsuccessfully');"); // alert added unsuccessful
			out.println("location ='TeacherAddMarks.jsp'"); // redirect to add teacher page
			out.println("</script>"); // end of the script
		}
		
		
	}

}
