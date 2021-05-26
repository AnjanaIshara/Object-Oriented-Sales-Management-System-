<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
		String userid = request.getParameter("id");
		String username = request.getParameter("name");
		
	%>


<h1>order page</h1>
	<form action="placeorder" method="post">
		User ID <input type="text" name="userid" value="<%= userid %>" readonly><br>
		User Name <input type="text" name="username" name="name" value="<%= username %>" readonly><br>
		Item Name <input type="text" name="itemname" placeholder="Enter item name"><br>
		Quantity <input type="text" name="quantity" placeholder="Enter the quantity of the item"><br>
		Address <input type="text" name="address" placeholder="Enter the delivery address"><br>
		<input type="submit" name="submit" value="order">
		
	</form>
</body>
</html>