//Escreva um programa que receba uma lista 
//de números inteiros de um tamanho qualquer. 
//Crie uma lista que receba apenas os números 
//pares dessa lista e 
//outra lista que receba apenas os números ímpares.
//Imprima as três listas.
package exercicios_POO_PCT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Atvdd_3 {

	public static void main(String[] args) {
		List<Integer> numLista = new ArrayList<>();
		List<Integer> numPar = new ArrayList<>();
		List<Integer> numImpar = new ArrayList<>();
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira um número:");
		int num = entrada.nextInt();
		numLista.add(num);
		System.out.println("Insira um segundo número:");
		int num2 = entrada.nextInt();
		numLista.add(num2);
		System.out.println("Insira um terceiro número:");
		int num3 = entrada.nextInt();
		numLista.add(num3);
		System.out.println("Insira um quarto número:");
		int num4 = entrada.nextInt();
		numLista.add(num4);
		System.out.println("Insira um quinto número:");
		int num5 = entrada.nextInt();
		numLista.add(num5);
		System.out.println("A lista de números é: "+ numLista+".");
		Collections.sort(numLista, Collections.reverseOrder());
		for(int ordem:numLista) {
			if(ordem%2==0) {
				numPar.add(ordem);
			}else{
				numImpar.add(ordem);
			}
		}
		System.out.println("A lista dos números pares são: "+numPar+".");
		System.out.println("A lista dos números ímpares são: "+numImpar+".");
	}
}