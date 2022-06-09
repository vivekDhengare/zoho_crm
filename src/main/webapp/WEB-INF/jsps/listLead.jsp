<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
       <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Leads</title>
</head>
<body>
<a href="createLead">Create New Lead</a>
<table border="1">

<tr>
<th>ID</th>
<th>FIRST NAME</th>
<th>LAST NAME</th>
<th>EMAIL</th>
<th>LEAD SOURCE</th>
<th>MOBILE</th>
</tr>
<c:forEach items ="${lead}" var="lead">
<tr>
<td>${lead.id}</td>
<td><a href="getLeadById?id=${lead.id}">${lead.firstName}</a></td>
<td>${lead.lastName}</td>
<td>${lead.email}</td>
<td>${lead.leadSource}</td>
<td>${lead.mobile}</td>
</tr>
</c:forEach>
</table>
</body>
</html>