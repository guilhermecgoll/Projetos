<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="tags"%>

<tags:pageTemplate titulo="Novo usuário">

	<div class="container">
	<h1>Cadastre-se</h1>
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
</tags:pageTemplate>