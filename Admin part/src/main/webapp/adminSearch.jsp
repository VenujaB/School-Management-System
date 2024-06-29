<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Search Student</title>
    <link rel="stylesheet" href="css/bootstrap.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
    
    
    <style>
    
 h1{
 color:black;
 border:;
 }   
input[type=text], select {
  width: 50%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
input[type=submit]:hover {
  background-color: #00004d;
}
form {
  border-radius: 20px;
  background-color: #99ccff;
  padding: 20px;
  width:50%;
  opacity:0.9;
  border:1px solid black;
  
}
.bg-img{
width:60%;

border-radius:10px;

background-image: url("pic/0002.jpg");

  min-height: 500px;

  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  position: relative;

}
</style>
   
    
</head>
<body>
    
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <a class="navbar-brand" href="home.html"> <img src="pic/logo.jpg"  width="250px" height="65px" ></a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
      
        <div class="collapse navbar-collapse " id="navbarSupportedContent">
          <ul class="navbar-nav mr-auto">
            <li class="nav-item ">
              <a class="nav-link h6 ml-4" href="home.html">Home <span class="sr-only">(current)</span></a>
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
              
          </ul>
      
        </div>
        <div>
        <form1 action="Admin_LogOut" method="post"><tr>
                <input class="btn btn-primary text-center shadow ml-2" type="submit" class="nav-link " value ="Logout">
                </form1>
                </div>
        
      </nav>
      
   <br>
<br>
<center>
<h1><b>Search Student</b></h1>
</center>
<center>
<div class="bg-img">

<br>
<br>
<form action="Admin_View_Student_servelet" method="Post">

<input type="text" name="user" ><br>
<br>
<input type="submit" class="btn btn-primary" name="FindUser" value="viewUser">

</form>
</div>
<br>

<a href="Admin dashbord.jsp">
<input type="button" class="btn btn-primary" name="back dash" value="<<back to the Dashboard..">
</a>
</center>

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



     

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>

</body>
</html>