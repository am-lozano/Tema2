package bucles;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {

		/*
		 * Escribe un programa que lea un número n e imprima una pirámide de números con
		 * n filas como en la siguiente figura:
		 * 
		 * 1 
		 * 121 
		 * 12321 
		 * 1234321
		 */

		// variable para el nuemro maximo
		int numero;

		// creamos el escaner
		Scanner sc = new Scanner(System.in);

		// pedimos el numero
		System.out.println("Introduzca un numero:");
		numero = sc.nextInt();

		for (int i = 1; i <= numero; i++) { // bucle para el numero de filas

			for (int j = 1; j < i; j++) { // bucle para los numeros desde 1 hasta numero
				System.out.print(j);
			}

			for (int k = i; k > 0; k--) { // bucle para los numeros desde numero hasta 1
				System.out.print(k);
			}

			System.out.println();

		}

		// cerramos el escaner
		sc.close();

	}

}
