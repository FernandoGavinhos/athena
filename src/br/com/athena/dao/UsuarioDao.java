package br.com.athena.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import br.com.athena.objetos.Aluno;
import br.com.athena.objetos.Professor;
import br.com.athena.objetos.Usuario;

public class UsuarioDao {

	public List<Usuario> getLista() {
		List<Usuario> lista = new ArrayList<>();

		lista.add(new Usuario("juliane@usp.br", "123"));
		lista.add(new Usuario("leonardo@usp.br", "123"));
		lista.add(new Usuario("felipe@usp.br", "123"));
		lista.add(new Usuario("fernando@usp.br", "123"));
		return lista;
	}
private EntityManagerFactory connection;
	
	public UsuarioDao(){
		connection = new ConnectionFactory().getConnection();
	}
	
	public Usuario pesquisarUsuario(Usuario user){
		return user;
	}
	
	public Usuario Login(Aluno alu, Professor prof, Usuario user) throws Exception {
		EntityManager manager = null;
		try {
			manager = connection.createEntityManager();
			Query query = manager.createQuery("select u from Usuario as u "+"where u.nUsp = :nUsp and u.senha= :senha");
			query.setParameter("nUsp", user.getnUsp());
			query.setParameter("senha", user.getSenha());
			user = (Usuario) query.getSingleResult();
			if(user.getPapel().equals("Aluno")){
				alu = manager.find(Aluno.class, user.getnUsp());
				return alu;
			}
			else{
				prof = manager.find(Professor.class, user.getnUsp());
				return prof;
			}
		} finally {
			manager.close();
		}
	}
}
