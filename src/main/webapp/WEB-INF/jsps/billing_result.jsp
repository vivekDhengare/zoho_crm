<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
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
<th>PAYMENT METHORD</th>
<th>MOBILE</th>
<th>AMOUNT</th>
<th>PRODUCT NAME</th>
</tr>
<c:forEach items ="${bill}" var="bills">
<tr>
<td>${bills.id}</td>
<td>${bills.firstName}</td>
<td>${bills.lastName}</td>
<td>${bills.email}</td>
<td>${bills.payemntMethord}</td>
<td>${bills.mobile}</td>
<td>${bills.amount}</td>
<td>${bills.productName}</td>
</tr>
</c:forEach>
</table>
</body>
</html>