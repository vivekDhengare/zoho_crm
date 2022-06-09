<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Compose Email</title>
</head>
<body>
               <h3> Email</h3>
 
 <form action="sendEmail" method="post">            
<pre>
TO        :<input type="text" name="to" value="${email}"readonly>

SUBJECT   :<input type="text" name="subject"/>

         
             **COMPOSE MAIL**
           <textarea name="body" rows="8" cols="100">
           </textarea>
           
           
           <input type="Submit" value="SEND EMAIl"/>


</pre>
</form>