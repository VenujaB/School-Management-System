<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>manager update resource</title>
    <link rel="stylesheet" href="css/bootstrap.css">
	<link rel="stylesheet" href="css/Button.css">
    <!--<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">-->
</head>
<body>




<!-- %

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
              <a class="nav-link h6 ml-4" href="Home.jsp">Home <span class="sr-only">(current)</span></a>
            </li>
           
           
            <li class="nav-item h6 ml-4">
                <a class="nav-link " href="ContactUs.jsp">Contact Us</a>
              </li> 
              <li class="nav-item h6 ml-4">
                <a class="nav-link " href="AboutUs.jsp">About Us</a>
              </li>
              
              <li class="nav-item h6 ml-4">
                <a class="nav-link " href="StudentApply.jsp">Apply Now</a>
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
        <br>

<%
  String id=request.getParameter("id");
  String name=request.getParameter("name");
  String type=request.getParameter("type");
  String price=request.getParameter("price");
  String rNO=request.getParameter("rNO");
  String capacity=request.getParameter("capacity");
  String details=request.getParameter("details");

%>



<div class="row">
    <div class="col-lg-0 col-0 ml-5">
    
    </div>
        <div class="col-lg-4 col-12">
            <div class="border ml-3 mr-3 bg-light shadow">
                <form class="mt-3 ml-3 mr-3 mb-3" action="Manager_UpdateResource_Servelet" method="post">
                
                 <div class="form-group">
                        <label>Resource ID</label>
                        <input type="text" class="form-control" name="rid" value="<%=id%>" readonly>
                    </div>
                    
                
                    <div class="form-group">
                        <label>Resource Name</label>
                        <input type="text" class="form-control" name="rname" value="<%=name%>">
                    </div>
                  
                    <div class="form-group">
                        <label >Resource Type</label>
                        <input type="text" class="form-control" name="type" value="<%=type%>">
                    </div>
				
					<div class="form-group">
                        <label >Price</label>
                        <input type="text" class="form-control"name="price" value="<%=price%>">
                    </div>
                  
					
					<div class="form-group">
                        <label >Resource Number </label>
                        <input type="text" class="form-control" name="rNO" value="<%=rNO%>"readonly>
              
					
					<br>
                   
					
	   <br>
	    </div>
		 <div class="form-group">
                        <label >Seat Capacity</label>
                        <input type="text" class="form-control" name="capacity" value="<%=capacity%>">
                    </div>

		
                    <div class="form-group">
                        <label >Details </label>
                        <input type="text" class="form-control"  name="details" value="<%=details%>">
                    </div>
                   

					                
                 
                    
					
					
                    <div class="text-center">
                        <input type="submit" name="name" value="update data"class="btn btn-success btn-lg btn-block text-center mb-5">
                       
                    </div>        
                </form>
            </div>
        </div>
        <div class="col-lg-7 col-12">
            <img src="pic/600.jpg " height="800px" width="100%" class="ml-4">
        </div>
        <div class="col-lg-1 col-0">
        </div>   
    </div>
    
    <!--  - 

<center>
<form action="updateManager_Servelet" method="post">
AID<input type="text" name="Mid" value="%=id%>" readonly><br>
name<input type="text" name="name" value="%=name%>"><br>
NIC<input type="text" name="nic" value="%=NIC%>"><br>
email<input type="text" name="email" value="%=email%>"><br>
phone<input type="text" name="phone" value="%=phone%>"><br>
DOB<input type="date" name="dob" value="%=DOB%>"><br>
User name<input type="text" name="Uname" value="%=userName%>"><br>
password<input type="Password" name="pass" value="%=password%>"><br>

<input type="submit" name="name" value="update data"><br>

</form>
</center>

-->

</body>
</html>