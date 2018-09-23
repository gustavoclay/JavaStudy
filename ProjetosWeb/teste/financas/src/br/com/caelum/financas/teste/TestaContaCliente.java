package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.caelum.financas.modelo.Cliente;
import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TestaContaCliente {
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setEndereco("Rio de janeiro");
		cliente.setNome("Leonardo");
		cliente.setProfissao("Operario");
		
		Cliente cliente2 = new Cliente();
		cliente2.setEndereco("Rio de janeiro");
		cliente2.setNome("Joao");
		cliente2.setProfissao("Operario");
		
		Conta conta = new Conta();
		conta.setId(2);
		
		cliente.setConta(conta);
		cliente2.setConta(conta);
		
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		
		em.persist(cliente);
		//em.persist(cliente2);
		
		em.getTransaction().commit();
		em.close();
		
	}
}
