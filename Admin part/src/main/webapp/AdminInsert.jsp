<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Insert Student</title>
    <link rel="stylesheet" href="css/bootstrap.css">
	<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
	
	<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
	 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
	 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
    <!--<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">-->


</head>
<body>

    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <a class="navbar-brand" href="home.html"> <img src="pic/logo.jpg"  width="250px" height="65px" ></a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
      
        <div class="collapse navbar-collapse " id="navbarSupportedContent">
          <ul class="navbar-nav mr-auto">
            <li class="nav-item">
              <a class="nav-link h6 ml-4" href="#">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item h6 ml-4">
              <a class="nav-link" href="#">Module</a>
            </li>
            
            <li class="nav-item h6 ml-4">
                <a class="nav-link " href="#">Contact Us</a>
              </li> 
              <li class="nav-item h6 ml-4">
                <a class="nav-link " href="#">About Us</a>
              </li>
              <li class="nav-item h6 ml-4">
             
              </li>
          </ul>
        
        </div>
        <div>
        <form action="Admin_LogOut" method="post"><tr>
                <input class="btn btn-primary" type="submit" class="nav-link " value ="Logout">
                </form>
                </div>
     
        
      </nav>
      
      <br>
      
     
<div class="row">
    <div class="col-lg-0 col-0 ml-5">
    
    </div>
        <div class="col-lg-4 col-12">
            <div class="border ml-3 mr-3 bg-light shadow">
                <form class="mt-3 ml-3 mr-3 mb-3" action="Admin_Student_Insert" method="post">
                
       
                    
                    
                
                    <div class="form-group">
                        <label>Teacher full name</label>
                        <input type="text" class="form-control" name="nme" >
                    </div>
                  
                  
					<div class="form-group">
                        <label >Email</label>
                        <input type="email" class="form-control"name="email" >
                    </div>
               
					
					<div class="form-group">
                        <label >Contact Number</label>
                        <input type="number" class="form-control" name="phone" >
              
	    </div>
	    
	    
		
		
                    <div class="form-group">
                        <label >Address </label>
                        <input type="text" class="form-control" name="address" >
                    </div>
            

					<div class="form-group">
                        <label >Birth Day </label>
                        <input type="date" class="form-control" name="DOB">
                    </div>                       
                    <div class="form-group">
                        <label >User name </label>
                        <input type="text" class="form-control" name="uNme">
                    </div>   
                    <div class="form-group">
                        <label >Password </label>
                        <input type="password" class="form-control" name="pwd">
                    </div>   
					
					
                    <div class="text-center">
                        <input type="submit" name="name" value="Submit Details"class="btn btn-success btn-lg btn-block text-center mb-5">
                       
                    </div>        
                </form>
            </div>
        </div>
        <div class="col-lg-7 col-12">
            <img src="pic/kids.png " height="600px" width="110%" class="ml-2">
        </div>
        <div class="col-lg-1 col-0">
        </div>   
    </div>
<!--  
<form action="Admin_Student_Insert" method="post">

Name<input type="text" name="nme"><br>
Email<input type="text" name="email"><br>
Phone Number <input type="text" name="phone"><br>
Address<input type="text" name="address"><br>
Birth Day <input type="date" name="DOB"><br>
User Name<input type="text" name="uNme"><br>
Password<input type="text" name="pwd"><br>

<input type="submit" value="Submit Details">


</form>
-->

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
              <a href="https://www.facebook.com/"><img src="pic/fb.jpg"    width="45px" height="45px" style="border-radius: 20px;"> </a>
            </li>
            <li>
                <a href="https://www.instagram.com/"><img src="pic/instagram.jpg"   class="mt-2" width="45px" height="45px" style="border-radius: 20px;"></a>
            </li>
            <li>
                <a href="https://twitter.com/"><img src="pic/twitter.jpg"  class="mt-2" width="45px" height="45px" style="border-radius: 20px;"></a>
            </li>
            <li>
                <a href="https://mail.google.com/"><img src="pic/gmail.jpg"  class="mt-2" width="45px" height="45px" style="border-radius: 20px;"></a>
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

</body>
</html>