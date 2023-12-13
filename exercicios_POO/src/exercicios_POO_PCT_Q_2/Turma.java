package exercicios_POO_PCT_Q_2;
import java.util.Scanner;
public class Turma {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Aluno aluno = new Aluno();
		System.out.println("Digite o nome do aluno:");
		aluno.nome=entrada.nextLine();
		System.out.println("Digite a matrícula do aluno:");
		aluno.matricula=entrada.nextInt();
		System.out.println("Digite a nota do aluno.");
		if(aluno.verificarStatus(entrada.nextDouble())) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
	}
}