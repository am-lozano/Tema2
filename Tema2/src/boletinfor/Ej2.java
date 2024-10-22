package boletinfor;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {

		/*
		 * Realiza un programa que cuente los múltiplos de 3 desde el 1 hasta un número
		 * que introducimos por teclado.
		 */

		// variable para almacenar el numero pedido
		int numero;
		
		int contador = 1;

		// creamos el escaner
		Scanner sc = new Scanner(System.in);

		// pedimos el numero
		System.out.println("Introduzca un numero:");
		numero = sc.nextInt();

		for (int i = 1; i <= numero; i++) {
			
			contador++;
			
			if (contador % 3 == 0) {
				System.out.println("Su numero es multiplo de 3");
			} else {
				System.out.println("Su numero no es multiplo de 3");
			}
		}

		// cerramos el escaner
		sc.close();

	}

}
