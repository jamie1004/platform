<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CTI site</title>
</head>
<body>
	<h1>CTI site</h1>
	<h2>${message}</h2>

	<form action="/logout" method="post">
		<input value="Logout" type="submit">
	</form>
</body>
</html>