<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib tagdir="/WEB-INF/tags" prefix="athena" %>

<html>
<head>
<link href="css/jquery.css" rel="stylesheet">
<script src="js/jquery.js"></script>
<script src="js/jquery-ui.js"></script>
</head>
<body>

	<c:import url="cabecalho.jsp" />

	<form action="adicionaContato" method="POST">
		Nome: <input type="text" name="nome" /> <br /> E-mail: <input
			type="text" name="email" /> <br /> Endereço: <input type="text"
			name="endereco" /> <br /> 
			Data Nascimento: <athena:campoData id="dataNascimento" /><br />
			
			
			 <br /> <input type="submit" value="Gravar" />
	</form>

	<c:import url="rodape.jsp" />
</body>
</html>