<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MinhasFinanças - Logout</title>
</head>
<body>
	<%
		session.removeAttribute("username");
		session.removeAttribute("password");
		session.invalidate();
	%>
	<h1>Logout realizado com sucesso.</h1>
</body>
</html>