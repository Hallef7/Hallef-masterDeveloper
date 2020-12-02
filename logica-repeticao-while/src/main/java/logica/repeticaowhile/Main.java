 
package logica.repeticaowhile;

import br.com.softblue.commons.io.Console;

public class Main {

	public static void main(String[] args) {
		
		double nota;
		int cont = 1;
		double soma = 0;
		
		do {
			System.out.println("Digite a Nota " + cont++ + ":");
			nota = Console.readDouble();
			
			if (nota != -1) {
				soma += nota;
				System.out.println("(soma = " + soma + ")");
			}
		
		} while (nota != -1);
		
		System.out.println("Soma = " + soma);
		System.out.println("Cont = " + (cont - 2));
		double media = soma / (cont - 2);
		System.out.println("Média = " + media);
	}
}
