package logica.operadores.aritmeticos;

import br.com.softblue.commons.io.Console;

public class Main {

	public static void main(String[] args) {
		// CONCATENAÇÃO -------------------------------------------
		String texto1;
		String texto2;
		
		System.out.println("Digite o texto 1: ");
		texto1 = Console.readString();
		
		System.out.println("Digite o texto 2: ");
		texto2 = Console.readString();
		
		String textoJunto = texto1 + texto2;
		System.out.println("Texto final: " + textoJunto);
		// --------------------------------------------------------
		
		// EQ. DO 2o GRAU------------------------------------------
		System.out.println("a:");
		int a = Console.readInt();
		
		System.out.println("b:");
		int b = Console.readInt();
		
		System.out.println("c:");
		int c = Console.readInt();
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
		// --------------------------------------------------------
		
		// PERÍMETRO E ÁREA DO HEXÁGONO ---------------------------
		int lado = Console.readInt();
		int p = 6 * lado;
		double area = (3 * lado * Math.sqrt(3)) / 2;
		
		System.out.println("P = " + p);
		System.out.println("A = " + area);
		// --------------------------------------------------------
		
		// RESTO DA DIVISÃO ---------------------------------------
		int resto = 10 % 3;
		System.out.println(resto);
		// --------------------------------------------------------
	}
}
