//Desenvolva um programa que crie duas listas de strings e, 
//em seguida, concatene as duas listas em uma terceira lista. 
//Exiba a lista resultante.
package exercicios_POO_PCT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Atvdd_2 {

	public static void main(String[] args) {
		List<String> strLista1 = Arrays.asList("Das Auto");
		List<String> strLista2 = Arrays.asList("Volkswagen");
		List<String> strLista3 = new ArrayList<>(strLista2);
		strLista3.addAll(strLista1);
		System.out.println(strLista3);
	}
}