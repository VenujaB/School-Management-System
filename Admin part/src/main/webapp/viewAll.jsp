<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@page import="java.sql.ResultSet" %>
 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="2px">

<tr>
<td>Admin ID</td>
<td>Admin Name</td>
<td>Admin Email</td>
<td>Admin Phone</td>
<td>Admin UserName</td>
<td>Admin Password</td>

</tr>

<c:forEach var="admin" items="${adminDetails}">

<c:set var="id" value="${admin.id}"/>
<c:set var="name" value="${admin.name}"/>
<c:set var="email" value="${admin.email}"/>
<c:set var="phone" value="${admin.phone}"/>
<c:set var="userName" value="${admin.userName}"/>
<c:set var="password" value="${admin.password}"/>


<tr>
<td>${admin.id }</td>
<td>${admin.name }</td>
<td>${admin.email }</td>
<td>${admin.phone }</td>
<td>${admin.userName }</td>
<td>${admin.password }</td>
<td>
<c:url value="deleteAdminStudent.jsp" var="adminStDelete">
<c:param name="id" value="${id}"/>
<c:param name="name" value="${name}"/>
<c:param name="email" value="${email}"/>
<c:param name="phone" value="${phone}"/>
<c:param name="userName" value="${userName}"/>
<c:param name="password" value="${password}"/>
</c:url>

<a href="${adminStDelete}">
<input type="Button" name="delete" value="Delete Account">
</a>

</td>
</tr>
<!--tr>
<td>Admin Email</td>
<td>${admin.email }</td>
</tr>
<tr>
<td>Admin Phone</td>
<td>${admin.phone }</td>
</tr>
<tr>
<td>Admin UserName</td>
<td>${admin.userName }</td>
</tr>
<tr>
<td>Admin Password</td>
<td>${admin.password }</td>
</tr>
-->
</c:forEach>

</table>
<!-- 
<c:url value="updateAdmin.jsp" var="adminUpdate">
<c:param name="id" value="${id}"/>
<c:param name="name" value="${name}"/>
<c:param name="email" value="${email}"/>
<c:param name="phone" value="${phone}"/>
<c:param name="userName" value="${userName}"/>
<c:param name="password" value="${password}"/>
</c:url>

<a href="${adminUpdate}">
<input type="Button" name="update" value="Update My Data">
</a>

<c:url value="deleteAdminStudent.jsp" var="adminStDelete">
<c:param name="id" value="${id}"/>
<c:param name="name" value="${name}"/>
<c:param name="email" value="${email}"/>
<c:param name="phone" value="${phone}"/>
<c:param name="userName" value="${userName}"/>
<c:param name="password" value="${password}"/>
</c:url>

<a href="${adminStDelete}">
<input type="Button" name="delete" value="Delete Account">
</a>

<a href="adminSearch.jsp">
<input type="button" name="back" value="<<back to search..">

-->

</body>
</html>

