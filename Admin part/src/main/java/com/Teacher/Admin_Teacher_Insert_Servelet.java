package com.Teacher;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Admin_Teacher_Insert_Servelet")
public class Admin_Teacher_Insert_Servelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("nme");
		String NIC=request.getParameter("nic");
		String email=request.getParameter("email");
		String Pno=request.getParameter("phone");
		String Address=request.getParameter("address");
		String DOB=request.getParameter("DOB");
		String User=request.getParameter("uNme");
		String password=request.getParameter("pwd");
		
		boolean isTrue;
		
		isTrue=teacherDButil.InsertTeacher(name, NIC,email, Pno,Address,DOB, User, password);
		
		if(isTrue==true) {
			
			RequestDispatcher dis=request.getRequestDispatcher("adminSearchTeacher.jsp");
			dis.forward(request, response);
			
		}else {
			
			RequestDispatcher dis2=request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request , response);
			
		}
		
		
		
	}

}
