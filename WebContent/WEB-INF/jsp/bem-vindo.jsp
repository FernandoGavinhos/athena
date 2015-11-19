<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>

<body>

	<c:import url="/WEB-INF/jsp/cabecalho.jsp" />
	<div class="container">
		<div class="our_blog">
			<h3>Seja bem vindo ${papel} ${login}!</h3>
			<h4>Projetos Recentes</h4>
			 <br>
			<br>
			<div class="blog-section">
				<div class="col-md-4 elite-grid">
					<img src="imagens/pc.jpg" alt="" />
					<h4>
						<a href="#">Arquitetura</a>
					</h4>
					<p>Tema: "Relação entre cores e vendas de projetos de Arquitetura.".</p>
				</div>

				<div class="clearfix"></div>
			</div>
		</div>
	</div>


	<c:import url="/WEB-INF/jsp/rodape.jsp" />

</body>

</html>