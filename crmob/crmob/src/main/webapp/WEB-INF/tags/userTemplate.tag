<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ attribute name="bodyClass" required="false"%>
<%@ attribute name="title" required="true"%>

<!DOCTYPE html>

<head>
<title>CrMob - ${titulo }</title>
<c:url value="/" var="contextPath" />
<c:url value="/resources/css" var="cssPath"></c:url>
<c:url value="/resources/js" var="jsPath"></c:url>
<link rel="stylesheet" href="${cssPath}/tether.min.css">
<link rel="stylesheet" href="${cssPath}/bootstrap.min.css">
<!-- 
<link rel="stylesheet" href="${cssPath}/bootstrap-theme.min.css">
 -->
<link rel="stylesheet" href="${cssPath}/dashboard.css">
<link rel="icon" href="resources/imagens/favicon.ico">

<script src="${jsPath}/jquery.min.js"></script>
<script src="${jsPath}/tether.min.js"></script>
<script src="${jsPath}/bootstrap.js"></script>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />

</head>
<body class="${bodyClass }">


	<div class="container-fluid">
		<%@include file="/WEB-INF/views/headers/userHeader.jsp"%>
		<div class="row">
			<%@include file="/WEB-INF/views/headers/navegacao.jsp"%>
			<main class="col-sm-9 offset-sm-3 col-md-10 offset-md-2 pt-3">
			<jsp:doBody />
			</main>
			<%@include file="/WEB-INF/views/footers/rodape.jsp"%>
		</div>
	</div>
	
	<script>
		$(function() {
			$('#myTab a:first').tab('show')
		})
	</script>

</body>