package br.com.athena.objetos;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table
@PrimaryKeyJoinColumn(name = "nUsp")
public class Aluno extends Usuario {
	private String curso;
	private Date anoPrev_formacao;
	private String intereses_pequisa;
	@JoinColumn
	@OneToMany(fetch = FetchType.EAGER)
	private List<IniciacaoCientifica> listaIC;

	public List<IniciacaoCientifica> getListaIC() {
		return listaIC;
	}

	public void setListaIC(List<IniciacaoCientifica> listaIC) {
		this.listaIC = listaIC;
	}

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
