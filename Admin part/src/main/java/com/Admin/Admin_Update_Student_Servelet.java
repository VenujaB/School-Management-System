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


@WebServlet("/Admin_Update_Student_Servelet")
public class Admin_Update_Student_Servelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		//taking values from AdminStudentUpdate page
		
		String id=request.getParameter("sid");
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		String Address=request.getParameter("address");
		String DOB=request.getParameter("birth");
		String userName=request.getParameter("Uname");
		String password=request.getParameter("pass");
		
		boolean isTrue;
		
		//calling update student function
		
		isTrue=adminDButil.updateStudent(id, name, email, phone,Address,DOB, userName, password);
		
		if(isTrue==true) {
			
			//taking student array list
			
			List<Student> studentDetails=adminDButil.getAdminStudent(userName);
			request.setAttribute("studentDetails",studentDetails);
			
			//directing to studentDetails page
			
			RequestDispatcher dis=request.getRequestDispatcher("studentDetails.jsp");
			dis.forward(request, response);
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Data Updated Successfully..!');");
			out.println("</script>");
			
		}
		else {
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Data Updated Successfully..!');");
			out.println("</script>");
			
			List<Student> studentDetails=adminDButil.getAdminStudent(userName);
			request.setAttribute("studentDetails",studentDetails);
			RequestDispatcher dis=request.getRequestDispatcher("studentDetails.jsp");
			dis.forward(request, response);
			
		}
		
	}
	
}
	
	
		
		


