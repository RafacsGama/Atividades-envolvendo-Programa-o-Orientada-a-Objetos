package exercícios_de_POO_Fixação_pkg4;
import java.util.Scanner;

public class GeradorMensagens {
	Scanner entra = new Scanner(System.in);
//	private String autor;
//	public String getAutor() {
//		return autor;
//	}
//	public void setAutor(String autor) {
//		this.autor=autor;
//	}
	public static String ExibirMensagem(String mensagem) {
//		Scanner entrada = new Scanner(System.in);
//		System.out.println("Digite seu nome: ");
//		String autor = entrada.next();
		//System.out.println("Digite o nome de quem vai receber sua linda mensagem: ");
		mensagem = """
				Lorem ipsum dolor sit amet, consectetur adipiscing elit, 
				sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. 
				Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
				Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. 
				Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
				""";
		String borda = "============================================";
		System.out.println(borda);
		System.out.println(mensagem);
		return borda;
	}
}