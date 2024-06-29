package com.Admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Login_Servelet")
public class Login_Servelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		//taking values from login form (view class)
		
		String UserName=request.getParameter("email");
		String Password=request.getParameter("pass");
		
		
		
		boolean isTrue;
		
		//calling validate function 
		
		isTrue=adminDButil.validate(UserName, Password);
		
		if(isTrue==true) {
			
			
			
			
			
			Admin adminDetails=adminDButil.getAdmin1(UserName);
			request.setAttribute("adminDetails", adminDetails);
			
			// opening a login session
			
			HttpSession session = request.getSession();
			session.setAttribute("login",adminDetails.getUserName() );
			
		//redirecting to Admin dashboard
			
			
	RequestDispatcher dis=request.getRequestDispatcher("Admin dashbord.jsp");
			dis.forward(request, response);
			
		}else {
			
			//showing error message
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Your Username or Password is Incorrect!');");
			out.println("location='Admin login.jsp'");
			out.println("</script>");
			
		}
		
		
	}

}