package br.com.caelum.livraria.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.caelum.livraria.interceptador.LogInterceptor;
import br.com.caelum.livraria.modelo.Autor;

@Stateless
// @Interceptors({ LogInterceptor.class }) // configurando que vai ter um interceptador para a classe
public class AutorDao {

	@PersistenceContext
	private EntityManager em;

	public void salva(Autor autor) {
		em.persist(autor);
	}
	
	public List<Autor> todosAutores() {
		return (List<Autor>) em.createNamedQuery("select a from Autor a", Autor.class)
				.getResultList();
	}

	public Autor buscaPelaId(Integer autorId) {
		Autor autor = em.find(Autor.class, autorId);
		return autor;
	}
	
}
