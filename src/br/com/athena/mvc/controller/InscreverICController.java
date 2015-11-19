package br.com.athena.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.athena.dao.AlunoDao;
import br.com.athena.dao.IniciacaoDao;
import br.com.athena.mvc.controller.servlet.ServletImpl;
import br.com.athena.objetos.Aluno;
import br.com.athena.objetos.IniciacaoCientifica;

public class InscreverICController implements ServletImpl {

	public String executa(HttpServletRequest req, HttpServletResponse res) {
		try {
			String codIC = (String) req.getParameter("nomeIC");
			String nome = (String) req.getSession().getAttribute("login");

			AlunoDao alunoDao = new AlunoDao();
			Aluno aluno = alunoDao.pesquisarAlunoPorNome(nome);

			Aluno al = (Aluno) req.getSession().getAttribute("aluno");
			if (al != null) {
				for (IniciacaoCientifica ic : al.getListaIC()) {
					aluno.getListaIC().add(ic);
				}
			}

			IniciacaoDao iniciacaoDao = new IniciacaoDao();
			IniciacaoCientifica iniciacaoCientifica = iniciacaoDao.listarICPorId(codIC);
			aluno.getListaIC().add(iniciacaoCientifica);

			// alunoDao.atualizaAluno(aluno);

			req.getSession().setAttribute("aluno", aluno);
			req.setAttribute("erro", "Inscrição realizada com sucesso!");
		} catch (Exception e) {
			e.printStackTrace();
			req.setAttribute("erro", "Problema ao realizar inscrição =/");
		}
		return "inscreverIC.jsp";

	}
}