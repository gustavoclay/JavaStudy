package br.com.caelum.financas.teste;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.EntityManager;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.modelo.Movimentacao;
import br.com.caelum.financas.modelo.TipoMovimentacao;
import br.com.caelum.financas.util.JPAUtil;

public class TestaMovimentacao {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setId(1);

		Movimentacao mov1 = new Movimentacao();
		mov1.setData(Calendar.getInstance());// hoje
		mov1.setDescricao("Viagem a trabalho");
		mov1.setTipo(TipoMovimentacao.SAIDA);
		mov1.setValor(new BigDecimal("100.00"));
		mov1.setConta(conta);

		Movimentacao mov2 = new Movimentacao();
		mov2.setData(Calendar.getInstance());// hoje
		mov2.setDescricao("Viagem a trabalho 2");
		mov2.setTipo(TipoMovimentacao.SAIDA);
		mov2.setValor(new BigDecimal("300.00"));
		mov2.setConta(conta);

		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();

		em.persist(mov1);
		em.persist(mov2);

//		Movimentacao mov = em.find(Movimentacao.class, 6);
//		mov.setValor(new BigDecimal("450.00"));

		em.getTransaction().commit();
		em.close();
	}

}
