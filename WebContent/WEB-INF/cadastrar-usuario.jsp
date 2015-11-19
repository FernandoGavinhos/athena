<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary JavaScript plugins) -->
<script src="js/bootstrap.js"></script>
<!-- Custom Theme files -->
<link href="css/style.css" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Flooring  Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript">
	
	
	
	
	
	
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 






</script>

<script src="js/jquery.min.js"></script>
<!--/animated-css-->
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
<!--/script-->
<script type="text/javascript">
	jQuery(document).ready(function($) {
		$(".scroll").click(function(event) {
			event.preventDefault();
			$('html,body').animate({
				scrollTop : $(this.hash).offset().top
			}, 900);
		});
	});

	function exibeForms(objOn, objOff) {
		objOn.style.display = "block";
		objOff.style.display = "none";
	}
</script>
<!--script-->
</head>
<body>

	<c:import url="/WEB-INF/pages/index/cabecalho.jsp" />
	<div class="single">
		<div class="container">
			<!-- projects -->
			<div class="coment-form">
				<h3 class="prjt">Cadastrar como:</h3>

				<a href="javascript:void(0);"
					onclick="return exibeForms(divProfessor,divAluno);">Professor</a> |
				<a href="javascript:void(0);"
					onclick="return exibeForms(divAluno,divProfessor);">Aluno</a>

				<div id="divProfessor" style="display: none">

					<h2 class="prjt">Professor</h2>

					<form name="formProfessor" action="cadastrarProfessor"
						method="post">
						<input type="hidden" name="papel" value="Professor">
						<p>Número USP:</p>
						<input type="text" id="nUsp" name="nUsp"required="true" />
						<p>Nome:</p>
						<input type="text" id="nome" name="nome" required="true" />
						<p>Sexo:</p>
						<select id="sexo" name="sexo" text="Selecione">
							<option value="M">Masculino</option>
							<option value="F">Feminino</option>
						</select>
						<p>e-mail:</p>
						<input type="text" id="email" name="email" required="true" />
						<p>Data de Nascimento</p>
						<input type="text" id="dtNasc" name="dtNasc" required="false" />
						<p>Telefone:</p>
						<input type="text" id="telefone" name="telefone" required="true" />
						<p>Celular:</p>
						<input type="text" id="celular" name="celular" required="true" />
						<p>Link currículo Lattes:</p>
						<input type="text" id="curriculoLattes"  name="curriculoLattes" required="false" />
						<p>Senha:</p>
						<input type="text" id="senha" name="senha" required="true" />
						<p>Curso que ministra:</p>
						<input type="text" id="cursoMinistra" name="cursoMinistra" required="true" />
						<p>Linha de pesquisa:</p>
						<input type="text" id="linhaPesquisa" name="linhaPesquisa" required="true" />
						<p>${erro}</p>
						<input type="submit" value="Cadastrar">
					</form>
				</div>

				<div id="divAluno" style="display: none">

					<h2 class="prjt">Aluno</h2>

					<form name="formProfessor" action="cadastrarAluno" method="post">
						<input type="hidden" name="papel" value="Aluno">
						<p>Número USP:</p>
						<input type="text" id="nUsp" name="nUsp"required="true" />
						<p>Nome:</p>
						<input type="text" id="nome" name="nome" required="true" />
						<p>Sexo:</p>
						<select id="sexo" name="sexo" text="Selecione">
							<option value="M">Masculino</option>
							<option value="F">Feminino</option>
						</select>
						<p>e-mail:</p>
						<input type="text" id="email" name="email" required="true" />
						<p>Data de Nascimento</p>
						<input type="text" id="dtNasc" name="dtNasc" required="false" />
						<p>Telefone:</p>
						<input type="text" id="telefone" name="telefone" required="true" />
						<p>Celular:</p>
						<input type="text" id="celular" name="celular" required="true" />
						<p>Link currículo Lattes:</p>
						<input type="text" id="curriculoLattes"  name="curriculoLattes" required="false" />
						<p>Senha:</p>
						<input type="text" id="senha" name="senha" required="true" />
						<p>Curso:</p>
						<input type="text" id="curso" name="curso" required="true" />
						<p>Ano previsto para formação:</p>
						<input type="text" id="anoPrevFormacao" name="anoPrevFormacao" required="true" />
						<p>Áreas de interesse (separadas por ";"):</p>
						<textarea id="interesesPequisa" name="interesesPequisa" rows="5" cols="100"> </textarea>
						<p>${erro}</p>
						<input type="submit" value="Cadastrar">
					</form>
				</div>
			</div>
		</div>
	</div>

	<c:import url="/WEB-INF/pages/index/rodape.jsp" />
</body>

</html>