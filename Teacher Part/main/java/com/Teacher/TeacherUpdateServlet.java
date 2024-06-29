package com.Teacher;

import java.io.IOException; 
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/TeacherUpdateServlet")
public class TeacherUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String TID = request.getParameter("tid");
		String TName = request.getParameter("tname");
		String TEmail = request.getParameter("temail");
		String TNIC = request.getParameter("tnic");
		String TContact = request.getParameter("tcontact");
		String TLocation = request.getParameter("tlocation");
		String TGender = request.getParameter("tgender");
		String Tdob = request.getParameter("tdob");
		String TPassword = request.getParameter("tpass");
		
		boolean isTrue;
		
		isTrue = TeacherDBUtil.updateTeacher(TID,TName, TEmail,TNIC, TContact, TLocation, TGender, Tdob, TPassword);
			
		if(isTrue == true) {
			
			System.out.println("working");
					
			HttpSession session = request.getSession(); // session 
			String TeacherEmail = (String) session.getAttribute("TEmail"); // pass the session id with user login email
		
			Teacher teacher = TeacherDBUtil.getTeacher(TeacherEmail); // get attribute 
			request.setAttribute("teacher", teacher);
			
			RequestDispatcher dis = request.getRequestDispatcher("TeacherUpdate.jsp"); // send to student display
			dis.forward(request, response);
		
		}		
					
										
		else {
									
			out.println("<script type = 'text/javascript'>");
			out.println("alert('Update not Succesfully');");
			out.println("location ='TeacherUpdate.jsp'");
			out.println("</script>");
		}	
		
		
}

}
