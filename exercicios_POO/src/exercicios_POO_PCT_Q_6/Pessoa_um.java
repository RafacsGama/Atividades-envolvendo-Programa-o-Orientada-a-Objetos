package exercicios_POO_PCT_Q_6;
import java.util.Scanner;
public class Pessoa_um {

	public static void main(String[] args) {
		Scanner entra = new Scanner(System.in);
		Pessoa registro = new Pessoa();
		System.out.println("Digite o nome da pessoa:");
		String name=entra.nextLine();
		registro.setNome(name);
		System.out.println("Digite a idade da pessoa.");
		int regIdade = entra.nextInt();
		registro.setIdade(regIdade);
		System.out.println("O nome registrado é: "+ registro.getNome()+".");
		System.out.println(registro.getNome()+" tem "+registro.getIdade()+" anos de idade.");
	}
}