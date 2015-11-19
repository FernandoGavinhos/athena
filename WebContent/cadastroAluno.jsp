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
</script>
<!--script-->
</head>
<body>

	<c:import url="/WEB-INF/jsp/cabecalho.jsp" />
	<div class="single">
		<div class="container">
			<!-- projects -->
			<div class="coment-form">
				<h3 class="prjt">Cadastro de Aluno</h3>
				<form action="mvc?do=AdicionaAlunoController" method="POST">
					<p>Nome:</p>
					<input type="text" name="nome" required="true">
					<p>NUsp:</p>
					<input type="text" name="nusp" required="true">
					<p>E-mail:</p>
					<input type="text" name="email" required="true">
					<p>Curso:</p>
					<input type="text" name="curso" required="true">
					<p>Sexo:</p>
					<input type="text" name="sexo" required="true">
					<p>Data de nascimento:</p>
					<input type="text" name="dt_nasc" required="true">
					<p>Telefone:</p>
					<input type="text" name="telefone" required="true">
					<p>Celular:</p>
					<input type="text" name="celular" required="true">
					<p>Curriculo:</p>
					<input type="text" name="curriculo" required="true">
					<p>Ano formação:</p>
					<input type="text" name="ano_formacao" required="true">
					<p>Interesse em pesquisa:</p>
					<input type="text" name="pesquisa" required="true">
					<p>Senha:</p>
					<input type="password" name="senha" required="true">
					<p>Confirmar senha:</p>
					<input type="password" name="confsenha" required="true">
					<br>
					<p>${erro}</p>
					<input type="submit" value="Cadastrar">
				</form>
			</div>
		</div>
	</div>

	<c:import url="/WEB-INF/jsp/rodape.jsp" />
</body>

</html>