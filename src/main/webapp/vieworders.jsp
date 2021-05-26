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
<h1>View orders page</h1>

<form action="vieworders" method="post">
		orderID <input type="text" name="orderid"><br>
				
		<input type="submit" name="submit" value="View OrderDetails">
	</form>



</body>
</html>