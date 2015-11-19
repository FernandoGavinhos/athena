package br.com.athena.objetos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class IniciacaoCientifica {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int codIC;
	private String NomeIC;
	private String Duracao;
	private String Cursos;
	private String Descricao;
	@ManyToOne
	@JoinColumn(name = "nUsp")
	private Professor professor;


	public String getNomeIC() {
		return NomeIC;
	}

	public void setNomeIC(String nomeIC) {
		NomeIC = nomeIC;
	}

	public String getDuracao() {
		return Duracao;
	}

	public void setDuracao(String duracao) {
		Duracao = duracao;
	}

	public String getCursos() {
		return Cursos;
	}

	public void setCursos(String cursos) {
		Cursos = cursos;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public int getCodIC() {
		return codIC;
	}

	public void setCodIC(int codIC) {
		this.codIC = codIC;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor nUspProf) {
		this.professor = nUspProf;
	}
}