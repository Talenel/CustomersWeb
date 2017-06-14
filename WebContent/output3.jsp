<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
p.error{
	color: red;
	font-weight: bold;

}

</style>

<title>Update Customer Address</title>
</head>
<body>
<h2>Update Customer Address</h2>
<div>${message}</div>
<br>
<br>
<p class="error">${error}</p>

<h4>Enter (1) to search for another customer or (2) to Edit the customer's address</h4>
<form action="Update" method="post">

 <br>Street Address:
 <input type="text" name="street">
 <br>City:
 <input type="text" name="city">
 <br>State:
 <input type="text" name="state">
 <br>Zip Code:
 <input type="text" name="zip">
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