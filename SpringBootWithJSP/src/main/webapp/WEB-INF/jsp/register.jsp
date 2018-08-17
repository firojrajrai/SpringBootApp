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
<body>
<div>
<h2>Register Here</h2>
</div> 
<hr>
<div class="form">
<form action="register" method="POST" onsubmit="return validate()">
	<table>
	<tr>
	<td>Enter your name: </td>
	<td><input name="name" type="text"></td>
	</tr>
	<tr>
	<td>Enter your age: </td>
	<td><input name="age" type="text"></td>
	</tr>
	<tr>
	<td>Enter your phone: </td>
	<td><input name="name" type="text"></td>
	</tr>
	<td><input type="submit" value="SUBMIT"></td>
	</table>
</form>


</div>
</body>
</html>