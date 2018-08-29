<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<link rel="stylesheet" href="/resources/css/style.css">
<script type="text/javascript">
function confirm(){
	var s1=document.getElementById("p1").value;
	var s2=document.getElementById("p2").value;
	if (s1!=s2) {
		alert("Password is not Confirmed...")
		return false;
	}else{
		return true;
	}
}



</script>
<title>Spring Boot</title>
</head>
<body style="background-color: #077c7a">
<div>
<h2 align="center">Register Here</h2>
</div> 
<hr>
<div class="form" align="center">
<form:form action="addEmployee" method="POST" modelAttribute="employee" onsubmit="return confirm()">
	<table style="background-color: gray; border-style:outset; ">
	
	<tr>
	<td>ID: </td>
	<td><form:input path="eid"/></td>
	</tr>
	<tr>
	<td>Name: </td>
	<td><form:input path="name"/></td>
	</tr>
	<tr>
	<td>Age: </td>
	<td><form:input id="age" path="age" onkeyup="checkAge(this)"/></td>
	</tr>
	<tr>
	<td>Phone: </td>
	<td><form:input id="phone" path="phone" onkeyup="checkPhone(this)"/></td>
	</tr>
	<tr>
	<td>Gender: </td>
	<td>
	<form:radiobutton path="gender" value="M"/>Male 
	<form:radiobutton path="gender" value="F"/>Female 
	</td>
	</tr>
	<tr>
	<td>Enter your Designation: </td>
	<td><input name="designation" type="text"></td>
	</tr>
	<tr>
	<td>username: </td>
	<td><form:input path="username"/></td>
	</tr>
	<tr>
	<td>password: </td>
	<td><form:input id="p1" path="password"/></td>
	</tr>
	<tr>
	<td>Confirm password: </td>
	<td><form:input id="p2" path="password"/></td>
	</tr>
	<tr align="center">
	<td colspan="2"><input type="submit" value="SUBMIT"/></td>
	</tr>
	</table>
</form:form>


</div>
</body>
</html>