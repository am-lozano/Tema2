package bucles;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {

		/*
		 * Solicita al usuario un número n y dibuja un triángulo de base y altura n.
		 */

		// variable para pedir la cantidad de filas del triangulo
		int filas;

		// variable para introducir la cantidad de espacios
		int espacios;

		// creamos el escaner
		Scanner sc = new Scanner(System.in);

		do { // comprobamos que la cantidad de filas es un numero positivo

			// pedimos la cantidad de filas del triangulo
			System.out.println("Introduzca la cantidad de filas:");
			filas = sc.nextInt();

		} while (filas <= 0);

		for (int i = 1; i <= filas; i++) {

			for (int j = filas - 1; j >= i; j--) {

				System.out.print(" ");
			}
			
			for (int k = 1; k <= i; k++) {

				System.out.print("* ");
			}

			System.out.println();

		}

	}

}
