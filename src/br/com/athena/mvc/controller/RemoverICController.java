package br.com.athena.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.athena.dao.IniciacaoDao;
import br.com.athena.mvc.controller.servlet.ServletImpl;
import br.com.athena.objetos.IniciacaoCientifica;

public class RemoverICController implements ServletImpl {

	public String executa(HttpServletRequest req, HttpServletResponse res) {
		try {
			String codIC = (String) req.getParameter("codIC");

			IniciacaoDao iniciacaoDao = new IniciacaoDao();
			IniciacaoCientifica iniciacaoCientifica = iniciacaoDao.listarICPorId(codIC);

			iniciacaoDao.removerIC(iniciacaoCientifica);

		} catch (Exception e) {
			System.out.println(e);
		}
		req.setAttribute("erro", "IC removida com sucesso!");
		return "removerIC.jsp";

	}
}