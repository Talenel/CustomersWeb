<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
p{

	color: red;
	font-weight: bold;
}

</style>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Display Customers and Selection</title>
</head>
<body>
<h2>Display Customers and Selection</h2>

<p>${error}</p>

<div>${message}</div>

<h4>Please select the Customer ID you would like to display from the above list</h4>
<h4>Enter 'New' to enter a new customer</h4>
<form action="Select" method="post">

 Customer ID:<br>
 <input type="text" name="id">
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