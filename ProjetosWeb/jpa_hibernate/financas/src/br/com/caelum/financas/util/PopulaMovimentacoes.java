package br.com.caelum.financas.util;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;

import javax.persistence.EntityManager;

import br.com.caelum.financas.modelo.Categoria;
import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.modelo.Movimentacao;
import br.com.caelum.financas.modelo.TipoMovimentacao;

public class PopulaMovimentacoes {
	public static void main(String[] args) {
		Categoria categoria1 = new Categoria("Viagem");
		Categoria categoria2 = new Categoria("Negocios");

		Conta conta = new Conta();
		conta.setId(2);

		Movimentacao mov1 = new Movimentacao();
		mov1.setCategorias(Arrays.asList(categoria1, categoria2));
		mov1.setData(Calendar.getInstance());// hoje
		mov1.setDescricao("Viagem a trabalho");
		mov1.setTipo(TipoMovimentacao.SAIDA);
		mov1.setValor(new BigDecimal("100.00"));

		mov1.setConta(conta);
		
		//data amanhã
		Calendar amanha = Calendar.getInstance();
		amanha.add(Calendar.DAY_OF_MONTH, 1);
		
		Movimentacao mov2 = new Movimentacao();
		mov2.setCategorias(Arrays.asList(categoria1, categoria2));
		mov2.setData(amanha);// hoje
		mov2.setDescricao("Viagem a trabalho 2");
		mov2.setTipo(TipoMovimentacao.SAIDA);
		mov2.setValor(new BigDecimal("300.00"));

		mov2.setConta(conta);

		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();

		em.persist(categoria1);
		em.persist(categoria2);

		em.persist(mov1);
		em.persist(mov2);

//		Movimentacao mov = em.find(Movimentacao.class, 6);
//		mov.setValor(new BigDecimal("450.00"));

		em.getTransaction().commit();
		em.close();

	}

}
