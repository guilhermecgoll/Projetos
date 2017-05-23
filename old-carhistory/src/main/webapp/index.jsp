<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CarHistory - Login</title>
</head>
<body>
	<div>
	<h2>Autenticação</h2>
	<form action="Login" method="post">
		<br /> Login:<input type="email" name="username"> <br />
		Senha:<input type="password" name="password"> <br />
		<input type="submit" value="Entrar">
	</form>
	</div>
	<div>
	<h2>Novo Cadastro</h2>
	<form action="NovoCadastro" method="post">
		Nome:<input type="text" name="firstname"><br>
		Sobrenome:<input type="text" name="lastname"><br>
		E-mail:<input type="email" name="email"><br>
		Senha:<input type="password" name="password"><br>
		<button type="submit" value="NovoCadastro">Cadastrar-se</button>
	</form>
	</div>
	
	
</body>
</html>