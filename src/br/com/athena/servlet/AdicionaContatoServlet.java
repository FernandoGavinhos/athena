package br.com.athena.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.athena.dao.UsuarioDao;
import br.com.athena.objetos.Usuario;

@WebServlet(name = "AdicionaContato", urlPatterns = { "/adicionaContato" })
public class AdicionaContatoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		log("Iniciando a servlet");
	}

	@Override
	protected void doPost(//
			HttpServletRequest request,//
			HttpServletResponse response) //
			throws ServletException, IOException {

		salvaContatoNoBanco(request);
		retornaSucesso(request, response);

	}

	private void retornaSucesso(HttpServletRequest request,//
			HttpServletResponse response) {

		RequestDispatcher rd = request
				.getRequestDispatcher("/contato-adicionado.jsp");
		try {
			rd.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private Usuario salvaContatoNoBanco(HttpServletRequest request) {
		Usuario contato = getContato(request);

		// salva o contato
		UsuarioDao dao = new UsuarioDao();
		// dao.adiciona(contato);
		return contato;
	}

	private Usuario getContato(HttpServletRequest request) {
		// pegando os parâmetros do request
		String nome = request.getParameter("nome");
		String endereco = request.getParameter("endereco");
		String email = request.getParameter("email");
		String dataEmTexto = request.getParameter("dataNascimento");
		Calendar dataNascimento = null;

		// fazendo a conversão da data
		try {
			Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto);
			dataNascimento = Calendar.getInstance();
			dataNascimento.setTime(date);
		} catch (ParseException e) {
			System.out
					.println("Erro de conversão da data no método br.com.athena.servle.AdicionaContato.getContato");
		}

		// monta um objeto contato
		Usuario contato = new Usuario(nome, //
				endereco);

		return contato;
	}

	public void destroy() {
		super.destroy();
		log("Destruindo a servlet");
	}
}
