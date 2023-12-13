//Crie um programa que receba uma lista de números 
//inteiros de um tamanho qualquer e determine o 
//maior elemento presente na lista. 
//
//Em seguida, exiba o resultado.
package exercicios_POO_PCT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Atvdd_1 {

	public static void main(String[] args) {
		List<Integer> numLista = new ArrayList<>();
		Scanner entrada = new Scanner(System.in);
		int maiorNum = Integer.MIN_VALUE;
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
		System.out.println("Insira um sexto número:");
		int num6 = entrada.nextInt();
		numLista.add(num6);
		System.out.println("A lista de números é: "+numLista+".");
		Collections.sort(numLista, Collections.reverseOrder());
		for(int ordem:numLista) {
			if(ordem>maiorNum) {
				maiorNum = ordem;
			}
		}
		System.out.println("O maior número é: "+maiorNum+".");
	}
}