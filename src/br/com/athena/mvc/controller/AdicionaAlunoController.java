package br.com.athena.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.athena.mvc.controller.servlet.ServletImpl;

public class AdicionaAlunoController implements ServletImpl {

	public String executa(HttpServletRequest req, HttpServletResponse res)
			throws Exception {

		System.out.println("Adicionando o aluno");

		System.out.println("Retornando o nome da página JSP ...");

		//return "contato-adicionado.jsp";

		return "mvc?do=AddContato";
	}
}