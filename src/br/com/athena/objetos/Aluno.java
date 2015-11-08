package br.com.athena.objetos;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="nUsp")
public class Aluno extends Usuario{

	public Aluno(String login, String senha) {
		super(login, senha);
	}
	private String curso;
	private Date anoPrev_formacao;
	private String intereses_pequisa;
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public Date getAnoPrev_formacao() {
		return anoPrev_formacao;
	}
	
	public void setAnoPrev_formacao(Date anoPrev_formacao) {
		this.anoPrev_formacao = anoPrev_formacao;
	}
	
	public String getIntereses_pequisa() {
		return intereses_pequisa;
	}
	
	public void setIntereses_pequisa(String intereses_pequisa) {
		this.intereses_pequisa = intereses_pequisa;
	}
}
