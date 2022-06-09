<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      ***<h3>INFORMATION  |    BILLING </h3>***
<form action="generate"method="post">
<pre>
FIRST NAME        :<input type="text" name="firstName" value ="${contact.firstName}"readonly/>

LAST  NAME        :<input type="text" name="lastName" value ="${contact.lastName}"readonly/>

EMAIL             :<input type="text" name="email"value ="${contact.email}"readonly/>

MOBILE            :<input type="text" name="mobile" value ="${contact.mobile}" readonly/>

PRODUCT NAME      :<select name="productName">
			       <option value="samsungTv">SAMSUNG TV</option>
			       <option value="videoconTv">VIDEOCON TV</option>
		           <option value="soniTv">SONI TV</option>
			       <option value="tosibaTv">TOSIBA TV</option>
			       </select><br>
A M O U N T       :<input type="text" name="amount"/>			       
			       
PAYMENT METHORD   :<select name="payemntMethord">
			       <option value="demondDraft">DEMAND DRAFT</option>
			       <option value="cash">CASH</option>
			       <option value="phonePay">PHONE PAY</option>
			       <option value="internetBanking">INTERNET BANKING</option>
			       </select>			  

                   <input type="Submit" value="GENERATE BILL"/>
</pre>
</form>
</body>
</html>