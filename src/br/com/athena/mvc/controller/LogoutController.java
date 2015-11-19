package br.com.athena.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.athena.mvc.controller.servlet.ServletImpl;

public class LogoutController implements ServletImpl {

	public String executa(HttpServletRequest req, HttpServletResponse res) {
		req.getSession().setAttribute("login", null);

		return "index.jsp";
	}
}