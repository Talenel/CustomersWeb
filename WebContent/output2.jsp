<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Display Customer Data</title>
</head>
<body>
<h2>Display Customer Data</h2>
<div>${message}</div>
<h4>Enter (1) to search for another customer or (2) to Edit the customer's address</h4>
<form action="Choice" method="post">

 Choice:<br>
 <input type="text" name="choice">
 
 <br>
  <input type="submit">
  <input type="reset" value="Clear"/>
  
</form>

<br>
<br>
<br>
<a href="http://localhost:8080/CustomersWeb/search.html" class="btn btn-default">Home</a>
</body>
</html>