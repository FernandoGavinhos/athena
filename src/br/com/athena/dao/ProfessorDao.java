package br.com.athena.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import br.com.athena.objetos.Professor;
import br.com.athena.objetos.Usuario;

public class ProfessorDao {
	private EntityManagerFactory connection;

	public ProfessorDao() {
		connection = new ConnectionFactory().getConnection();
	}

	public Professor adicionarProfessor(Usuario user, Professor prof) throws Exception {
		EntityManager manager = null;
		try {
			manager = connection.createEntityManager();
			manager.getTransaction().begin();
			manager.persist(prof);
			manager.getTransaction().commit();
			return prof;
		} finally {
			manager.close();
		}
	}

	public Professor pesquisarProfessorPorNome(String nome) {
		EntityManager manager = null;
		try {
			manager = connection.createEntityManager();
			Query query = manager.createQuery("select p from Professor p where p.nome = :nome");
			query.setParameter("nome", nome);
			return (Professor) query.getSingleResult();
		} finally {
			manager.close();
		}
	}
}
