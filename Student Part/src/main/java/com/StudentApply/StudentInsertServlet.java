package com.StudentApply; // Student Apply Package

import java.io.IOException; // Import Java IO Exception
import java.io.PrintWriter; // Import Java IO PrintWriter

import javax.servlet.ServletException; // Import servlet exception
import javax.servlet.annotation.WebServlet; // Import webservlet
import javax.servlet.http.HttpServlet; // import http servlet
import javax.servlet.http.HttpServletRequest; // import http servlet request
import javax.servlet.http.HttpServletResponse; // import http servlet response


@WebServlet("/StudentInsertServlet")
public class StudentInsertServlet extends HttpServlet { // Beginning Student Insert servlet
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String stuAname = request.getParameter("fName"); // Get parameter form Student Apply jsp
		String stuAemail = request.getParameter("eAddress");  // Get parameter form Student Apply jsp
		String stuAcontact = request.getParameter("phone");  // Get parameter form Student Apply jsp
		String stuAlocation = request.getParameter("address");  // Get parameter form Student Apply jsp
		String stuAgender = request.getParameter("gender");  // Get parameter form Student Apply jsp
		String stuAdob = request.getParameter("dob");  // Get parameter form Student Apply jsp
		String stuAgname = request.getParameter("gName");  // Get parameter form Student Apply jsp
		String stuAgnumber = request.getParameter("GNumber");  // Get parameter form Student Apply jsp
		
		boolean isTrue;
		
		// Pass Method Student Apply DB Util
		isTrue = StudentApplyDBUtil.insertapply(stuAname, stuAemail, stuAcontact, stuAlocation, stuAgender, stuAdob, stuAgname, stuAgnumber);
		
		if(isTrue == true) { // if Condition true 
			
			out.println("<script type = 'text/javascript'>"); // Java Script
			out.println("alert('Application SuccessFully Submitted')"); // Alert  Application SuccessFully Submitted
			out.println("location = 'Home.jsp'"); // Redirect to Home page
			out.println("</script>"); // End of the Java Script
		}
		
		else {
			
			out.println("<script type = 'text/javascript'>"); // java script
			out.println("alert('Application UnsuccessFull')"); // Alert Application Unsuccessful
			out.println("location = 'Home.jsp'"); // Redirect to Home page
			out.println("</script>"); // End of the javascript
		}
		
	}

}
