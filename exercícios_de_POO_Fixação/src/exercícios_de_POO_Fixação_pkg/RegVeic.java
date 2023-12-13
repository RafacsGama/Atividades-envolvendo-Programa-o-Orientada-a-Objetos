package exercícios_de_POO_Fixação_pkg;

public class RegVeic extends Veiculo{
	
	private int qtdPorta = 0;
	private double potencia=0;
	private String tipoCombustivel;
	public int getQtdPorta(){
		return qtdPorta;
	}
	public void setQtdPorta(int qtdPorta) {
		this.qtdPorta=qtdPorta;
	}
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia=potencia;
	}
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}
	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel=tipoCombustivel;
	}
};