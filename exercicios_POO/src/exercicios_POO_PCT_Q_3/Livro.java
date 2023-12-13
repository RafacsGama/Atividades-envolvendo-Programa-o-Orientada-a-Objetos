//Crie uma classe Livro com os atributos titulo 
//do tipo String, autor, também do tipo String e anoPublicacao 
//do tipo int. 
//Crie um método exibirDetalhes() para exibir as informações do livro.
//Crie uma classe de Teste para instanciar um objeto da classe Livro e 
//preencha os valores dos três atributos. 
//Depois, chame o método exibirDetalhes().
package exercicios_POO_PCT_Q_3;

public class Livro {
	String titulo;
	String autor;
	int anoPubli=0;
	public void exibirDetalhes() {
		System.out.println("O livro "+titulo+", escrito por "+autor+", foi publicado no ano de "+anoPubli+".");
	}
}