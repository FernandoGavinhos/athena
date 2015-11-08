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

	var currentValue = 0;
	function handleClick(myRadios) {
		//alert('Old value: ' + currentValue);
		//alert('New value: ' + myRadios.value);
		//currentValue = myRadio.value;
		if (myRadios.value == "aluno") {
			alert("oi");
			document.getElementById("usuario").className = "showhidediv_hide";
			document.getElementById("senha").className = "showhidediv_show";
		} else {
			alert("tchau");
			document.getElementById("senha").className = "showhidediv_hide";
			document.getElementById("usuario").className = "showhidediv_show";
		}
	}
</script>
<!--script-->
</head>
<body>

	<c:import url="/WEB-INF/jsp/cabecalho.jsp" />
	<div class="single">
		<div class="container">
			<!-- projects -->
			<div class="coment-form">
				<h3 class="prjt">Informações do Projeto</h3>

				<form name="formIc" action="mvc?do=CadastrarICController" method="POST">
					<p>Título:</p>
					<input type="text" id="titulo" required="true" />
					<p>Duração (Meses):</p>
					<input type="number" id="duracao" required="true" />
					<p>Curso:</p>
					<select id="curso" text="Selecione">
						<option value="si">Sistemas de Informação</option>
						<option value="mkt">Marketing</option>
						<option value="gpp">Gestão de Políticas Públicas</option>
						<option value="lzt">Lazer e Turismo</option>
					</select>
					<p>Descrição:</p>
					<textarea id="descricao" rows="5" cols="100"> </textarea>
					<p>${erro}</p>
					<input type="submit" value="Cadastrar">
				</form>
			</div>
		</div>
	</div>

	<c:import url="/WEB-INF/jsp/rodape.jsp" />
</body>

</html>