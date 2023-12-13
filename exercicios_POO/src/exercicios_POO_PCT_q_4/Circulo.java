//Crie uma classe chamada Circulo com um atributo raio do tipo double 
//e os seguintes métodos: 
//
//calcularArea(): deve ser um método sem retorno que imprime a área 
//do círculo;
//
//calcularPerimetro(): deve ser um método com retorno que retorna 
//o valor do perímetro do círculo.
//
//Para calcular a Área do círculo, pode ser usada a seguinte fórmula: 
//
//area = PI * (raio * raio)
//ou seja, a área equivale a PI (3,14) vezes raio ao quadrado, 
//ou raio vezes raio.
//
//Para calcular o Perímetro do círculo, pode ser usada a seguinte fórmula:
//
//perimetro = 2 * PI * raio
//ou seja, o perímetro equivale a duas vezes PI (3,14) vezes raio.
//
//Crie uma classe principal que contenha o método 
//main para instanciar um objeto da classe 
//Círculo que você criou e teste os dois métodos.
package exercicios_POO_PCT_q_4;

public class Circulo {
	double raio=0;
	public void calcularArea() {
		System.out.println("A área do círculo é: "+Math.PI*(raio*raio)+"cm.");
	}
	public double calcularPerimetro(double raio) {
		double perimetro=2*raio*Math.PI;
		return perimetro;		
	}
}