<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<!DOCTYPE html>
<html>
<head>
<title>CrMob - Seu CRM móvel</title>
<c:url value="/" var="contextPath" />
<c:url value="/resources/css" var="cssPath"></c:url>
<link rel="stylesheet" href="${cssPath}/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<link rel="stylesheet" href="${cssPath}/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />

<style type="text/css">
body {
	padding-top: 60px 0px;
}
</style>
</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="cadastro/usuarios/form">Cadastre-se</a>
			</div>
		</div>
	</nav>
	<div class="container">
		<div>${resultado }</div>
		<h1>Login</h1>
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

