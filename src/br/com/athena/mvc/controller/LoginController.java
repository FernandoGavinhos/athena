package br.com.athena.mvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.athena.dao.UsuarioDao;
import br.com.athena.mvc.controller.servlet.ServletImpl;
import br.com.athena.objetos.Usuario;

public class LoginController implements ServletImpl {

	public String executa(HttpServletRequest req, HttpServletResponse res)
			throws Exception {

		String login = req.getParameter("usuario");
		String senha = req.getParameter("senha");

		// Monta a lista de contatos
		List<Usuario> usuarios = new UsuarioDao().getLista();
		Usuario usuarioLogado = null;

		for (Usuario usuario : usuarios) {
			if (login.equals(usuario.getLogin())
					&& senha.equals(usuario.getSenha())) {
				usuarioLogado = usuario;
			}
		}

		if (usuarioLogado != null) {
			req.setAttribute("login", usuarioLogado.getLogin());
			return "/WEB-INF/jsp/bem-vindo.jsp";
		} else {
			req.setAttribute("erro", "Usuário ou senha inválidos... =/");
			return "login.jsp";
		}

	}
}