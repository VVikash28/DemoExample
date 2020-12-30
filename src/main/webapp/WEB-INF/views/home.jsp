<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
<style type="text/css">
	label, input, span, select {
		display: table-cell;
		margin: 5px;
		text-align: left;		
	}
	button {
		padding: 7px;
		margin: 10px;
	}
	form div {
		display: table-row;
	}
	input[type=text], input[type=password], select, textarea{
		width: 200px;
		margin: 5px;
	} 	
	form div div{
		display: table-cell;
	}
	.error{
		color: red;
		font-style: italic;
	}
</style>
</head>
<body>
	<div align="center">
	<h1>Student Registration Form</h1>
	<form:form action="register" method="post" modelAttribute="student">
		<div>
		<form:label path="name">Full Name:</form:label>
		<form:input path="name"/>
		<form:errors path="name" cssClass="error" />
		</div>
		
		<div>
		<form:label path="email">E-mail:</form:label>
		<form:input path="email"/>
		<form:errors path="email" cssClass="error" />
		</div>
		
		<div>
		<form:label path="dob">Birthday:</form:label>
		<form:input type="date" path="dob"/>
		<form:errors path="dob" cssClass="error" />
		</div>
		
		<div>
		<form:label path="phone">Phone No:</form:label>
		<form:input path="phone"/>
		<form:errors path="phone" cssClass="error" />
		</div>
		
		<div>
		<form:label path="zipcode">Zip Code:</form:label>
		<form:input path="zipcode"/>
		<form:errors path="zipcode" cssClass="error" />
		</div>
		
		<form:button>Register</form:button>
	</form:form>
	</div>
</body>
</html>