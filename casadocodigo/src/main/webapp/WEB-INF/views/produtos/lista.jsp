<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Livros de Java, Android, iOS, Ruby, PHP e muito mais - Casa do Código</title>
</head>
	<body>
	
		<h1>Lista de Produtos</h1>
		
		<div>${sucesso }</div>
	
		<table>
			<tr>
				<td>Título</td>
				<td>Descrição</td>
				<td>Páginas</td>
			</tr>
			<c:forEach items="${produtos }" var="produto" varStatus="status">
				<tr>
					<td>${produto.titulo }</td>
					<td>${produto.descricao }</td>
					<td>${produto.paginas }</td>
				</tr>
			</c:forEach>
		</table>
	
	</body>
</html>