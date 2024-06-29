package com.Teacher;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Admin_Update_Teacher_Servelet")
public class Admin_Update_Teacher_Servelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String id=request.getParameter("tid");
		String name=request.getParameter("name");
		String NIC=request.getParameter("nic");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		String Address=request.getParameter("address");
		String DOB=request.getParameter("birth");
		String userName=request.getParameter("Uname");
		String password=request.getParameter("pass");
		
		boolean isTrue;
		
		isTrue=teacherDButil.updateTeacher(id, name,NIC, email, phone,Address,DOB, userName, password);
		
		if(isTrue==true) {
			
			
			
			List<Teacher> teacherDetails=teacherDButil.getAdminTeacher(userName);
			request.setAttribute("teacherDetails",teacherDetails);
			
			RequestDispatcher dis=request.getRequestDispatcher("TeacherDetails.jsp");
			dis.forward(request, response);
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Data Updated Successfully..!');");
			out.println("</script>");
			
		}
		else {
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Data Updated Successfully..!');");
			out.println("</script>");
			
			List<Teacher> teacherDetails=teacherDButil.getAdminTeacher(userName);
			request.setAttribute("teacherDetails",teacherDetails);
			RequestDispatcher dis=request.getRequestDispatcher("TeacherDetails.jsp");
			dis.forward(request, response);
			
		}
		
	}
	
}
	
	
		
		


