//Crie uma classe Carro com três atributos, marca, 
//modelo e ano. Crie um método construtor para que um objeto da classe 
//Carro só possa ser instanciado caso sejam passados valores para 
//a marca e o modelo do carro. Crie também um método para exibir as 
//informações do carro.

package exercicios_POO_PCT_Q_5;

public class Carro {
	private String marca;
	private String modelo;
	private int ano=0;
		public  Carro (String marca, String modelo, int ano) {
		this.marca=marca;
		this.ano=ano;
		this.modelo=modelo;
		System.out.println("Carro vendido: "+marca+" "+modelo+", ano "+ano+".");
	}
}