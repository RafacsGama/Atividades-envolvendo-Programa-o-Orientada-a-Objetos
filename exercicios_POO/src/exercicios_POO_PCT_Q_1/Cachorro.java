//Crie uma classe chamada "Cachorro" com um atributo nome (String) 
//e um método latir(). 
//Crie um objeto da classe "Cachorro" e chame o método latir(). 
package exercicios_POO_PCT_Q_1;

public class Cachorro {
	String nome;
	String name;
	public void latir() {
		System.out.println("O cachorro "+nome+" está a latir...");
	}
	public void latido(String name) {
		System.out.println("Canino "+this.name+" está latindo.");
	}
}