package logica.operadores.relacionaiselogicos;

import br.com.softblue.commons.io.Console;

public class Main1 {

	public static void main(String[] args) {
		
		System.out.println("Número 1:");
		int n1 = Console.readInt();
		
		System.out.println("Número 2:");
		int n2 = Console.readInt();
		
		boolean igual = n1 == n2;
		System.out.println("Iguais? " + igual);
		
		boolean diferente = n1 != n2;
		System.out.println("Diferentes? " + diferente);
		
		boolean primeiroMaiorQueSegundo = n1 > n2;
		System.out.println("Primeiro maior que segundo? " + primeiroMaiorQueSegundo);
		
		boolean primeiroMaiorIgualQueSegundo = n2 >= n2;
		System.out.println("Primeiro maior igual que segundo? " + primeiroMaiorIgualQueSegundo);
		
		
	}
}
