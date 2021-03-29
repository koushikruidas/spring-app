<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation Page</title>
<style type="text/css">
	.error {
		color:red;
	}
</style>
</head>
<body>
	<form:form action="reservationConfirmation" modelAttribute="reservationModel">
		First Name: <form:input path="firstName"/>
		Last Name: <form:input path="lastName"/>
		<br><br>
		On Boarding Station: <form:select path="onBoard">
			<form:option label="HWH" value="Howrah" />
			<form:option label="DGR" value="Durgapur" />
			<form:option label="BDC" value="Bandel" />
			<form:option label="LUA" value="Lilua" />
			<form:option label="BWN" value="Bardhhaman" />
			<form:option label="KAL" value="Kalani" />
			<form:option label="BAN" value="Bankura" />
		</form:select><br><br>
		Destination Station: <form:select path="destination">
			<form:option label="HWH" value="Howrah" />
			<form:option label="DGR" value="Durgapur" />
			<form:option label="BDC" value="Bandel" />
			<form:option label="LUA" value="Lilua" />
			<form:option label="BWN" value="Bardhhaman" />
			<form:option label="KAL" value="Kalani" />
			<form:option label="BAN" value="Bankura" />
		</form:select>
		<br><br>
		Number of Passengers:
		<form:input path="numberOfSeat" placeholder="Enter number of passenger"/>
		<form:errors path="numberOfSeat" cssClass="error"></form:errors>
		<br><br>
		Seating Arrangement:
		
		Window <form:radiobutton path="seatPosition" value="Window"/>
		Middle <form:radiobutton path="seatPosition" value="Middle"/>
		Asile <form:radiobutton path="seatPosition" value="Asile"/>
		<br><br>
		Gender: 
		Male <form:checkbox path="gender" value="male" />
		Female <form:checkbox path="gender" value="female" />
		<br><br>
		Pan Card Number:
		<form:input path="panNumber"/>
		<form:errors path="panNumber" cssClass="error"/>
		<br><br>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>