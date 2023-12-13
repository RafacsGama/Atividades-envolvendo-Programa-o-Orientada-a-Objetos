package exercícios_de_POO_Fixação_pkg2;

public class App {

	public static void main(String[] args) {
		Funcionario func = new Funcionario("Pedro",1,1300);
		Gerente ger = new Gerente("Marcelo",2,1300,2);
		System.out.println("O funcionário "+func.getNome()+" recebe o por mês o valor R$"+func.calcularSalario()+".");
		System.out.println("O gerente "+ger.getNome()+" recebe o por mês o valor R$"+ger.calcularSalario()+".");
		ger.promover();
	}
}