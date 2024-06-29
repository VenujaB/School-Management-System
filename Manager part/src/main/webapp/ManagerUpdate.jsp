<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>update manager</title>
    <link rel="stylesheet" href="css/bootstrap.css">
	<link rel="stylesheet" href="css/Button.css">
    <!--<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">-->
</head>
<body>




<!--%

response.setHeader("Cache-Control" , "no-cache , no-store, must-revalidate" );

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
                <a class="nav-link " href="Login.html">Login</a>
              </li>
              <li class="nav-item h6 ml-4">
                <a class="nav-link " href="Apply.html">Apply Now</a>
              </li>
          </ul>
          <form class="form-inline my-2 my-lg-0">
            <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
			
			<div id="new4">
            <button class="btn btn-success my-2 my-sm-0" type="submit">Search</button>
			</div>
          
		  
		  </form>
        </div>
        </nav>

<%
  String id=request.getParameter("id");
  String name=request.getParameter("name");
  String NIC=request.getParameter("NIC");
  String email=request.getParameter("email");
  String phone=request.getParameter("phone");
  String DOB=request.getParameter("DOB");
  String userName=request.getParameter("userName");
  String password=request.getParameter("password");
%>



<div class="row">
    <div class="col-lg-0 col-0 ml-5">
    
    </div>
        <div class="col-lg-4 col-12">
            <div class="border ml-3 mr-3 bg-light shadow">
                <form class="mt-3 ml-3 mr-3 mb-3" action="Manager_UpdateNE_Servelet" method="post">
                
                 <div class="form-group">
                        <label>MID</label>
                        <input type="text" class="form-control" name="Mid" value="<%=id%>" readonly>
                    </div>
                    
                
                    <div class="form-group">
                        <label>Employee full name</label>
                        <input type="text" class="form-control" name="name" value="<%=name%>">
                    </div>
                  
                    <div class="form-group">
                        <label >Employee NIC No</label>
                        <input type="text" class="form-control" name="nic" value="<%=NIC%>">
                    </div>
				
					<div class="form-group">
                        <label >Email</label>
                        <input type="email" class="form-control"name="email" value="<%=email%>">
                    </div>
                  
					
					<div class="form-group">
                        <label >Contact Number</label>
                        <input type="number" class="form-control" name="phone" value="<%=phone%>">
              
					
					<br>
                   
					
	   <br>
	    </div>
		 <div class="form-group">
                        <label >Date of birth</label>
                        <input type="date" class="form-control" name="dob" value="<%=DOB%>">
                    </div>

		
                    <div class="form-group">
                        <label >User name </label>
                        <input type="text" class="form-control" name="Uname" value="<%=userName%>" readonly>
                    </div>
                   

					<div class="form-group">
                        <label >Password </label>
                        <input type="password" class="form-control" name="pass" value="<%=password%>">
                    </div>                       
                 
                    
					
					
                    <div class="text-center">
                        <input type="submit" name="name" value="update data"class="btn btn-success btn-lg btn-block text-center mb-5">
                       
                    </div>        
                </form>
            </div>
        </div>
        <div class="col-lg-7 col-12">
            <img src="pic/EU01.jpg " height="800px" width="100%" class="ml-4">
        </div>
        <div class="col-lg-1 col-0">
        </div>   
    </div>
    
    
<!--  

<center>
<form action="updateManager_Servelet" method="post">
AID<input type="text" name="Mid" value="<%=id%>" readonly><br>
name<input type="text" name="name" value="<%=name%>"><br>
NIC<input type="text" name="nic" value="<%=NIC%>"><br>
email<input type="text" name="email" value="<%=email%>"><br>
phone<input type="text" name="phone" value="<%=phone%>"><br>
DOB<input type="date" name="dob" value="<%=DOB%>"><br>
User name<input type="text" name="Uname" value="<%=userName%>"><br>
password<input type="Password" name="pass" value="<%=password%>"><br>

<input type="submit" name="name" value="update data"><br>

</form>
</center>

-->

</body>
</html>