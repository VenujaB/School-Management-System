<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@page import= "java.util.ArrayList" %>
    <%@page import= "com.Teacher.Teacher"%>
    <%@page import = "java.sql.*" %>
	<%@page import = "java.sql.DriverManager" %>
	<%@page import = "java.sql.Connection" %>
    
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="css/bootstrap.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
    
<meta charset="ISO-8859-1">
<title>Teacher Display</title>
</head>
<body>
	    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <a class="navbar-brand" href="home.html"> <img src="images/logo.jpg"  width="250px" height="65px" ></a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
      
        <div class="collapse navbar-collapse " id="navbarSupportedContent">
          <ul class="navbar-nav mr-auto">
            <li class="nav-item ">
              <a class="nav-link h6 ml-4" href="Home.jsp">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item h6 ml-4">
              <a class="nav-link" href="StudentModule.jsp">Module</a>
            </li>
            <li class="nav-item h6 ml-4">
                <a class="nav-link " href="ContactUs.jsp">Contact Us</a>
              </li> 
              <li class="nav-item h6 ml-4">
                <a class="nav-link " href="AboutUs.jsp">About Us</a>
              </li>
              
             <li class="nav-item h6 ml-4">
                <a class="nav-link active" href="TeacherDisplayServlet">View Profile</a>
              </li>
               <li class="nav-item h6 ml-4">
                <a class="nav-link " href="TeacherDashboard.jsp">Dashboard</a>
              </li>                   
          </ul>
         	 <form class="form-inline my-2 my-lg-0" method="POST" action="#"> 
            <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search" width = "20px">
            <button class="btn btn-success my-2 my-sm-0" type="submit">Search</button>
           </form>                                      
          <form method="POST" action="TeacherLogoutServlet"> 
                      <input type="submit" value="logout" class="btn btn-primary text-center shadow ml-2"> 
            </form> 
          
          
        </div>
      </nav>
<br>

      
       <div class="row"> 
        <div class="col-lg-3 col-12"> 
        </div>

      
		<div class="col-lg-6 col-12">
        <div class="border  ml-3 mr-3 bg-light shadow" >
       <form class="mt-3 ml-3 mr-3 mb-3" action = "StudentDisplayServlet" method = "post">
           
       <%
       
       	Teacher teacher = (Teacher)request.getAttribute("teacher");
       
       %>
       
       <div class="form-group">
             <label>Teacher ID</label>
              <input type="text" class="form-control" value ="<%=teacher.getTID()%>" name = "tid" readonly>
            </div>
            
			<div class="form-group">
                <label >Teacher Name</label>
                <input type="text" class="form-control" value = "<%=teacher.getTName()%>" name = "tname" readonly>
            </div>
            
             <div class="form-group">
                        <label >Teacher Email</label>
                        <input type="text" class="form-control" value = "<%=teacher.getTEmail()%>" name = "temail" readonly>
                    </div> 
                    
              <div class="form-group">
                        <label >Teacher NIC</label>
                        <input type="text" class="form-control" value = "<%=teacher.getTNIC()%>" name = "tnic" readonly>
                    </div>
                    
                      <div class="form-group">
                        <label >Teacher Contact Number</label>
                        <input type="text" class="form-control" value = "<%=teacher.getTContact()%>" name = "tcontact" readonly>
                      
                    </div>
                    
                     <div class="form-group">
                        <label >Teacher Permanent Resident</label>
                        <input type="text" class="form-control" value = "<%=teacher.getTLocation()%>" name = "tlocation" readonly>
                      
                    </div>
                     <div class="form-group">
                        <label >Teacher Gender</label>
                        <input type="text" class="form-control" value = "<%=teacher.getTGender()%>" name = "tgender" readonly>
                      
                    </div>
                    
                    
                     <div class="form-group">
                        <label >Teacher Date Of Birth</label>
                        <input type="text" class="form-control" value = "<%=teacher.getTdob()%>" name = "tdob" readonly>
                     </div>  
                    
                    <div class="form-group">
                        <label >Teacher Password</label>
                        <input type="text" class="form-control" value = "<%=teacher.getTPassword()%>" name = "tpass" readonly>
                        <br>
                    </div>      
			 </form> 
  
  
  							<form method="POST" action="TeacherUpdateServlet">
				   <div class="form-group text-center">
                        <input type="submit" value="Edit" class="btn btn-danger btn-lg"  >
                   </div> 
                 </form> 
                  
                            
                 <br>
       
       </div>
       </div>
	
	
