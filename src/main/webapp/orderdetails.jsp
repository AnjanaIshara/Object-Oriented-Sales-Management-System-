<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Order details page</h1>


<table>
	<c:forEach var="cus" items="${cusDetails}">
	
	
	
	<tr>
		<td>Order ID</td>
		<td>${cus.id}</td>
	</tr>
	<tr>
		<td>User id</td>
		<td>${cus.userid}</td>
	</tr>
	<tr>
		<td>Item Name</td>
		<td>${cus.itemname}</td>
	</tr>
	<tr>
		<td>Quantity</td>
		<td>${cus.quantity}</td>
	</tr>
	<tr>
		<td>Address</td>
		<td>${cus.address}</td>
	</tr>
	<tr>
		<td>Price</td>
		<td>${cus.price}</td>
	</tr>

	</c:forEach>
	</table>
	
	
	
</body>
</html>