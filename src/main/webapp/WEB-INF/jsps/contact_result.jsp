<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Contact</title>
</head>
<body>
<h3>ALL CONTACT</h3>
<a href="createLead">Create New Lead</a>
<table border="1">

<tr>
<th>ID</th>
<th>FIRST NAME</th>
<th>LAST NAME</th>
<th>EMAIL</th>
<th>LEAD SOURCE</th>
<th>MOBILE</th>
<th>BILLING</th>
</tr>
<c:forEach items ="${contact}" var="contacts">
<tr>
<td>${contacts.id}</td>
<td><a href="getContactById?id=${contacts.id}">${contacts.firstName}</a></td>
<td>${contacts.lastName}</td>
<td>${contacts.email}</td>
<td>${contacts.leadSource}</td>
<td>${contacts.mobile}</td>
<td><a href="getContactById?id=${contacts.id}">Generate Bill</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>