<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Customer</title>
<style>
p{
	color: red;
	font-weight: bold;

}

</style>
</head>
<body>

<p>${error}</p>

<form action="Add" method="post">

 <br>Title:
 <input type="text" name="title">
 <br>First Name:
 <input type="text" name="first">
 <br>Last Name:
 <input type="text" name="last">
 <br>Email:
 <input type="text" name="email">
 <br>Street Address:
 <input type="text" name="street">
 <br>City:
 <input type="text" name="city">
 <br>State:
 <input type="text" name="state">
 <br>Zip Code:
 <input type="text" name="zip">
 <br>Job Position:
 <input type="text" name="position">
 <br>Company Name:
 <input type="text" name="company">
  <input type="submit">
  <input type="reset" value="Clear"/>
  
</form>

<br>
<br>
<br>
<a href="http://localhost:8080/CustomersWeb/search.html" class="btn btn-default">Home</a>

</body>
</html>