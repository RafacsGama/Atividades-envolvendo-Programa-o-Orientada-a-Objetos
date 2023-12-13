package exercícios_de_POO_Fixação_pkg4;
import java.util.Scanner;

public class MensagemAmor extends GeradorMensagens{
	GeradorMensagens gerador = new GeradorMensagens();
	
	private String destinatario;
	public String getDestinatario() {
		return destinatario;
	}
	public static String setDestinatario(String destinatario) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o nome de quem vai receber a mensagem:");
		String destino=destinatario;
		return destino=entrada.next();
	}
}
