package exercícios_de_POO_Fixação_pkg3;

public class Conta {
	private double saldo;
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void Depositar(double valor) {
		if(valor > 0 ) {
			this.setSaldo(this.saldo+=valor);					
		}
	}
	public void Sacar(double valor) {
		if(valor >0 && this.saldo>=valor) {
			this.setSaldo(this.saldo-=valor);			
		}
	}	
}