package br.com.caelum.livraria.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.caelum.livraria.dao.AutorDao;
import br.com.caelum.livraria.exception.AutorException;
import br.com.caelum.livraria.modelo.Autor;

@Stateless
public class AutorService {

	@Inject
	private AutorDao autorDao;

	public void salva(Autor autor) {
		this.autorDao.salva(autor);
		
		// simulando exception de serviço externo...
		// sessão tratadas (previstas não causam rollback!!)
		// por isso devemos configurar em sua classe criada..
		// OBS.: excessões do tipo unchecked(runtimeException) não precisam de throws, checked(exception) precisam...
		// throw new AutorException();
	}

	public List<Autor> todosAutores() {
		return this.autorDao.todosAutores();
	}
}
