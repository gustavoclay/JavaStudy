package exercicio.oo.com;

public class ProjetoLivro {

	public static void main(String[] args) {
		Livro livro = new Livro("POO", "Gustavo", 321, 0, false);
		Pessoa pessoa = new Pessoa("Jo�o", 25, "masculino");
		
		livro.setLeitor(pessoa);
		
		System.out.println(livro.detalhes());
		System.out.println(pessoa.toString());
		
	}

}
