<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student List</title>
</head>
<body>

<h1>Students List</h1>
	<table border="2" >
		<tr>
			<th>Student Id</th>
			<th>Stduent Name</th>
			<th>Student Age</th>
			<th>Student phno</th>
		</tr>
	<c:forEach  var="student" items="${list}">
		<tr>
			<td>${student.studId}</td>
			<td>${student.studName}</td>
			<td>${student.studAge}</td>
			<td>${student.studphone}</td>
		</tr>
</c:forEach>
	
	</table>
</body>
</html>