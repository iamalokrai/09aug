<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<jsp:include page="header.jsp"></jsp:include>
	</div>
	<div>
<a href="cartdetails.app">Cart Details</a>
</div>
	<table border="1" align="center" >
		<tr>
			<th>Book</th>
			<th>Name</th>
			<th>Author</th>
			<th>Price</th>
			<th>Description</th>
		</tr>
		<jstl:forEach var="books" items="${requestScope.books}">
			<tr>
				<td>${books.itemId}</td>
				<td>${books.name}</td>
				<td>${books.author}</td>
				<td>${books.price}</td>
				<td>${books.description}</td>
				<td><a href="addToCart.app?itemId=${books.itemId }">Add to Cart</a>
			</tr>
		</jstl:forEach>
	</table>

</body>
</html>
