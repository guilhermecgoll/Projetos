<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<nav class="col-sm-3 col-md-2 hidden-xs-down bg-faded sidebar">
	<ul class="nav nav-pills flex-column" role="tablist" id="myTab">
		<li role="presentation" class="nav-item">
			<a class="nav-link active" href="${s:mvcUrl('HC#userHome').build() }" data-target="#home" data-toggle="pill">Overview</a>
		</li>
		<li role="presentation" class="nav-item">
			<a class="nav-link" href="${s:mvcUrl('MCC#dashboard').build() }" data-target="#customers" data-toggle="pill">Clientes</a>
		</li>
		<li role="presentation" class="nav-item">
			<a class="nav-link" href="${s:mvcUrl('MPC#index').build() }" data-target="#products"  data-toggle="pill">Produtos</a></li>
		<li role="presentation" class="nav-item">
			<a class="nav-link" href="#" data-target="#" data-toggle="pill">Agenda</a>
		</li>
	</ul>
</nav>