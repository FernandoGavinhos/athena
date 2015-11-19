package br.com.athena.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import br.com.athena.objetos.IniciacaoCientifica;

public class IniciacaoDao {
	private EntityManagerFactory connection;

	public IniciacaoDao() {
		connection = new ConnectionFactory().getConnection();
	}

	public IniciacaoCientifica adicionarIC(IniciacaoCientifica ic) {
		EntityManager manager = null;
		try {
			manager = connection.createEntityManager();
			manager.getTransaction().begin();
			manager.persist(ic);
			manager.getTransaction().commit();
			manager.close();
			return ic;
		} finally {
			manager.close();
		}
	}

	public IniciacaoCientifica removerIC(IniciacaoCientifica ic) {
		EntityManager manager = null;
		try {
			manager = connection.createEntityManager();
			manager.getTransaction().begin();
			manager.remove(manager.getReference(IniciacaoCientifica.class, ic.getCodIC()));
			manager.getTransaction().commit();
			manager.close();
			return ic;
		} finally {
			manager.close();
		}
	}

	@SuppressWarnings("unchecked")
	public List<IniciacaoCientifica> listarICs() {
		EntityManager manager = null;
		try {
			manager = connection.createEntityManager();
			Query query = manager.createQuery("SELECT ic FROM IniciacaoCientifica ic");
			return query.getResultList();
		} finally {
			manager.close();
		}
	}

	public IniciacaoCientifica listarICPorId(String idIC) {
		EntityManager manager = null;
		try {
			manager = connection.createEntityManager();
			Query query = manager.createQuery("select a from IniciacaoCientifica a where a.codIC = :codIC");
			query.setParameter("codIC", Integer.parseInt(idIC));
			return (IniciacaoCientifica) query.getSingleResult();
		} finally {
			manager.close();
		}
	}
}
