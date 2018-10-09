package br.com.caelum.livraria.webservice;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.com.caelum.livraria.dao.LivroDao;
import br.com.caelum.livraria.modelo.Livro;

/**
 * Classe responsável por disponibilizar todos os serviços WSDL relacionados a livraria.
 * @author jean
 *
 */
@WebService
@Stateless
public class LivrariaWS {
	
	@Inject LivroDao livroDao;

	@WebResult(name="autores")
	public List<Livro> getLivrosPorTitulo(@WebParam(name="titulo") String titulo) {
		return this.livroDao.livrosPeloTitulo(titulo);
	}
}
