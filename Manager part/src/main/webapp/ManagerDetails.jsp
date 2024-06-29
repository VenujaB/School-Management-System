<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Employee Details</title>
    <link rel="stylesheet" href="css/bootstrap.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
    <style>
    .table td {
   
text-align: center;
border:5px solid white;


} 


    </style>
</head>
<body>

<!--%

response.setHeader("Cache-Control" , "no-store" );

if(session.getAttribute("login")==null)
	response.sendRedirect("Hr_manager_login.jsp");

%-->
    
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
              <a class="nav-link " href="#">Support Service</a>
            </li>
            <li class="nav-item h6 ml-4">
                <a class="nav-link " href="#">Contact Us</a>
              </li> 
              <li class="nav-item h6 ml-4">
                <a class="nav-link " href="#">About Us</a>
              </li>
              <li class="nav-item h6 ml-4">
                <a class="nav-link " href="#">Login</a>
              </li>
              <li class="nav-item h6 ml-4">
                <a class="nav-link " href="Apply.html">Apply Now</a>
              </li>
          </ul>
         
         
        </div>
     
     <div><form action="Manager_LogOut_servelet" method="post"><input type="submit" name="logout" value="Logout" class="btn btn-primary"></form></div>
      </nav>
      
<br>
<br>

<table border="2px" class="table table-dark" class="b">

<c:forEach var="manager" items="${employeeDetails}">

<c:set var="id" value="${manager.id}"/>
<c:set var="name" value="${manager.name}"/>
<c:set var="NIC" value="${manager.NIC}"/>
<c:set var="email" value="${manager.email}"/>
<c:set var="phone" value="${manager.phone}"/>

<c:set var="DOB" value="${manager.DOB}"/>
<c:set var="userName" value="${manager.userName}"/>
<c:set var="password" value="${manager.password}"/>

<tr >
<td>Manager ID</td>
<td>${manager.id }</td>
</tr>
<tr>
<td>Manager Name</td>
<td>${manager.name }</td>
</tr>
<tr>
<td>Manager NIC</td>
<td>${manager.NIC }</td>
</tr>
<tr>
<td>Manager Email</td>
<td>${manager.email }</td>
</tr>
<tr>
<td>Manager Phone</td>
<td>${manager.phone }</td>
</tr>

<tr>
<td>Manager DOB</td>
<td>${manager.DOB }</td>
</tr>
<tr>
<td>Manager UserName</td>
<td>${manager.userName }</td>
</tr>
<tr>
<td>Manager Password</td>
<td>${manager.password }</td>
</tr>

</c:forEach>

</table>

</br>

<c:url value="ManagerUpdate.jsp" var="managerUpdate">
<c:param name="id" value="${id}"/>
<c:param name="name" value="${name}"/>
<c:param name="NIC" value="${NIC}"/>
<c:param name="email" value="${email}"/>
<c:param name="phone" value="${phone}"/>

<c:param name="DOB" value="${DOB}"/>
<c:param name="userName" value="${userName}"/>
<c:param name="password" value="${password}"/>
</c:url>

<br>
<center>

<a href="${managerUpdate}">

<input type="Button" class="btn btn-warning" name="update" value="Update My Data">

</a>

<c:url value="ManagerNEDelete.jsp" var="managerNEDelete">
<c:param name="id" value="${id}"/>
<c:param name="name" value="${name}"/>
<c:param name="NIC" value="${NIC}"/>
<c:param name="email" value="${email}"/>
<c:param name="phone" value="${phone}"/>

<c:param name="DOB" value="${DOB}"/>
<c:param name="userName" value="${userName}"/>
<c:param name="password" value="${password}"/>
</c:url>

<a href="${managerNEDelete}">

<input type="Button" class="btn btn-danger" name="delete" value="Delete Account">

</a>



</center>
<br>

<center>
<a href="ManagerSearch.jsp"><button class="btn btn-success my-2 my-sm-0" type="button">Back to Search</button></a>
<a href="HR_main_page.jsp"><button class="btn btn-success my-2 my-sm-0 ml-3" type="button">Back to admin dash board</button></a><br>
</center>
<br>
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