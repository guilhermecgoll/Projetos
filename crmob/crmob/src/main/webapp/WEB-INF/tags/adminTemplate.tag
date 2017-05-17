<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ attribute name="bodyClass" required="false"%>
<%@ attribute name="titulo" required="true"%>

<!DOCTYPE html>

<head>
<title>CrMob - ${titulo }</title>
<c:url value="/" var="contextPath" />
<c:url value="/resources/css" var="cssPath"></c:url>
<link rel="stylesheet" href="${cssPath}/bootstrap.min.css" >
<link rel="stylesheet" href="${cssPath}/bootstrap-theme.min.css" >
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />

<style type="text/css">
body {
	padding-top: 60px 0px;
}
</style>
</head>
<body class="${bodyClass }">

	<%@include file="/WEB-INF/views/cabecalho.jsp"%>

	<jsp:doBody />

	<%@include file="/WEB-INF/views/rodape.jsp"%>

</body>