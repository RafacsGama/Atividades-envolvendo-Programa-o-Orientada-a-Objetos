package exercicios_POO_PCT_Q_5;
import java.util.Scanner;
public class CarroObj {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a marca do carro vendido:");
		String marca = entrada.nextLine();
		System.out.println("Digite o modelo do carro vendido:");
		String modelo = entrada.nextLine();
		System.out.println("Digite o ano do carro vendido:");
		int ano = entrada.nextInt();
		Carro obj = new Carro(marca,modelo,ano);
		//Carro uno = new Carro(marca,modelo,ano);
	}
}