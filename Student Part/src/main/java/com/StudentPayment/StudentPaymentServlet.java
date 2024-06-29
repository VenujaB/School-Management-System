package com.StudentPayment;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/StudentPaymentServlet")
public class StudentPaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		

		String PayHName = request.getParameter("card"); // Get Card Holder name from payment.jsp page  
		String PayCNumber = request.getParameter("number"); // Get Card Number from payment.jsp page  
		String PayDate = request.getParameter("date"); //  Get Expire Date from payment.jsp page 
		String PayCvv = request.getParameter("cvv"); // Get CVV from payment.jsp
		String PayAmount = request.getParameter("amount");
		
		boolean isTrue;
		
		isTrue = StudentPaymentDBUtil.insertstudentpayment(PayHName, PayCNumber, PayDate, PayCvv,PayAmount);
		
		if (isTrue == true) {
			
			out.println("<script type = 'text/javascript'>");
		    out.println("alert('Payment Successfully');");
		    out.println("location ='StudentDashboard.jsp'");
			out.println("</script>");
		}
		
		else {
			out.println("<script type = 'text/javascript'>");
			out.println("alert('Payment Unsuccessful');");
			out.println("location ='StudentPayment.jsp'");
			out.println("</script>");
			
		}
					
	}

}
