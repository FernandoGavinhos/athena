package br.com.athena.dao;

import java.util.ArrayList;
import java.util.List;

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
}
