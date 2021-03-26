<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Form</title>
</head>
<body>
	<form action="processFormV2" method="GET">
		<input type="text" name="studentName" placeholder="What is your name" />
		<input type="email" name="email" placeholder="Enter email address" />
		<button>Submit</button>
		<!-- <button onClick="location.href='/capitalize'">Enter to capitalize your name</button> -->
	</form>
</body>
</html>