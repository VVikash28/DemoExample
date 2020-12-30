<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Success</title>
<style type="text/css">
	span {
		display: inline-block;
		width: 200px;
		text-align: left;
	}
</style>
</head>
<body>
	<div align="center">
		<h2>Registration Succeeded!</h2>
		<span>Full Name:</span><span>${student.name}</span><br/>
		<span>E-mail:</span><span>${student.email}</span><br/>
		<span>Birthday:</span><span>${student.dob}</span><br/>
		<span>Phone No:</span><span>${student.phone}</span><br/>
		<span>Zip Code:</span><span>${student.zipcode}</span><br/>
	</div>
</body>
</html>