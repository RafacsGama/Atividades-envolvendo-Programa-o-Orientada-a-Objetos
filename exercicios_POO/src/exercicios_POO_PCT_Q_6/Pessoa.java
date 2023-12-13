//Crie uma classe chamada Pessoa com os atributos nome e idade. 
//Utilize os métodos getters e setters para acessar e 
//modificar esses atributos.
package exercicios_POO_PCT_Q_6;

public class Pessoa {
	private String nome;
	private int idade=0;
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade=idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}	
}