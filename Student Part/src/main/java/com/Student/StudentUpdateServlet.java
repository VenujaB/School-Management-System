package com.Student;  // Student Package

import java.io.IOException; // Import java IOException
import java.io.PrintWriter; // Import java PrintWriter


import javax.servlet.RequestDispatcher; // Import javax  RequestDispatcher
import javax.servlet.ServletException; // Import javax  ServletException
import javax.servlet.annotation.WebServlet; // Import javax annotation WebServlet
import javax.servlet.http.HttpServlet; // Import javax HttpServlet
import javax.servlet.http.HttpServletRequest; // Import javax HttpServletRequest 
import javax.servlet.http.HttpServletResponse; // Import javax HttpServletResponse
import javax.servlet.http.HttpSession; // Import javax Http Session


@WebServlet("/StudentUpdateServlet")
public class StudentUpdateServlet extends HttpServlet { // Beginning of the Student Update Servlet
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		PrintWriter out = response.getWriter(); // print writer
		response.setContentType("text/html"); // response
		
		String SID = request.getParameter("sid"); // Get Parameter form  Student update jsp
		String SName = request.getParameter("sname"); // Get Parameter form  Student update jsp
		String SEmail = request.getParameter("semail"); // Get Parameter form  Student update jsp
		String SContact = request.getParameter("scontact"); // Get Parameter form  Student update jsp
		String SLocation = request.getParameter("slocation"); // Get Parameter form  Student update jsp
		String Sdob = request.getParameter("sdob"); // Get Parameter form  Student update jsp
		String SGender = request.getParameter("sgender"); // Get Parameter form  Student update jsp
		String SPassword = request.getParameter("spass"); // Get Parameter form  Student update jsp 
		
								
		boolean isTrue;
		
		// Update student method	
		isTrue = StudentDBUtil.updatestudent(SID, SName, SEmail, SContact, SLocation, Sdob, SGender, SPassword);
			
		if(isTrue == true) {
					
			HttpSession session = request.getSession(); // session 
			String StudentEmail = (String) session.getAttribute("SEmail"); // pass the session id with user login email
		
			Student student = StudentDBUtil.getStudent(StudentEmail); // get attribute 
			request.setAttribute("student", student);
			
			RequestDispatcher dis = request.getRequestDispatcher("StudentUpdate.jsp"); // send to student display
			dis.forward(request, response);
								
		   
		}		
		
							
		else {
						
			out.println("<script type = 'text/javascript'>"); // java script
			out.println("alert('Update not Succesfully');"); // alert added successful
			out.println("location ='StudentUpdate.jsp'"); // redirect to student update page
			out.println("</script>"); // end of the script
		}	
			
		 			
	}
		
} // End of the Student Update Servlet



