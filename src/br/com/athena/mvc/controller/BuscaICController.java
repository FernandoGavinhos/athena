package br.com.athena.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.athena.mvc.controller.servlet.ServletImpl;

public class BuscaICController implements ServletImpl {

	public String executa(HttpServletRequest req, HttpServletResponse res) {
		String paramBusca = req.getParameter("paramBusca");
		req.setAttribute("paramBusca", paramBusca);

		return "buscaIC.jsp";

	}
}