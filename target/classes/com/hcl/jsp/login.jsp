<html>
<body>
	<form action="./Login">
		User Name : <input type="text" name="username" /> Password : <input
		type="password" name="password" /> <input type="submit" value="Login" />
	</form>
	
	<%int number = 5;%>
	
	<%="Declaration tag" %>
	
	<%
		number = number + 10;
		out.println("The value of the number is " + number);
		session.setAttribute("k1", number);
	%>
	
</body>
</html>