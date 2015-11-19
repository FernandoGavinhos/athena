package br.com.athena.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.athena.dao.IniciacaoDao;
import br.com.athena.dao.ProfessorDao;
import br.com.athena.mvc.controller.servlet.ServletImpl;
import br.com.athena.objetos.IniciacaoCientifica;
import br.com.athena.objetos.Professor;

public class AdicionaICController implements ServletImpl {

	public String executa(HttpServletRequest req, HttpServletResponse res) {
		try {
			IniciacaoDao IcDao = new IniciacaoDao();
			IniciacaoCientifica ic = new IniciacaoCientifica();

			// informações da iniciacao cientifica
			ic.setCursos(req.getParameter("cursos"));
			ic.setDescricao(req.getParameter("descricao"));
			ic.setDuracao(req.getParameter("duracao"));
			ic.setNomeIC(req.getParameter("nomeIC"));

			ProfessorDao profDao = new ProfessorDao();
			String nome = (String) req.getSession().getAttribute("login");
			Professor prof = profDao.pesquisarProfessorPorNome(nome);
			ic.setProfessor(prof);

			IcDao.adicionarIC(ic);
			
			req.setAttribute("msg", "IC cadastrada com sucesso!");
		} catch (Exception e) {
			req.setAttribute("msg", "Ocorreu um problema ao cadastrar a IC =/. Por favor, tente novamente!");
			System.out.println(e);
		}
		//TODO: popular a tela com a lista de ICs
		return "buscaIC.jsp";
	}
}
