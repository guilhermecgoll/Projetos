<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<header>
	<nav class="navbar navbar-inverse">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="${s:mvcUrl('HC#index').build() }">Home</a>
				<a class="navbar-brand" href="${s:mvcUrl('LC#loginForm').build() }">Entre</a>
				<a class="navbar-brand" href="${s:mvcUrl('UC#form').build() }">Cadastre-se</a>
				<a class="navbar-brand" href="${s:mvcUrl('IC#paraVoce').build() }">Para você</a>
				<a class="navbar-brand" href="${s:mvcUrl('IC#paraEmpresa').build() }">Para sua empresa</a>
				<sec:authorize access="hasRole('EXTERNAL')">
					<a class="navbar-brand" href="${s:mvcUrl('IC#sobreNos').build() }">Sobre nós</a>
				</sec:authorize>
				<sec:authorize access="hasRole('ADMIN')">
					<a class="navbar-brand" href="${s:mvcUrl('IC#configuracoes').build() }">Configurações</a>
				</sec:authorize>
			</div>
		</div>
	</nav>
</header>