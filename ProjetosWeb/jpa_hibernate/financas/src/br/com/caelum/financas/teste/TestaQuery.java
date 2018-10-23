package br.com.caelum.financas.teste;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.modelo.TipoMovimentacao;
import br.com.caelum.financas.util.JPAUtil;

public class TestaQuery {

	public static void main(String[] args) {
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		
		Conta conta = new Conta();
		conta.setId(2);
		
		String jpql = "Select sum(m.valor) from Movimentacao m where m.conta = :pConta" + 
				" and m.tipo = :pTipo" +
				" order by m.valor desc";
				
		Query query = em.createQuery(jpql);
		query.setParameter("pConta", conta);
		query.setParameter("pTipo", TipoMovimentacao.SAIDA);

		BigDecimal soma = (BigDecimal) query.getSingleResult();
		
		System.out.println("Soma: " + soma);
		
		em.getTransaction().commit();
		em.close();

	}

}
