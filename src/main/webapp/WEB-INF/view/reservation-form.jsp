<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation Page</title>
</head>
<body>
	<form:form action="reservationConfirmation" modelAttribute="reservationModel">
		First Name: <form:input path="firstName"/>
		Last Name: <form:input path="lastName"/>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>