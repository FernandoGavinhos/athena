package br.com.athena.mvc.controller.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings({ "rawtypes", "serial" })
@WebServlet("/mvc")
public class ControllerServlet extends HttpServlet {
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String parametro = request.getParameter("do");
		String nomeDaClasse = "br.com.athena.mvc.controller." + parametro;

		try {

			Class classe = Class.forName(nomeDaClasse);
			ServletImpl servletImpl = (ServletImpl) classe.newInstance();
			String pagina = servletImpl.executa(request, response);
			request.getRequestDispatcher(pagina).forward(request, response);

		} catch (Exception e) {
			throw new ServletException(
					"A l�gica de neg�cios causou uma exce��o", e);
		}
	}
}