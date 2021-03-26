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
		Seating Arrangement:
		
		Window <form:radiobutton path="seatPosition" value="Window"/>
		Middle <form:radiobutton path="seatPosition" value="Middle"/>
		Asile <form:radiobutton path="seatPosition" value="Asile"/>
		<br><br>
		<input type="submit" label="Submit" />
	</form:form>
</body>
</html>