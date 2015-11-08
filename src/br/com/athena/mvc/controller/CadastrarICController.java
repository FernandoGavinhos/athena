package br.com.athena.mvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.athena.dao.UsuarioDao;
import br.com.athena.mvc.controller.servlet.ServletImpl;
import br.com.athena.objetos.Usuario;

public class CadastrarICController implements ServletImpl {

	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {

		System.out.println("Adicionando o projeto");

		System.out.println("Retornando o nome da página JSP ...");

		return "mvc?do=AddIC";
	}
}