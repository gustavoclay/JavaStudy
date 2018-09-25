package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.caelum.financas.util.JPAUtil;

public class TestaQuery {

	public static void main(String[] args) {
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		
		String jpql = "Select c from Conta c";
		Query query = em.createQuery(jpql);
		
		System.out.println(query.getResultList());
		
		em.getTransaction().commit();
		em.close();

	}

}
