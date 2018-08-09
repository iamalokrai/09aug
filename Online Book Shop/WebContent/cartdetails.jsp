<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BooksAdda Cart</title>
</head>
<body>
	<div>
		<jsp:include page="header.jsp"></jsp:include>
	</div>
	<div align="center">Welcome to your Cart</div>
	<table align="center" border="1">
		<tr>
			<th>BookId</th>
			<th>Name</th>
			<th>Author</th>
			<th>Price</th>
			<th>Description</th>
		</tr>
		<jstl:forEach var="book" items="${requestScope.book}">
		<tr>
			<td>${book.itemId}</td>
			<td>${book.name}</td>
			<td>${book.author}</td>
			<td>${book.price}</td>
			<td>${book.description}</td>
			</tr>
		</jstl:forEach>
	</table>
</body>
</html>