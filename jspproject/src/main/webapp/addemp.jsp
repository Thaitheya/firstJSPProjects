<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add new emp</title>
</head>
<body>
	<form action="AddEmployee" method="post">
		<div>
			<label for="name">Name: </label> <input id="name" type="text"
				placeholder="Enter-name">
		</div>
		<div>
			<label for="city">City: </label> <input id="city" type="text"
				placeholder="Enter-name">
		</div>
		<div>
			<label for="salary">Salary: </label> <input id="salary" type="number"
				placeholder="Enter-salary">
		</div>
		<div>
		<input id="submit" type="submit" value="AddEmployee"
				placeholder="submit">
		
		</div>
	</form>
</body>
</html>