package com.TeacherAddMarks;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TeacherMarksDisplayServlet")
public class TeacherMarksDisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		boolean isTrue = TeacherAddMarksDBUtil.viewAll();
		
		if(isTrue == true) {
		
		ArrayList<TeacherAddMarks> MarkDetails = (ArrayList<TeacherAddMarks>) TeacherAddMarksDBUtil.getView();
		request.setAttribute("MarkDetails",MarkDetails);
		RequestDispatcher dis=request.getRequestDispatcher("TeacherMarksDisplay.jsp");
		dis.forward(request, response);
		
		}
		
		else {
			
			
			
			
		}
	}

}
