<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta charset=ISO-8859-1">
<title>CrMob - Novo usuário</title>
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

	<nav class="navbar navbar-inverse">
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand" href="${s:mvcUrl('HC#index').build() }">Home</a>
		</div>
	</div>
	</nav>

	<div class="container">
		<!-- Com a taglib do Spring, é possível chamar o controle através das iniciais da classe mapeada.
PC = ProdutosController # método "gravar" -->
		<form:form action="${s:mvcUrl('UC#gravar').build() }" method="POST"
			commandName="usuario" enctype="multipart/form-data">
			<div class="form-group">
				<label>Login</label>
				<form:input path="username" type="email" cssClass="form-control" />
				<form:errors path="username" />
			</div>
			<div class="form-group">
				<label>Senha</label>
				<form:input path="password" type="password" cssClass="form-control" />
				<form:errors path="password" />
			</div>
			<div class="form-group">
				<label>Nome Completo</label>
				<form:input path="pessoa.nomeCompleto" cssClass="form-control" />
				<!-- O form:input permite que os valores digitados no formulário sejam mantidos caso haja qualquer erro de bind -->
				<form:errors path="pessoa.nomeCompleto" />
			</div>
			<div class="form-group">
				<label>Nome Reduzido (apelido)</label>
				<form:input path="pessoa.nomeResumido" cssClass="form-control" />
				<form:errors path="pessoa.nomeResumido" />
			</div>
			<div class="form-group">
				<label>CPF/ CNPJ</label>
				<form:input path="pessoa.cpfCnpj" cssClass="form-control" />
				<form:errors path="pessoa.cpfCnpj" />
			</div>
			<div class="form-group">
				<label>Endereço</label>
				<form:input path="pessoa.endereco" cssClass="form-control" />
				<form:errors path="pessoa.endereco" />
			</div>
			<div class="form-group">
				<label>CEP</label>
				<form:input path="pessoa.Cep" cssClass="form-control" />
				<form:errors path="pessoa.Cep" />
			</div>
			<div class="form-group">
				<label>Telefone (1)</label>
				<form:input path="pessoa.telefone1" cssClass="form-control" />
				<form:errors path="pessoa.telefone1" />
			</div>
			<div class="form-group">
				<label>Telefone (2)</label>
				<form:input path="pessoa.telefone2" cssClass="form-control" />
				<form:errors path="pessoa.telefone2" />
			</div>
			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form:form>
	</div>

</body>
</html>