<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta charset=ISO-8859-1">
<title>Cadastro de pessoas</title>
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
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
				aria-expanded="false">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="${s:mvcUrl('HC#index').build() }">Casa
				do Código</a>
		</div>
		
	</div>
	</nav>
	<div class="container">
		<!-- Com a taglib do Spring, é possível chamar o controle através das iniciais da classe mapeada.
PC = ProdutosController # método "gravar" -->
		<form:form action="${s:mvcUrl('CC#gravar').build() }" method="POST"
			commandName="pessoa" enctype="multipart/form-data">
			<div class="form-group">
				<label>Nome Completo</label>
				<form:input path="nomeCompleto" cssClass="form-control" />
				<!-- O form:input permite que os valores digitados no formulário sejam mantidos caso haja qualquer erro de bind -->
				<form:errors path="nomeCompleto" />
			</div>
			<div class="form-group">
				<label>Nome Reduzido (apelido)</label>
				<form:textarea path="nomeResumido" cssClass="form-control" />
				<form:errors path="nomeResumido" />
			</div>
			<div class="form-group">
				<label>Endereço</label>
				<form:input path="endereco" cssClass="form-control" />
				<form:errors path="endereco" />
			</div>
			<div class="form-group">
				<label>CEP</label>
				<form:input path="Cep" cssClass="form-control" />
				<form:errors path="Cep" />
			</div>
			<div class="form-group">
				<label>Telefone (1)</label>
				<form:input path="telefone1" cssClass="form-control" />
				<form:errors path="telefone1" />
			</div>
			<div class="form-group">
				<label>Telefone (2)</label>
				<form:input path="telefone2" cssClass="form-control" />
				<form:errors path="telefone2" />
			</div>
			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form:form>
	</div>

</body>
</html>