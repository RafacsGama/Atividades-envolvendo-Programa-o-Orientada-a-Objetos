package exercícios_de_POO_Fixação_pkg;
import java.util.Scanner;
public class Showroom {

	public static void main(String[] args) {
		Scanner entra = new Scanner(System.in);
		RegVeic showroom = new RegVeic();
		System.out.println("Informe a marca do carro: ");
		showroom.setMarca(entra.nextLine());
		System.out.println("Informe o modelo do carro: ");
		showroom.setModelo(entra.nextLine());
		System.out.println("Informe o ano de fabricação do carro: ");
		showroom.setAno(entra.nextInt());
		System.out.println("Informe quantas portas o veículo dispõe: ");
		showroom.setQtdPorta(entra.nextInt());
		System.out.println("Informe a potência do carro: ");
		showroom.setPotencia(entra.nextDouble());
		System.out.println("Informe o tipo de combustível desse veículo: ");
		showroom.setTipoCombustivel(entra.next());
		System.out.println("O carro " + showroom.getMarca()
				+" "+showroom.getModelo()+", fabricado em "
				+showroom.getAno()+", possui "
				+showroom.getQtdPorta()+" portas e tem "
				+showroom.getPotencia()+" de potência do motor e o seu combustível é "
				+showroom.getTipoCombustivel()+".");
	}
}