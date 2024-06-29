package com.Manager;

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


@WebServlet("/ManagerLogin_Servelet")
public class ManagerLogin_Servelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		//taking values from login form(View class)
		
		String UserName=request.getParameter("Uname");
		String Password=request.getParameter("pass");
		
		
		
		boolean isTrue;
		//calling validate function
		isTrue=managerDButil.validate(UserName, Password);
		
		if(isTrue==true) {
			
			
			
			Manager managerDetails=managerDButil.getManager1(UserName);
			request.setAttribute("managerDetails", managerDetails);
			
			//opening login session
			HttpSession session = request.getSession();
			session.setAttribute("login",managerDetails.getUserName() );
			
			
			//redirecting to the HR Main Page
			
	RequestDispatcher dis=request.getRequestDispatcher("HR_main_page.jsp");
			dis.forward(request, response);
			
		}else {
			
			//showing error message
			out.println("<script type='text/javascript'>");
			out.println("alert('Your Username or Password is Incorrect!');");
			out.println("location='Hr_manager_login.jsp'");
			out.println("</script>");
			
		}
		
		
	}

}