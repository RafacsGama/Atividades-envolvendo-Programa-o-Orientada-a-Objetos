//Crie uma classe chamada Aluno com três atributos:
//nome, matrícula e nota.
//Crie um método verificarStatus(double nota) que retorna 
//true se a nota for 
//maior ou igual a 7 e retorna false caso contrário.
//método com retorno tem obrigação de ter a palavra chave return.

package exercicios_POO_PCT_Q_2;

public class Aluno {
	String nome;
	int matricula=0;
	double nota=0;
	public boolean verificarStatus(double nota) {
		return nota >=7;
	}
}