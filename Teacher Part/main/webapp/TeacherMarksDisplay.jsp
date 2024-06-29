<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

	 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Marks Display Page</title>
    <link rel="stylesheet" href="css/bootstrap.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
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
                <a class="nav-link " href= "TeacherDisplayServlet">View Profile</a> 
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
<table class="table table-secondary text-center">

<tr>
  <th>ID</th>
  <th>Student ID</th>
  <th>Student Name</th>
  <th>Module ID</th>
  <th>Module Name</th>
  <th>Marks</th>
  <th>Update</th>
  <th>Delete</th>
  
  </tr>
  
 <c:forEach var ="marks" items ="${MarkDetails}">
	
	<c:set var = "ID" value = "${marks.getID()}"/>
	<c:set var = "StudentID" value = "${marks.getStudentID()}"/>
	<c:set var = "StudentName" value = "${marks.getStudentName()}"/>
	<c:set var = "ModuleID" value = "${marks.getModuleID()}"/>
	<c:set var = "ModuleName" value = "${marks.getModuleName()}"/>
	<c:set var = "Marks" value = "${marks.getMarks()}"/>
	 
	<tr>
	<td>${marks.getID()}</td>
	<td>${marks.getStudentID()}</td>
	<td>${marks.getStudentName()}</td>
	<td>${marks.getModuleID()}</td>
	<td>${marks.getModuleName()}</td>
	<td>${marks.getMarks()}</td>
	
	
	<td><c:url value="TeacherUpdateMarks.jsp" var="marksUpdate">
		
	<c:param name="ID" value="${ID}"/>
	<c:param name="StudentID" value="${StudentID}"/>
	<c:param name="StudentName" value="${StudentName}"/>
	<c:param name="ModuleID" value="${ModuleID}"/>
	<c:param name="ModuleName" value="${ModuleName}"/>
	<c:param name="Marks" value="${Marks}"/>

		
</c:url>


<a href="${marksUpdate}">

<input type="Button" class="btn btn-warning" name="update" value="Update">

</a></td>


	<td><c:url value="TeacherDeleteMarks.jsp" var="MarkDelete">
		
	<c:param name="ID" value="${ID}"/>
	<c:param name="StudentID" value="${StudentID}"/>
	<c:param name="StudentName" value="${StudentName}"/>
	<c:param name="ModuleID" value="${ModuleID}"/>
	<c:param name="ModuleName" value="${ModuleName}"/>
	<c:param name="Marks" value="${Marks}"/>
		
</c:url>


<a href="${MarkDelete}">

<input type="Button" class="btn btn-danger" name="Delete" value="Delete">

</a></td>




	</tr>

</c:forEach>

</table>

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
