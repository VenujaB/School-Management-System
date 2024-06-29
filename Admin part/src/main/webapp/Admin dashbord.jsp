<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Admin Dashboard</title>
    <link rel="stylesheet" href="css/bootstrap.css">
	<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
	
	<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
	
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
              <li class="nav-item h6 ml-4" >
             <a class="nav-link " href="AdminDisplayServlet">View Profile</a>
              </li>
              
              <!--form action="AdminDisplayServlet" method="post">
              
              <input type="submit" value="Profile">
              </form-->
              
          </ul>
          <form class="form-inline my-2 my-lg-0">
            <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-success my-2 my-sm-0" type="submit">Search</button>
          </form>
        </div>
        <div>
        <form action="Admin_LogOut" method="post"><tr>
                <input class="btn btn-primary text-center shadow ml-2" type="submit" class="nav-link " value ="Logout">
                </form>
                </div>
     
        
      </nav>
<!--  
<div class="row">
    <div class="col-12">

        <div class="container">
            <diV class="card-deck">

                <div class="card text-dark bg-white mb-3 shadow">
                  <img src="pic/read.jpg" class="card-img-top" width="250px" height="250px">
                    <div class="card-body">
                        <h5 class="card-title text-center">Manage Student</h5>
						 
    <center><a href="adminSearch.jsp" class="btn btn-primary">Go somewhere</a></center>
                        
                    </div>
                </div>  
    
                      <div class="card text-dark bg-white mb-3 shadow">
                         <img src="pic/73.png" class="card-img-top" width="250px" height="250px">
                           <div class="card-body">
                             <h5 class="card-title text-center">Manage Teacher</h5>
                             <center><a href="AdminInsert.jsp" class="btn btn-primary">Go somewhere</a></center>
                           </div>
                        </div>    
    
                       
                        
                        <div class="card text-dark bg-white mb-3 shadow">
                            <img src="pic/post.jpg" class="card-img-top" width="250px" height="250px">
                              <div class="card-body">
                                <h5 class="card-title text-center">Update System notices</h5>
                                <center><a href="#" class="btn btn-primary">Go somewhere</a></center>
                              </div>
                           </div>  
            </div>
        </div>   
    </div>
    
</div>

<center>   
<form action="VA" method="post">
<input type ="submit" value="View All" name="VA" class="btn btn-warning">
</form>
</center>

-->

<br>





<style>
body {
    background-color: rgb(255, 255, 255)
}

.container {
    margin-top: 60px
}
</style>



<br>
    


 <div class="row">
               <div class="col-12 col-lg-6">
                  <!--button-->
                  <div class="row">
                    <div class="col-12">
                      <div class="col-12">
                        <div class="container text-black">
                          <a href="Student_AU.jsp"" class="text-decoration-none">
                          <diV class="card text-black bg-light shadow">
                              <div class="card-body"> 
                                   <h5 class="card-title">
                                     <table style="width: 100%;">
                                       <tr>
                                         <td><img src="pic/stu.png" class="rounded-circle" width="100px" height="100px"></td>
                                         <td>Manage Student</td>
                                       </tr>
                                     </table>             
                                    </h5>
                              </div>
                          </diV>
                          </a>
                        </div>
                        <br>
                      </div>
                      
                    </div>
                  </div>

                  <div class="row">
                    <div class="col-12">
                      <div class="col-12">
                        <div class="container">
                          <a href="Teacher_AU.jsp" class="text-decoration-none">
                          <diV class="card text-black bg-light shadow">
                              <div class="card-body"> 
                                   <h5 class="card-title">
                                     <table style="width: 100%;">
                                       <tr>
                                         <td><img src="pic/teach01.jpg" class="rounded-circle" width="100px" height="100px"></td>
                                         <td>Manage Teacher</td>
                                       </tr>
                                     </table>             
                                    </h5>
                              </div>
                          </diV>
                          </a>
                        </div>
                        <br>
                      </div>
                    </div>
                  </div>

                  <div class="row">
                    <div class="col-12">
                      <div class="col-12">
                        <div class="container">
                          <a href="NoticeAU.jsp" class="text-decoration-none">
                          <diV class="card text-black bg-light shadow">
                              <div class="card-body"> 
                                   <h5 class="card-title">
                                     <table style="width: 100%;">
                                       <tr>
                                         <td><img src="pic/note01.png" class="rounded-circle" width="100px" height="100px"></td>
                                         <td>Update System notices</td>
                                       </tr>
                                     </table>             
                                    </h5>
                              </div>
                          </diV>
                          </a>
                        </div>
                        <br>
                      </div>
                    </div>
                  </div>
          </div>  


            <div class="col-11 col-lg-6">
              <img src="pic/admin01.jpg" width="100%" height="750px">
          </div>
          </div>



   


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
               Nugegoda, Colombo</p>
            </li>
            <li>
              <p>
              support@woodland.com</p>
            </li>
            <li>
              <p>
              + 11 321 1774</p>
            </li>
            <li>
              <p>
              + 11 321 1775</p>
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



     
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js" integrity="sha384-wHAiFfRlMFy6i5SRaxvfOCifBUQy1xHdJ/yoi7FRNXMRBu5WHdZYu1hA6ZOblgut" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>
</body>
</html>
</body>
</html>