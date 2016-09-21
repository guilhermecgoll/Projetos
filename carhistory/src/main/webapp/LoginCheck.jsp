<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MinhasFinanças - Login</title>
</head>
<body>
	<%
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		//TODO chamar o método de autenticação
		if ((username.equals("admin") && password.equals("admin"))) {
			session.setAttribute("username", username);
			response.sendRedirect("Home.jsp");
		} else
			response.sendRedirect("ErrorPage500.jsp");
	%>
</body>


</html>