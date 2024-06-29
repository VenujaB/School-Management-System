package com.StudentBookResource;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/StudentBookResourceUpdateServlet")
public class StudentBookResourceUpdateServlet extends HttpServlet { // Beginning of the Student BookResource Update Servlet
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String ResourceID = request.getParameter("bookid"); // Get Parameter from Student Resource update jsp
		String StuName = request.getParameter("sname");  // Get Parameter from Student Resource update jsp
		String StuEmail = request.getParameter("email");  // Get Parameter from Student Resource update jsp
		String StuMobile = request.getParameter("mobile");  // Get Parameter from Student Resource update jsp
		String ResourceType = request.getParameter("rtype"); // Get Parameter from Student Resource update jsp
		String BookDate = request.getParameter("date"); // Get Parameter from Student Resource update jsp
		String BookTime = request.getParameter("time"); // Get Parameter from Student Resource update jsp
		
		boolean isTrue;
		
		
		
		isTrue = StudentBookResourceDBUtil.updateBooking(ResourceID, StuName, StuEmail, StuMobile, ResourceType, BookDate, BookTime);
		
		
		
		if(isTrue == true) {
			
			// create the list object to get resource book
			
			List<StudentBookResource> BookingDetails = StudentBookResourceDBUtil.getResourceBook(StuEmail);	
			request.setAttribute("BookingDetails",BookingDetails); // Set Attribute
			RequestDispatcher dis = request.getRequestDispatcher("StudentBookView.jsp"); // forward Student Book view jsp
			dis.forward(request, response);
		}
		
		else {
			
			// Display java script when booking unsuccessful
			
			out.println("<script type = 'text/javascript'>");
			out.println("alert('Update Unsuccessful');");
			out.println("location ='StudentBookingSearch.jsp'");
			out.println("</script>");
			
		}
		
	}

} // End of the Student BookResource Update Servlet
