<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ButtonClicker</title>
</head>
<body>
ButtonClicker
	<!--<c:out value="${someAttribute}"/> -->
	<a href="ShowCounter">Click Me!</a>
	<h1>You clicked</h1>
	<c:out value="${counter}"/>
	<c:out value="${h}"/>
</body>
</html>