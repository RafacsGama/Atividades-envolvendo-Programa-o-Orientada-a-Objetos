package exercícios_de_POO_Fixação_pkg2;

public class Funcionario {
	private String nome;
	private int numId;
	private double salario;
	
	public Funcionario(String nome, int numId, double salario) {
		this.nome = nome;
		this.numId = numId;
		this.salario = salario;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumId() {
		return numId;
	}
	public void setNumId(int numId) {
		this.numId = numId;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double calcularSalario() {
		return getSalario();
	}	
}