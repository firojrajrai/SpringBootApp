<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<link rel="stylesheet" href="/resources/css/style.css">
<script type="text/javascript" src="resources/js/app.js"></script>
<title>Spring Boot</title>
</head>
<body style="background-color: #077c7a">
<div align="center">
<h2>Welcome to EX!LANT</h2>
</div> 
<hr>
<div class="form" align="center">
<form action="hello" method="POST" onsubmit="return validate()">
	<table>
	<tr>
	<td>user name: </td>
	<td><input id="name" type="text" name="name"></td>
	</tr>
	<tr>
	<td>password: </td>
	<td><input id="pass" type="password" name="pass"></td>
	</tr>
	<tr>
	<td><input type="submit" value="SUBMIT"></td>
	<tr>
	</table>
	<a href="register.jsp">New User? Click Me...</a>
</form>


</div>
</body>
</html>