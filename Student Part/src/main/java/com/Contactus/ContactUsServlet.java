package com.Contactus; // Package of Contact us

import java.io.IOException; // Import java IOException 
import java.io.PrintWriter; // Import java PrintWriter
 
import javax.servlet.ServletException;   // Import javax  ServletException
import javax.servlet.annotation.WebServlet;   // Import javax annotation WebServlet
import javax.servlet.http.HttpServlet;  // Import javax HttpServlet 
import javax.servlet.http.HttpServletRequest; // Import javax HttpServletRequest 
import javax.servlet.http.HttpServletResponse; // Import javax HttpServletResponse

@WebServlet("/ContactUsServlet") // Servlet Name 
public class ContactUsServlet extends HttpServlet { // Beginning of the Contact us Servlet Class
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter(); // print writer   
		response.setContentType("text/html"); // response 
		
		String CUS_FName = request.getParameter("fullname"); // get parameter full name contact us jsp page
		String CUS_Email = request.getParameter("email"); // get parameter email contact us jsp page
		String CUS_Message = request.getParameter("msg"); // get parameter form msg
		
		boolean isTrue; // Boolean value
		
		// Insert Contact Us Method get from Contact us db util
		
		isTrue= ContactUsDBUtil.insertcontactus(CUS_FName, CUS_Email, CUS_Message); 
		
		if(isTrue == true) { // Condtion is true
			
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

} // End of the Contact us Servlet Class
