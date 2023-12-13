package exercícios_de_POO_Fixação_pkg4;

import java.util.Scanner;

public class ProgramaSMS {

	public static void main(String[] args) {
		
//		MensagemAmor smsLove = new MensagemAmor(); 
//		System.out.println("Digite seu nome:");
//		smsLove.setAutor(entrada.next());
//		System.out.println("Digite o nome de quem vai receber sua linda mensagem:");
//		sysosmsLove.setDestinatario(null);
//		System.out.println("Olá "+smsLove.getDestinatario()+", tudo bem?");
//		System.out.println("O "+smsLove.getAutor()+" te envou esta linda mensagem...");
		System.out.println(MensagemAmor.setDestinatario(null));
		System.out.println(GeradorMensagens.ExibirMensagem(null));		
	}
}