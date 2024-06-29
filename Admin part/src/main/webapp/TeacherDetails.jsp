<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Teacher Details</title>
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
<style>
.table td{
text-align:center;
border:5px solid white;
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

<table border="2px" class="table table-dark" class="b">

<c:forEach var="teacher" items="${teacherDetails}">

<c:set var="id" value="${teacher.id}"/>
<c:set var="name" value="${teacher.name}"/>
<c:set var="NIC" value="${teacher.NIC}"/>
<c:set var="email" value="${teacher.email}"/>
<c:set var="phone" value="${teacher.phone}"/>
<c:set var="address" value="${teacher.address}"/>
<c:set var="birth" value="${teacher.birth}"/>
<c:set var="userName" value="${teacher.userName}"/>
<c:set var="password" value="${teacher.password}"/>

<tr>
<td>Teacher ID</td>
<td>${teacher.id }</td>
</tr>
<tr>
<td>Teacher Name</td>
<td>${teacher.name }</td>
</tr>
<tr>
<td>Teacher NIC</td>
<td>${teacher.NIC }</td>
</tr>

<tr>
<td>Teacher Email</td>
<td>${teacher.email }</td>
</tr>
<tr>
<td>Teacher Phone</td>
<td>${teacher.phone }</td>
</tr>
<tr>
<td>Teacher Address</td>
<td>${teacher.address }</td>
</tr>
<tr>
<td>Teacher Date-Of-Birth</td>
<td>${teacher.birth }</td>
</tr>
<tr>
<td>Teacher UserName</td>
<td>${teacher.userName }</td>
</tr>
<tr>
<td>Teacher Password</td>
<td>${teacher.password }</td>
</tr>

</c:forEach>

</table>

<c:url value="AdminTeacherUpdate.jsp" var="adminTeacherUpdate">
<c:param name="id" value="${id}"/>
<c:param name="name" value="${name}"/>
<c:param name="NIC" value="${NIC}"/>
<c:param name="email" value="${email}"/>
<c:param name="phone" value="${phone}"/>
<c:param name="address" value="${address}"/>
<c:param name="birth" value="${birth}"/>
<c:param name="userName" value="${userName}"/>
<c:param name="password" value="${password}"/>
</c:url>
<center>
<a href="${adminTeacherUpdate}">
<input type="Button" name="update" value="Update Data" class="btn btn-warning">
</a>

<c:url value="deleteAdminTeacher.jsp" var="adminTeacherDelete">
<c:param name="id" value="${id}"/>
<c:param name="name" value="${name}"/>
<c:param name="NIC" value="${NIC}"/>
<c:param name="email" value="${email}"/>
<c:param name="phone" value="${phone}"/>
<c:param name="address" value="${address}"/>
<c:param name="birth" value="${birth}"/>
<c:param name="userName" value="${userName}"/>
<c:param name="password" value="${password}"/>
</c:url>

<a href="${adminTeacherDelete}">
<input type="Button" name="delete" value="Delete Account" class="btn btn-danger">
</a>
<br>
<br>
<br>
<a href="adminSearch.jsp">
<input type="button" name="back" value="<<back to search.." class="btn btn-success">
</a>
</center>
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


</body>
</html>