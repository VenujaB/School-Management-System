package com.Student; // Student Package

import java.io.IOException; // Import java IOException
import java.io.PrintWriter; // Import java PrintWriter



import javax.servlet.RequestDispatcher; // Import javax  RequestDispatcher
import javax.servlet.ServletException; // Import javax  ServletException
import javax.servlet.annotation.WebServlet;  // Import javax annotation WebServlet
import javax.servlet.http.HttpServlet;  // Import javax HttpServlet 
import javax.servlet.http.HttpServletRequest; // Import javax HttpServletRequest 
import javax.servlet.http.HttpServletResponse; // Import javax HttpServletResponse
import javax.servlet.http.HttpSession; // Import javax Http Session


@WebServlet("/StudentLoginServlet")
public class StudentLoginServlet extends HttpServlet {  // Beginning of the Student Login Servlet
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String SEmail = request.getParameter("email"); // Get parameter form student login jsp 
		String SPassword = request.getParameter("password"); // Get parameter form student login jsp 
			
		boolean isTrue;
		
		isTrue = StudentDBUtil.validate(SEmail, SPassword); // Validate method
				
		if(isTrue == true) {
			
			
			Student studentDetails = StudentDBUtil.getStudent(SEmail); // Get Student Details
			request.setAttribute("studentDetails", studentDetails); // Set Student details
						
			HttpSession session = request.getSession(); // Start the session when Student login
			session.setAttribute("SEmail",studentDetails.getSEmail()); // studentDetails
			
			RequestDispatcher dis = request.getRequestDispatcher("StudentDashboard.jsp"); // foward to student dashbaord js[
			dis.forward(request, response);
		
						
		}
		
		else {
			
			// If user Email and password incorrect display java script
			out.println("<script type = 'text/javascript'>"); 
			out.println("alert('Your Email or Password is Incorrect');");
			out.println("location ='StudentLogin.jsp'"); // Redirect to student login
			out.println("</script>"); // end of the java script
			
		}
		
		
	}

}  // End of the Student Login Servlet
