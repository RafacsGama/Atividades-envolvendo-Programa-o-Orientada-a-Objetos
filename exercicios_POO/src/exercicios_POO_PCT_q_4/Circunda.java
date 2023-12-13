package exercicios_POO_PCT_q_4;
import java.util.Scanner;
public class Circunda {

	public static void main(String[] args) {
		Scanner entra = new Scanner(System.in);
		Circulo round = new Circulo();
		System.out.println("Digite o raio do círculo.");
		round.raio=entra.nextDouble();
		round.calcularArea();
		System.out.println("O perímetro do círculo é: "+round.calcularPerimetro(round.raio)+"cm.");
	}
}