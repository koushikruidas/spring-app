<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation Confirmation</title>
</head>
<body>
	<p>Your reservation is confirmed successfully. Please, re-check the
		details.</p>
	First Name: ${reservationModel.firstName}
	<br> Last Name: ${reservationModel.lastName}
	<br> On Boarding Station: ${reservationModel.onBoard} Destination:
	${reservationModel.destination }
	<br>
	Seating Position: ${reservationModel.seatPosition }
	<br>
	List of Genders:
	<ul>
		<c:forEach var="temp" items="${reservationModel.gender }">
			<li>${temp}</li>
		</c:forEach>
	</ul>

</body>
</html>