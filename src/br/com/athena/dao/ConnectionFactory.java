package br.com.athena.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactory {

	public EntityManagerFactory getConnection() {
		return Persistence.createEntityManagerFactory("Athena");
	}
}
