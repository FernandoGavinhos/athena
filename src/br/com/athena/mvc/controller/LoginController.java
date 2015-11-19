package br.com.athena.mvc.controller;

import javax.persistence.NoResultException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.athena.dao.UsuarioDao;
import br.com.athena.mvc.controller.servlet.ServletImpl;
import br.com.athena.objetos.Usuario;

public class LoginController implements ServletImpl {

	public String executa(HttpServletRequest req, HttpServletResponse res) {
		try {
			Usuario user = new Usuario();
			String nUSParameter = req.getParameter("nUSP");
			String senhaParameter = req.getParameter("senha");

			user.setnUsp(Integer.parseInt(nUSParameter));
			user.setSenha(senhaParameter);

			UsuarioDao userDao = new UsuarioDao();
			user = userDao.login(user);
			
			// if (nUSParameter.equals("8061535")) {
			// user.setPapel("Aluno");
			// user.setNome("Juliane");
			// } else {
			// user.setPapel("Professor");
			// user.setNome("Chaim");
			// }
			req.getSession().setAttribute("login", user.getNome());
			req.getSession().setAttribute("papel", user.getPapel());
			req.getSession().setAttribute("ehAluno", user.getPapel().equals("Aluno"));

			return "/WEB-INF/jsp/bem-vindo.jsp";
		} catch (NoResultException e) {
			req.setAttribute("erro", "Usuário ou senha inválidos... =/");
			return "login.jsp";
		}
	}
}