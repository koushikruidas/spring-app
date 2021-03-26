<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
.error {
	color: red;
}
</style>
<title>Customer Registration Form</title>
</head>
<body>
	<form:form action="customerConfirmation"
		modelAttribute="customerRegistrationModel">
		First Name(*): <form:input path="firstName" />
		<form:errors path="firstName" cssClass="error"></form:errors>
		<br>
		<br>
		Last Name: <form:input path="lastName" />
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>