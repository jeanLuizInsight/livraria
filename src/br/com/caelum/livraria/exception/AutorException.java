package br.com.caelum.livraria.exception;

import javax.ejb.ApplicationException;

@ApplicationException(rollback = true) // rollback
public class AutorException extends RuntimeException {

	private static final long serialVersionUID = 8823997674221450552L;

	// Uma System Exception é algo grave, imprevisto, não deveria acontecer e sempre causa 
	// um rollback da transação. Normalmente são exceções de infra-estrutura. Além disso, 
	// aquele Session Bean que lançou a exceção é invalidado e retirado do pool de objetos. 
	// Por padrão, qualquer exceção unchecked é System Exception.

	// Uma Application Exception pode acontecer durante a vida da aplicação e relacionada 
	// ao domínio. Por isso não causa rollback e nem invalida o Session Bean. Por padrão, 
	// qualquer exceção checked é Application Exception.

}
