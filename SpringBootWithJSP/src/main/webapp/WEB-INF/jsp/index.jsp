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
<h1>Welcome to SpringBoot Application</h1> 
<hr>
<div class="form">
<form action="hello" method="POST" onsubmit="return validate()">
	<table>
	<tr>
	<td>Enter your name: </td>
	<td><input id="name" name="name"></td>
	<td><input type="submit" value="SUBMIT"></td>
	</tr>
	
	</table>
</form>


</div>
</body>
</html>