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
	/*function handleClick(myRadios) {
	    if(myRadios.value == "aluno"){
		    alert("oi");
		    document.getElementById("usuario").className="showhidediv_hide";
	        document.getElementById("senha").className="showhidediv_show";
		}
	    else{
		    alert("tchau");
		    document.getElementById("senha").className="showhidediv_hide";
	        document.getElementById("usuario").className="showhidediv_show";
		}
	}*/
</script>
<!--script-->
</head>
<body>

	<c:import url="/WEB-INF/jsp/cabecalho.jsp" />
	<div class="single">
		<div class="container">
			<!-- projects -->
			<div class="coment-form">
				<h3 class="prjt">Cadastrar como:</h3>
				
				<p> <a href="cadastrar_professor.jsp">Professor</a> </p>
				<p> <a href="cadastrar_aluno.jsp">Aluno</a> </p>
				
				<!-- 
				
				<input type="radio" name="myRadios" onclick="handleClick(this);" value="aluno" /> Aluno
				<input type="radio" name="myRadios" onclick="handleClick(this);" value="professor" /> Professor
				
				<form name="formClie" action="mvc?do=LoginController" method="POST">
					<p>Usuário:</p>
					<input type="text" id="usuario" required="true">
					<p>Senha:</p>
					<input type="password" id="senha" required="true"> <br>
					<br>
					<p>${erro}</p>
					<input type="submit" value="Entrar">
				</form>
				
				-->
			</div>
		</div>
	</div>

	<c:import url="/WEB-INF/jsp/rodape.jsp" />
</body>

</html>