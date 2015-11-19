package br.com.athena.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import br.com.athena.objetos.Aluno;
import br.com.athena.objetos.Professor;
import br.com.athena.objetos.Usuario;

public class UsuarioDao {

	private EntityManagerFactory connection;

	public UsuarioDao() {
		ConnectionFactory connectionFactory = new ConnectionFactory();
		try {
			connection = connectionFactory.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Usuario cadastrarUsuario(Usuario user) throws Exception {
		EntityManager manager = null;
		manager = connection.createEntityManager();
		try {
			pesquisarUsuario(user);
		} catch (NoResultException e) {
			manager.getTransaction().begin();
			manager.persist(user);
			manager.getTransaction().commit();
			return user;
		} finally {
			manager.close();
		}
		return null;
	}

	public Usuario pesquisarUsuario(Usuario user) throws NoResultException {
		EntityManager manager = null;
		try {
			manager = connection.createEntityManager();
			Query query = manager.createQuery("select u from Usuario u where u.nUsp = :nUsp");
			query.setParameter("nUsp", user.getnUsp());
			user = (Usuario) query.getSingleResult();
			return user;
		} finally {
			manager.close();
		}
	}
	
	public List<Usuario> pesquisarTodos() throws NoResultException {
		EntityManager manager = null;
		try {
			manager = connection.createEntityManager();
			Query query = manager.createQuery("select u from Usuario u");
			return query.getResultList();
			
		} finally {
			manager.close();
		}
	}

	public Usuario login(Usuario user) throws NoResultException {
		EntityManager manager = null;
		try {
			manager = connection.createEntityManager();
			Query query = manager.createQuery("select u from Usuario u where u.nUsp = :nUsp and u.senha = :senha");
			query.setParameter("nUsp", user.getnUsp());
			query.setParameter("senha", user.getSenha());
			user = (Usuario) query.getSingleResult();
			if (user.getPapel().equals("Aluno")) {
				Aluno alu= new Aluno();
				alu = manager.find(Aluno.class, user.getnUsp());
				return alu;
			} else {
				Professor prof = new Professor();
				prof = manager.find(Professor.class, user.getnUsp());
				return prof;
			}
		} finally {
			manager.close();
		}
	}

}