<br>
<br>
<!-- Footer -->
<footer class="page-footer-dark bg-dark font-small mdb-color lighten-3 pt-4  text-white">

    <!-- Footer Links -->
    <div class="container text-center text-md-left">
  
      <!-- Grid row -->
      <div class="row">
  
        <!-- Grid column -->
        <div class="col-md-4 col-lg-3 mr-auto my-md-4 my-0 mt-4 mb-1">
  
          <!-- Content -->
          <h5 class="font-weight-bold text-uppercase mb-4">About Our Website</h5>
          <p>This is an educational website and a good school environment for children and teachers. 
              we hope to give our 24 hours and if there are have clarification you we can contact us Thank You</p>
  
        </div>
        <!-- Grid column -->
  
        <hr class="clearfix w-100 d-md-none">
  
        <!-- Grid column -->
        
  
        <hr class="clearfix w-100 d-md-none">
  
        <!-- Grid column -->
        <div class="col-md-4 col-lg-3 mx-auto my-md-4 my-0 mt-4 mb-1">
  
          <!-- Contact details -->
          <h5 class="font-weight-bold text-uppercase mb-4">Address</h5>
  
          <ul class="list-unstyled">
            <li>
              <p>
                <i class="fas fa-home mr-3"></i> Nugegoda, Colombo</p>
            </li>
            <li>
              <p>
                <i class="fas fa-envelope mr-3"></i> support@woodland.com</p>
            </li>
            <li>
              <p>
                <i class="fas fa-phone mr-3"></i> + 11 321 1774</p>
            </li>
            <li>
              <p>
                <i class="fas fa-print mr-3"></i> + 11 321 1775</p>
            </li>
          </ul>
  
        </div>
        <!-- Grid column -->
  
        <hr class="clearfix w-100 d-md-none">
  
        <!-- Grid column -->
        <div class="col-md-2 col-lg-2 text-center mx-auto my-4">
  
          <!-- Social buttons -->
          <h5 class="font-weight-bold text-uppercase mb-4">Follow Us</h5>
  
          <ul class="list-unstyled">
            <li>
              <a href="https://www.facebook.com/"><img src="images/fb.jpg"    width="45px" height="45px" style="border-radius: 20px;"> </a>
            </li>
            <li>
                <a href="https://www.instagram.com/"><img src="images/instagram.jpg"   class="mt-2" width="45px" height="45px" style="border-radius: 20px;"></a>
            </li>
            <li>
                <a href="https://twitter.com/"><img src="images/twitter.jpg"  class="mt-2" width="45px" height="45px" style="border-radius: 20px;"></a>
            </li>
            <li>
                <a href="https://mail.google.com/"><img src="images/gmail.jpg"  class="mt-2" width="45px" height="45px" style="border-radius: 20px;"></a>
            </li>
          </ul>
  
        </div>
        <!-- Grid column -->
  
      </div>
      <!-- Grid row -->
  
    </div>
    <!-- Footer Links -->
  
    <!-- Copyright -->
    <div class="footer-copyright text-center py-3">© 2021 Copyright:
      <a href="home.html"> woodlandinternationalschool.com</a>
    </div>
    <!-- Copyright -->
  
  </footer>
  <!-- Footer -->



     

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
</body>
</html>
	
				
		 	
		
				
	


