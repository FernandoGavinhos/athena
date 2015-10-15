<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>

<body>

	<c:import url="/WEB-INF/jsp/cabecalho.jsp" />

	<!-- projects -->
	<div class="projects">
		<div class="container">
			<div class="projects-info">
				<h3>Inicia��es Publicadas</h3>
			</div>
			<div class="event-grids">
				<div class="col-md-4 event-grid-sec">
					<div class="event-time text-center">
						<p>07/2015</p>
					</div>
					<div class="event-grid_pic">
						<img src="imagens/moda.jpg" alt="" width="350px" height="191px" />
						<h3>
							<a href="#">T�xtil e Moda</a>
						</h3>
						<p>Moldes automatizados para efici�ncia de etoque e redu��o de
							desperd�cio t�xtil.</p>
						<div class="more">
							<a href="single.html">> Saiba Mais</a>
						</div>
					</div>
				</div>
				<div class="col-md-4 event-grid-sec">
					<div class="event-time text-center">
						<p>08/2015</p>
					</div>
					<div class="event-grid_pic">
						<img src="imagens/medicina.jpg" alt="" width="350px"
							height="191px" />
						<h3>
							<a href="#">Medicina</a>
						</h3>
						<p>A utiliza��o de encefalogramas para reconhecimento
							biom�tico de uma pessoa.</p>
						<div class="more">
							<a href="single.html">> Saiba Mais</a>
						</div>
					</div>
				</div>
				<div class="col-md-4 event-grid-sec">
					<div class="event-time text-center">
						<p>09/2015</p>
					</div>
					<div class="event-grid_pic">
						<img src="imagens/computacao.jpg" alt="" width="350px"
							height="191px" />
						<h3>
							<a href="#">Ci�ncia da Computa��o</a>
						</h3>
						<p>Gera��o de topologias de redes para supercomputadores
							atrav�s de uma an�lise simples de uma equa��o estoc�stica.</p>
						<div class="more">
							<a href="single.html">> Saiba Mais</a>
						</div>
					</div>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>

	<c:import url="/WEB-INF/jsp/rodape.jsp" />

</body>

</html>