package br.com.athena.objetos;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="nUsp")
public class Professor extends Usuario{
	public Professor(String login, String senha) {
		super(login, senha);
	}

	private String curso_ministra;
	private String linha_pesquisa;
	
	public boolean cadastrar_usuario(Professor professor) {
		return false;
	}
	
	public Professor Login(String e_mail, String senha) {
		return null;
	}
	
	public String getLinha_pesquisa() {
		return linha_pesquisa;
	}
	
	public void setLinha_pesquisa(String linha_pesquisa) {
		this.linha_pesquisa = linha_pesquisa;
	}

	public String getCurso_ministra() {
		return curso_ministra;
	}

	public void setCurso_ministra(String curso_ministra) {
		this.curso_ministra = curso_ministra;
	}
}
