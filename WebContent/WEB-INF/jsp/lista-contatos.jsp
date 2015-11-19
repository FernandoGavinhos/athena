<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<body>

	<c:import url="cabecalho.jsp" />

	<table>
		<!-- percorre contatos montando as linhas da tabela -->
		<c:forEach var="contato" items="${contatos}">
			<tr>
				<td>${contato.nome}</td>
				<td><c:choose>
						<c:when test="${not empty contato.email}">
							<a href="mailto:${contato.email}">${contato.email}</a>
						</c:when>
						<c:otherwise>
    						E-mail não informado
  						</c:otherwise>
					</c:choose></td>
				<td>${contato.endereco}</td>
				<td><fmt:formatDate value="${contato.dataNascimento.time}"
						pattern="dd/MM/yyyy" /></td>
				<td><athena:campoData id="dataNascimento" /></td>
			</tr>
		</c:forEach>

		<c:forEach var="contato" items="${contatos}">
			<tr>

				<!-- código omitido -->

				<td><a href="mvc?logica=RemoveContatoLogic&nome=${contato.nome}">Remover</a>
				</td>
			</tr>
		</c:forEach>
	</table>

	<c:import url="rodape.jsp" />

</body>

</html>
