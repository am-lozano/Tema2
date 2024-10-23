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

		// variable para contar los multiplos de 3 desde 1 hasta n
		int multiplo = 0;

		// variable para mostrar el numero de multiplos de 3
		int contador = 0;

		// creamos el escaner
		Scanner sc = new Scanner(System.in);

		// pedimos el numero
		System.out.println("Introduzca un numero:");
		numero = sc.nextInt();

		for (int i = 1; i <= numero; i++) {

			multiplo++;

			if (multiplo % 3 == 0) {
				contador++;
			}
		}

		// mostramos el resultado
		System.out.println("Hay " + contador + " multiplos de 3 desde 1 hasta " + numero);

		// cerramos el escaner
		sc.close();

	}

}
