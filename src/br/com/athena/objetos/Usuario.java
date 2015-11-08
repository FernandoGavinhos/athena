package br.com.athena.objetos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario {
	@Id
	private int nUsp;
	@Column(name = "papel", nullable = false, length = 10)
	private String papel;
	private String sexo;
	private Date dt_nasc;
	private String e_mail;
	private String telefone;
	private String celular;
	private String curriculo_lattes;
	private String login;
	private String senha;
	private String nome;
	
	public Usuario(String login, String senha) {
		super();
		this.login = login;
		this.senha = senha;
	}
	
	public boolean Logout(Usuario user){
		return true;
	}
	
	public String getCurriculo_lattes() {
		return curriculo_lattes;
	}

	public void setCurriculo_lattes(String curriculo_lattes) {
		this.curriculo_lattes = curriculo_lattes;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getE_mail() {
		return e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

	public Date getDt_nasc() {
		return dt_nasc;
	}

	public void setDt_nasc(Date dt_nasc) {
		this.dt_nasc = dt_nasc;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getnUsp() {
		return nUsp;
	}

	public void setnUsp(int nUsp) {
		this.nUsp = nUsp;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public String getPapel() {
		return papel;
	}

	public void setPapel(String papel) {
		this.papel = papel;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

}
