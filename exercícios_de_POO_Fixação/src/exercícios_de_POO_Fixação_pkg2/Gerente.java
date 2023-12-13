package exercícios_de_POO_Fixação_pkg2;

public class Gerente extends Funcionario {
	double bonificacao;
	
	public Gerente(String nome, int numId, double salario, double bonificacao) {
		super(nome, numId, salario);
		this.bonificacao = bonificacao;
		}
	
	@Override
	public double calcularSalario() {
		double novoSalario = bonificacao*getSalario();
		return novoSalario;
	}
	public void promover() {
		System.out.println("Funcionário promovido a gerente.");
	}	
}