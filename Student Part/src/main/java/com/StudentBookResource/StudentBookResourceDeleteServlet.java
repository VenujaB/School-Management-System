package com.StudentBookResource;

import java.io.IOException;
import java.io.PrintWriter;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/StudentBookResourceDeleteServlet")
public class StudentBookResourceDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String ResourceID =request.getParameter("bookid");
		System.out.println("Passing");
		
		boolean isTrue;
		
		isTrue=StudentBookResourceDBUtil.BookResourceDelete(ResourceID);
		
		
		
		if(isTrue==true) {
			
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Booking Deleted successfully!');");
			out.println("location='StudentBookingSearch.jsp'");
			out.println("</script>");
			
			
			
			
		}
		else {
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Booking Deleted Unsuccessfully!');");
			out.println("location='StudentBookView.jsp'");
			out.println("</script>");
			
		}
		
		
	}

}
