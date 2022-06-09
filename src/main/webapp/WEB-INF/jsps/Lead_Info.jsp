<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead Info</title>
</head>
<body>
<h3>Lead Information</h3>
ID         : ${lead.id}<br>
FIRST NAME : ${lead.firstName}<br>
LAST  NAME : ${lead.lastName}<br>
EMAIL      : ${lead.email}<br>
MOBILE     : ${lead.mobile}<br>
LEAD SOURCE: ${lead.leadSource}<br>

<form action="compose" method="post">

<input type="hidden" name="emailId" value ="${lead.email}"/>

<input type="Submit" value ="Email"/> <br>
</form>

<form action="convertLead" method="post">

<input type="hidden" name="id" value ="${lead.id}"/>

<input type="Submit" value ="Convert"/>

</form>
</body>
</html>