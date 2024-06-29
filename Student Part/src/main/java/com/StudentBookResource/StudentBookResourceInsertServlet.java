package com.StudentBookResource; // Student Book Resource Package

import java.io.IOException; // Import java IOException
import java.io.PrintWriter; // Import java PrintWriter

import javax.servlet.ServletException; // Import javax  ServletException
import javax.servlet.annotation.WebServlet; // Import javax annotation WebServlet
import javax.servlet.http.HttpServlet; // Import javax HttpServlet 
import javax.servlet.http.HttpServletRequest; // Import javax HttpServletRequest 
import javax.servlet.http.HttpServletResponse; // Import javax HttpServletResponse


@WebServlet("/StudentBookResourceInsertServlet")
public class StudentBookResourceInsertServlet extends HttpServlet { // Beginning of the Student Book Resource Insert Servlet
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String ResourceID = request.getParameter("bookid");  // Get Parameter from student book resource jsp
		String StuName = request.getParameter("sname");   // Get Parameter from student book resource jsp
		String StuEmail = request.getParameter("email");  // Get Parameter from student book resource jsp
		String StuMobile = request.getParameter("mobile");  // Get Parameter from student book resource jsp
		String ResourceType = request.getParameter("rtype"); // Get Parameter from student book resource jsp
		String BookDate = request.getParameter("date"); // Get Parameter from student book resource jsp
		String BookTime = request.getParameter("time");// Get Parameter from student book resource jsp
		
		boolean isTrue;
		
		isTrue = StudentBookResourceDBUtil.insertbookresource(ResourceID, StuName, StuEmail, StuMobile, ResourceType, BookDate, BookTime);
		
		if (isTrue == true) {
			
			// Display java script when booking successful
			
			out.println("<script type = 'text/javascript'>");
		    out.println("alert('Booking Successfull');");
		    out.println("location ='StudentBookResource.jsp'");
			out.println("</script>");
		}
		
		else {
			
			// Display java script when booking Unsuccessful
			out.println("<script type = 'text/javascript'>");
			out.println("alert('Booking Unsuccessful');");
			out.println("location ='StudentBookResource.jsp'");
			out.println("</script>");
			
		}
		
		
	}

} // End of the Student Book Resource Insert Servlet
