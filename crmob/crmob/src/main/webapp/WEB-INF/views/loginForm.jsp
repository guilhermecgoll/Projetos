<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta charset=ISO-8859-1">
<title>CrMob</title>
<c:url value="/resources/css" var="cssPath"></c:url>
<link rel="stylesheet" href="${cssPath}/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<link rel="stylesheet" href="${cssPath}/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">
<style type="text/css">
body {
	padding-top: 60px 0px;
}
</style>
</head>
<body>
	<nav class="categories-nav">
		<ul class="container">
			<li class="category"><a href="cadastro/pessoas/form">Cadastre-se</a></li>
		</ul>
	</nav>
	<div class="container">
		<h1>Login</h1>
		<!-- Com a taglib do Spring, é possível chamar o controler através das iniciais da classe mapeada.
PC = ProdutosController # método "gravar" -->
		<form:form servletRelativeAction="/login" method="POST">
			<div class="form-group">
				<label>E-mail</label> <input name="username" type="text"
					class="form-control" />
			</div>
			<div class="form-group">
				<label>Senha</label> <input name="password" type="password"
					class="form-control" />
			</div>
			<button type="submit" class="btn btn-primary">Entrar</button>
		</form:form>
	</div>

</body>
</html>