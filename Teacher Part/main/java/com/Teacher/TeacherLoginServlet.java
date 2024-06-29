package com.Teacher; //Teacher Package

import java.io.IOException; //Import java IOException
import java.io.PrintWriter; //Import java PrintWriter


import javax.servlet.RequestDispatcher; //Import javax RequesrDispactcher
import javax.servlet.ServletException; //Import javax ServletException
import javax.servlet.annotation.WebServlet; //Import javax annotation.WebServlet
import javax.servlet.http.HttpServlet; //Import javax http.HttpServlet
import javax.servlet.http.HttpServletRequest; //Import javax HttpServletRequest
import javax.servlet.http.HttpServletResponse; //Import javax HttpServletResponse
import javax.servlet.http.HttpSession; //Import javax HttpSession


@WebServlet("/TeacherLoginServlet")
public class TeacherLoginServlet extends HttpServlet { // Beginning of the teacher login servlet
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String TEmail = request.getParameter("email");
		String TPassword = request.getParameter("password");
		
			
		boolean isTrue;
		
		isTrue = TeacherDBUtil.validate(TEmail, TPassword);
		
		if(isTrue == true) {
			
			Teacher teacherDetails = TeacherDBUtil.getTeacher(TEmail);
			request.setAttribute("teacherDetails", teacherDetails);
			
			HttpSession session = request.getSession();
			session.setAttribute("TEmail", teacherDetails.getTEmail());
			
			RequestDispatcher dis = request.getRequestDispatcher("TeacherDashboard.jsp");
			dis.forward(request, response);
		}
		
		else {
			
			out.println("<script type = 'text/javascript'>");
			out.println("alert('Your Email or Password Incorrect');");
			out.println("location = 'TeacherLogin.jsp'");
			out.println("</script>");
			
		}
		
	}

}
