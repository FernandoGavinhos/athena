package br.com.athena.mvc.controller;

import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.athena.dao.ProfessorDao;
import br.com.athena.mvc.controller.servlet.ServletImpl;
import br.com.athena.objetos.Professor;

public class AdicionaProfessorController implements ServletImpl {

	public String executa(HttpServletRequest req, HttpServletResponse res) {
		try {
			Professor prof = new Professor();
			ProfessorDao profDao = new ProfessorDao();
			// informações de usuario
			prof.setPapel(req.getParameter("papel"));
			prof.setnUsp(Integer.parseInt(req.getParameter("nUsp")));
			prof.setNome(req.getParameter("nome"));
			prof.setSexo(req.getParameter("sexo"));
			prof.setE_mail(req.getParameter("email"));
			prof.setDt_nasc(new SimpleDateFormat("dd/MM/yyyy").parse(req.getParameter("dtNasc")));
			prof.setTelefone(req.getParameter("telefone"));
			prof.setCelular(req.getParameter("celular"));
			prof.setCurriculo_lattes(req.getParameter("curriculo"));
			prof.setSenha(req.getParameter("senha"));
			// informações do professor
			prof.setCurso_ministra(req.getParameter("cursoMinistra"));
			prof.setLinha_pesquisa(req.getParameter("linhaPesquisa"));

			if (profDao.adicionarProfessor(prof, prof) != null) {
				req.setAttribute("erro", "Usuário Adicionado com sucesso!");
			} else {
				req.setAttribute("erro", "Usuário já existe!");
			}
		} catch (javax.persistence.RollbackException ex) {
			req.setAttribute("erro", "Usuário Adicionado com sucesso!");
		} catch (Exception e) {
			System.out.println(e);
		}
		return "login.jsp";
	}
}