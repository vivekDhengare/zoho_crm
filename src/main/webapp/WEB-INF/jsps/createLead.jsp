<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Lead</title>
</head>
<body>
<h3>Create  |  Lead</h3>
<form action="saveCreatLead"method="post">
<pre>
FIRST NAME  :<input type="text" name="firstName"/>

LAST  NAME  :<input type="text" name="lastName"/>

EMAIL       :<input type="text" name="email"/>

LEAD SOURCE :<select name="leadSource">
			 <option value="newsPaper">NEWS PAPER</option>
			 <option value="radio">RADIO</option>
			 <option value="socailMedia">SOCIAL MEDIA</option>
			 <option value="tv">TV</option>
			 </select>

MOBILE      :<input type="text" name="mobile"/>

             <input type="Submit" value="save"/>
</pre>


</form>
</body>
</html>