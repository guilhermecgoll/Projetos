<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<header>
	<nav class="navbar navbar-inverse">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="${s:mvcUrl('HC#index').build() }">Home</a>
				<a class="navbar-brand" href="${s:mvcUrl('LC#loginForm').build() }">Entre</a>
				<a class="navbar-brand" href="${s:mvcUrl('UC#form').build() }">Cadastre-se</a>
				<a class="navbar-brand" href="${s:mvcUrl('IC#paraVoce').build() }">Para você</a>
				<a class="navbar-brand" href="${s:mvcUrl('IC#paraEmpresa').build() }">Para sua empresa</a>
				<a class="navbar-brand" href="${s:mvcUrl('IC#sobreNos').build() }">Sobre nós</a>
			</div>
		</div>
	</nav>
</header>