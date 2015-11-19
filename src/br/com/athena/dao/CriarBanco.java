package br.com.athena.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CriarBanco {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory( "Athena", null );
		factory.close();
	}
}
