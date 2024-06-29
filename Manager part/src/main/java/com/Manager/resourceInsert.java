package com.Manager;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class resourceInsert
 */
@WebServlet("/resourceInsert")
public class resourceInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("nm");
		String type=request.getParameter("type");
		String Bookingprice=request.getParameter("price");
		String rNO_or_vNO=request.getParameter("no");
		String Seat_Capacity=request.getParameter("seatNO");
		String Details=request.getParameter("detils");
	}

}
