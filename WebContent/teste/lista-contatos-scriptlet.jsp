<html>
<body>
	<%@ page
		import="br.com.athena.dao.ContatoDao, br.com.athena.objetos.Contato, java.util.List"%>

<html>
<body>
    <table>
      <%
      	ContatoDao dao = new ContatoDao();
      	List<Contato> contatos = dao.getLista();

      	for (Contato contato : contatos) {
      %>
        <tr>
          <td><%=contato.getNome()%></td> 
          <td><%=contato.getEmail()%></td>
          <td><%=contato.getEndereco()%></td>
          <td><%=contato.getDataNascimento().getTime()%></td>
        </tr>
      <%
      	}
      %>
    </table>
  </body>
</html></body>
</html>