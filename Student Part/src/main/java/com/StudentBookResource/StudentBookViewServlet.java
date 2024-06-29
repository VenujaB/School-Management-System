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


@WebServlet("/StudentBookViewServlet")
public class StudentBookViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String Email =request.getParameter("email");
		
		
		boolean isTrue= StudentBookResourceDBUtil.viewBooking(Email);
		
		if(isTrue==true) {
			
			
			List<StudentBookResource> BookingDetails = StudentBookResourceDBUtil.getResourceBook(Email);	
			request.setAttribute("BookingDetails",BookingDetails);
			
			RequestDispatcher dis=request.getRequestDispatcher("StudentBookView.jsp");
			dis.forward(request, response);
			
		}
		
		else {
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Incorrecct Email!!');");
			out.println("location='StudentBookingSearch.jsp'");
			out.println("</script>");
		
		}
		
	}

}
