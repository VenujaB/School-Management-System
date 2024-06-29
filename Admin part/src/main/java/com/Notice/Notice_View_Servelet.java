package com.Notice;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Notice_View_Servelet")
public class Notice_View_Servelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		
		boolean isTrue=noticeDButil.viewAll();
		
if(isTrue==true) {
			

			List<Notice>Notice=noticeDButil.getView();	
			request.setAttribute("Notice",Notice);
			
			
	RequestDispatcher dis=request.getRequestDispatcher("viewNotices.jsp");
			dis.forward(request, response);
			
		}
		
		else {
			
			
		
		}
		
		
	}
	
	

}
