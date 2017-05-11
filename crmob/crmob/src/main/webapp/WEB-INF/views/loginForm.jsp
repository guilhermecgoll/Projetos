<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="tags"%>

<tags:pageTemplate titulo="Entre">
	<div class="container">
		<div>${resultado }</div>
		<h1>Login</h1>
		<form:form servletRelativeAction="/login" method="POST">
			<div class="form-group">
				<label>E-mail</label>
				<input name="username" type="email" class="form-control" />
			</div>
			<div class="form-group">
				<label>Senha</label>
				<input name="password" type="password" class="form-control" />
			</div>
			<button type="submit" class="btn btn-primary">Entrar</button>
		</form:form>
	</div>
</tags:pageTemplate>

