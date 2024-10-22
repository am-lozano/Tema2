package boletinfor;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {

		/*
		 * Escribir una aplicación para aprender a contar, que pedirá un número n y
		 * mostrará todos los números del 1 al n.
		 */

		// variable para almacenar el numero pedido
		int numero;

		// creamos el escaner
		Scanner sc = new Scanner(System.in);

		// pedimos el numero
		System.out.println("Introduzca un numero:");
		numero = sc.nextInt();

		for (int i = 1; i <= numero; i++) {
			System.out.println(i);
		}
		
		// cerramos el escaner
		sc.close();
	}

}
