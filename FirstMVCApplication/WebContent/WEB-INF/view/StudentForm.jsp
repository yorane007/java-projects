<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Student form</title>
	<form:form action = "processForm" modelAttribute = "student">
		<form:input path="firstName" />
		<br><br>
		<form:input path="lastName" />
		<input type="submit" value="submit"/>
		
	</form:form>
</head>
<body>
	

</body>
</html>