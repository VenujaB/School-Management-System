package com.Contactus;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ContactUsServlet")
public class ContactUsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter(); // print writer   
		response.setContentType("text/html"); // response 
		
		String CUS_FName = request.getParameter("fullname"); // get parameter form
		String CUS_Email = request.getParameter("email"); // get parameter form
		String CUS_Message = request.getParameter("msg"); // get parameter form
		
		boolean isTrue;
		
		isTrue= ContactUsDBUtil.insertcontactus(CUS_FName, CUS_Email, CUS_Message); // pass values from add teacher dbutil
		
		if(isTrue == true) {
			
			out.println("<script type = 'text/javascript'>");  // java script
			out.println("alert('Successfully Send');"); // alert added successful
			out.println("location ='Home.jsp'"); // redirect to home page
			out.println("</script>"); // end of the script
		}
		
		else {
			
			out.println("<script type = 'text/javascript'>"); // java script
			out.println("alert('Send Unsuccessful');"); // alert added unsuccessful
			out.println("location ='ContactUs.jsp'"); // redirect to add teacher page
			out.println("</script>"); // end of the script
		}
		
		
		
	}

}
