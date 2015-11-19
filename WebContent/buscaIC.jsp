<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="br.com.athena.objetos.IniciacaoCientifica"%>
<%@page import="br.com.athena.dao.IniciacaoDao"%>
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
				<h3 class="prjt">Lista de Inicia��o Cientifica</h3>
				<form action="mvc?do=BuscaICController" method="POST">
					<input type="text" name="paramBusca" required="true"> <input
						type="submit" value="Buscar">
				</form>
				<table class="table">
					<tr>
						<td>C�d. IC</td>
						<td>Descri��o IC</td>
						<td>Dura��o IC</td>
						<td>Cursos</td>
						<td>Nome do professor</td>
						<td>A��o</td>
					</tr>

					<%
						String login = (String) session.getAttribute("login");
						String papel = (String) session.getAttribute("papel");
						Boolean ehAluno = (Boolean) session.getAttribute("ehAluno");
						String paramBusca = (String) request.getAttribute("paramBusca");

						if (papel != null && !ehAluno) {

							IniciacaoDao dao = new IniciacaoDao();
							List<IniciacaoCientifica> ics = dao.listarICs();

							List<IniciacaoCientifica> listaRetorno = new ArrayList<IniciacaoCientifica>();

							if (paramBusca != null) {
								for (IniciacaoCientifica iniciacaoCientifica : listaRetorno) {
									if (String.valueOf(iniciacaoCientifica.getCodIC()).equalsIgnoreCase(paramBusca)
											|| iniciacaoCientifica.getCursos().toLowerCase().contains(paramBusca.toLowerCase())
											|| iniciacaoCientifica.getDescricao().toLowerCase().contains(paramBusca.toLowerCase())
											|| iniciacaoCientifica.getDuracao().toLowerCase().contains(paramBusca.toLowerCase())
											|| iniciacaoCientifica.getNomeIC().toLowerCase().contains(paramBusca.toLowerCase())
											|| iniciacaoCientifica.getProfessor().getNome().toLowerCase()
													.contains(paramBusca.toLowerCase())
													&& iniciacaoCientifica.getProfessor().getNome().toLowerCase().equals(login)) {
										listaRetorno.add(iniciacaoCientifica);
									}
								}

								if (listaRetorno.isEmpty()) {
									request.setAttribute("erro", "Nenhuma IC encontrada!");
								}
							} else {
								listaRetorno = ics;
								for (IniciacaoCientifica ic : listaRetorno) {
									request.setAttribute("ic", ic.getCodIC());
					%>
					<tr>
						<td><%=ic.getCodIC()%></td>
						<td><%=ic.getDescricao()%></td>
						<td><%=ic.getDuracao()%></td>
						<td><%=ic.getCursos()%></td>
						<td><%=ic.getProfessor().getNome()%></td>
						<td><a href="removerIC.jsp">Remover</a></td>
					</tr>
					<%
						}
							}
						} else if (papel != null) {

							IniciacaoDao dao = new IniciacaoDao();
							List<IniciacaoCientifica> ics = dao.listarICs();

							List<IniciacaoCientifica> listaRetorno = new ArrayList<IniciacaoCientifica>();

							if (paramBusca != null) {
								for (IniciacaoCientifica iniciacaoCientifica : ics) {
									if (String.valueOf(iniciacaoCientifica.getCodIC()).equalsIgnoreCase(paramBusca)
											|| iniciacaoCientifica.getCursos().toLowerCase().contains(paramBusca.toLowerCase())
											|| iniciacaoCientifica.getDescricao().toLowerCase().contains(paramBusca.toLowerCase())
											|| iniciacaoCientifica.getDuracao().toLowerCase().contains(paramBusca.toLowerCase())
											|| iniciacaoCientifica.getNomeIC().toLowerCase().contains(paramBusca.toLowerCase())
											|| iniciacaoCientifica.getProfessor().getNome().toLowerCase()
													.contains(paramBusca.toLowerCase())) {
										listaRetorno.add(iniciacaoCientifica);
									}
								}

								if (listaRetorno.isEmpty()) {
									request.setAttribute("erro", "Nenhuma IC encontrada!");
								}
							} else {
								listaRetorno = ics;
								for (IniciacaoCientifica ic : listaRetorno) {
					%>
					<tr>
						<td><%=ic.getCodIC()%></td>
						<td><%=ic.getDescricao()%></td>
						<td><%=ic.getDuracao()%></td>
						<td><%=ic.getCursos()%></td>
						<td><%=ic.getProfessor().getNome()%></td>
						<td><a href="inscreverIC.jsp">Inscrever</a></td>
					</tr>
					<%
						}
							}
						} else {

							IniciacaoDao dao = new IniciacaoDao();
							List<IniciacaoCientifica> ics = dao.listarICs();

							List<IniciacaoCientifica> listaRetorno = new ArrayList<IniciacaoCientifica>();

							if (paramBusca != null) {
								for (IniciacaoCientifica iniciacaoCientifica : ics) {
									if (String.valueOf(iniciacaoCientifica.getCodIC()).equalsIgnoreCase(paramBusca)
											|| iniciacaoCientifica.getCursos().toLowerCase().contains(paramBusca.toLowerCase())
											|| iniciacaoCientifica.getDescricao().toLowerCase().contains(paramBusca.toLowerCase())
											|| iniciacaoCientifica.getDuracao().toLowerCase().contains(paramBusca.toLowerCase())
											|| iniciacaoCientifica.getNomeIC().toLowerCase().contains(paramBusca.toLowerCase())
											|| iniciacaoCientifica.getProfessor().getNome().toLowerCase()
													.contains(paramBusca.toLowerCase())) {
										listaRetorno.add(iniciacaoCientifica);
									}
								}
								if (listaRetorno.isEmpty()) {
									request.setAttribute("erro", "Nenhuma IC encontrada!");
								}
							} else {
								listaRetorno = ics;
								for (IniciacaoCientifica ic : listaRetorno) {
					%>
					<tr>
						<td><%=ic.getCodIC()%></td>
						<td><%=ic.getDescricao()%></td>
						<td><%=ic.getDuracao()%></td>
						<td><%=ic.getCursos()%></td>
						<td><%=ic.getProfessor().getNome()%></td>
						<td>-</td>
					</tr>
					<%
						}
							}
						}
					%>
				</table>
				<h4>${erro}</h4>
			</div>
		</div>
	</div>

	<c:import url="/WEB-INF/jsp/rodape.jsp" />
</body>

</html>