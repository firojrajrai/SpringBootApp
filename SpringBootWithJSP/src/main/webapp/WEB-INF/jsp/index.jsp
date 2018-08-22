<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
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
<form:form action="verify" method="POST" onsubmit="return validate()">
	<table  style="background-color: gray; border-style:outset; ">
	<tr>
	<td>user name: </td>
	<td><input id="name" type="text" name="name"></td>
	</tr>
	<tr>
	<td>password: </td>
	<td><input id="pass" type="password" name="pass"></td>
	</tr>
	<tr align="center">
	<td colspan="2"><input type="submit" value="SUBMIT"></td>
	<tr>
	</table>
	<a href="<c:url value="showRegister"/>">New User? Click Me...</a>
</form:form>


</div>
</body>
</html>