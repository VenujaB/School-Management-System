package com.TeacherAddTimeTable;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TeacherTimeTableDisplayServlet")
public class TeacherTimeTableDisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		boolean isTrue = TeacherAddTimeTableDBUtil.viewAll();
		
		System.out.println("123");
		
		if(isTrue == true) {
			
			ArrayList<TeacherAddTimeTable> TimeTableDetails = (ArrayList<TeacherAddTimeTable>) TeacherAddTimeTableDBUtil.getView();
			request.setAttribute("TimeTableDetails",TimeTableDetails);
			System.out.println(TimeTableDetails);
			RequestDispatcher dis=request.getRequestDispatcher("TeacherTimeTableDisplay.jsp");
			dis.forward(request, response);
			
			}
			
			else {
				
	}
		
	}

}
