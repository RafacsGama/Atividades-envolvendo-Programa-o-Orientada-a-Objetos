package exercicios_POO_PCT_Q_3;
import java.util.Scanner;
public class TesteLivro {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Livro livro = new Livro();
		System.out.println("Digite o título do livro: ");
		livro.titulo=entrada.nextLine();
		System.out.println("Digite o nome do autor do livro: ");
		livro.autor=entrada.nextLine();
		System.out.println("Digite o ano da publicação do livro: ");
		livro.anoPubli=entrada.nextInt();
		livro.exibirDetalhes();
	}
}