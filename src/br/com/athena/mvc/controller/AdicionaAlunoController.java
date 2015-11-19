package br.com.athena.mvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.athena.dao.AlunoDao;
import br.com.athena.mvc.controller.servlet.ServletImpl;
import br.com.athena.objetos.Aluno;

public class AdicionaAlunoController implements ServletImpl {

	public String executa(HttpServletRequest req, HttpServletResponse res) {
		AlunoDao aluDao = new AlunoDao();
		Aluno alu = new Aluno();
		try {
			// informações de usuario
			String nUSPParam = req.getParameter("nUsp");
			String nomeParameter = req.getParameter("nome");
			String sexoParameter = req.getParameter("sexo");
			String emailParameter = req.getParameter("email");
			String dataNascParameter = req.getParameter("dtNasc");
			String telParameter = req.getParameter("telefone");
			String celParameter = req.getParameter("celular");
			String senhaParameter = req.getParameter("senha");
			String curriculoParameter = req.getParameter("curriculoLattes");
			String anoFormacaoParameter = req.getParameter("anoPrevFormacao");
			String cursoParameter = req.getParameter("curso");
			String pesquisaParameter = req.getParameter("interesesPequisa");
			Date dataNascFormat = new SimpleDateFormat("dd/MM/yyyy").parse(dataNascParameter);
			Date anoFormacaoFormat = new SimpleDateFormat("dd/MM/yyyy").parse(anoFormacaoParameter);

			alu.setPapel("Aluno");
			alu.setnUsp(Integer.parseInt(nUSPParam));
			alu.setNome(nomeParameter);
			alu.setSexo(sexoParameter);
			alu.setE_mail(emailParameter);
			alu.setDt_nasc(dataNascFormat);
			alu.setTelefone(telParameter);
			alu.setCelular(celParameter);
			alu.setSenha(senhaParameter);
			alu.setCurriculo_lattes(curriculoParameter);
			alu.setAnoPrev_formacao(anoFormacaoFormat);
			alu.setCurso(cursoParameter);
			alu.setIntereses_pequisa(pesquisaParameter);

			if (aluDao.adicionarAluno(alu) != null) {
				req.setAttribute("erro", "Usuário Adicionado com sucesso!");
			} else {
				req.setAttribute("erro", "Usuário já existe!");
			}
			return "login.jsp";

		} catch (javax.persistence.RollbackException ex) {
			try {
				aluDao.atualizaAluno(alu);
				req.setAttribute("erro", "Usuário Adicionado com sucesso!");
			} catch (Exception e) {
				req.setAttribute("erro", "Houve um erro ao cadastrar usuário!");
				System.out.println(e);
			}
		} catch (Exception e) {
			req.setAttribute("erro", "Houve um erro ao cadastrar usuário!");
			System.out.println(e);
		}
		return "login.jsp";
	}
}