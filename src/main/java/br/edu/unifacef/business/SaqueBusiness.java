package br.edu.unifacef.business;

import br.edu.unifacef.dao.ContaDAO;
import br.edu.unifacef.model.Conta;

public class SaqueBusiness {
	
	private ContaDAO contaDAO;
	
	public SaqueBusiness(ContaDAO dao) {
		this.contaDAO = dao;
	}
	
	public Conta sacar(Conta conta, Double valor) {
		
		if(conta == null )
			return new Conta();
//			throw new RuntimeException("Conta n�o encontrada.");
		if(conta.getSaldo() < valor)
			return new Conta();
//			throw new RuntimeException("Saldo abaixo do valor solicitado.");
		if(conta.getSaldo() < 0) {
			return new Conta();
//			throw new RuntimeException("Opera��o n�o permitida.");
		}else {
			conta.setSaldo(conta.getSaldo() - valor);
		}
		
		return this.contaDAO.alterar(conta);
	}
}
