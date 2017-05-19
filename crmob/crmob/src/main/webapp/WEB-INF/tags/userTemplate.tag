<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ attribute name="bodyClass" required="false"%>
<%@ attribute name="titulo" required="true"%>

<!DOCTYPE html>

<head>
<title>CrMob - ${titulo }</title>
<c:url value="/" var="contextPath" />
<c:url value="/resources/css" var="cssPath"></c:url>
<c:url value="/resources/js" var="jsPath"></c:url>
<link rel="stylesheet" href="${cssPath}/bootstrap.min.css">
<link rel="stylesheet" href="${cssPath}/bootstrap-theme.min.css">
<link rel="stylesheet" href="${cssPath}/dashboard.css" >
<link rel="icon" href="/resources/imagens/favicon.ico">
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />

</head>
<body class="${bodyClass }">


	<div class="container-fluid">
	<%@include file="/WEB-INF/views/headers/userHeader.jsp" %>
		<div class="row">
			<%@include file="/WEB-INF/views/headers/navegacao.jsp"%>
			<main class="col-sm-9 offset-sm-3 col-md-10 offset-md-2 pt-3">
				<jsp:doBody />
			</main>
			<%@include file="/WEB-INF/views/footers/rodape.jsp"%>
		</div>
	</div>
	
	<script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
    <script>window.jQuery || document.write('<script src="${jsPath}/jquery.min.js"><\/script>')</script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
    <script src="${jsPath}/bootstrap.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="${jsPath}/ie10-viewport-bug-workaround.js"></script>

</body>