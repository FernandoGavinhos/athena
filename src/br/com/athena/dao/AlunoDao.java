package br.com.athena.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import br.com.athena.objetos.Aluno;

public class AlunoDao {
	private EntityManagerFactory connection;

	public AlunoDao() {
		connection = new ConnectionFactory().getConnection();
	}

	public Aluno adicionarAluno(Aluno alu) throws Exception {
		EntityManager manager = null;
		try {
			manager = connection.createEntityManager();
			manager.getTransaction().begin();
			manager.persist(alu);
			manager.getTransaction().commit();
			manager.close();
			return alu;
		} finally {
			manager.close();
		}
	}

	public Aluno atualizaAluno(Aluno alu) {
		EntityManager manager = null;
		try {
			manager = connection.createEntityManager();
			manager.getTransaction().begin();
			manager.merge(alu);
			manager.getTransaction().commit();
			manager.close();
			return alu;
		} finally {
			manager.close();
		}
	}

	public Aluno pesquisarAluno(Aluno alu) {
		EntityManager manager = null;
		try {
			manager = connection.createEntityManager();
			Query query = manager.createQuery("select a from Aluno a where a.nUsp = :nUsp and a.senha = :senha");
			query.setParameter("nUsp", alu.getnUsp());
			query.setParameter("senha", alu.getSenha());
			alu = (Aluno) query.getSingleResult();
			return alu;
		} finally {
			manager.close();
		}

	}

	public Aluno pesquisarAlunoPorNome(String nome) {
		EntityManager manager = null;
		try {
			manager = connection.createEntityManager();
			Query query = manager.createQuery("select a from Aluno a where a.nome = :nome");
			query.setParameter("nome", nome);
			return (Aluno) query.getSingleResult();
		} finally {
			manager.close();
		}
	}

}
