package repaso;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {

		/*
		 * Escribe un programa que lea un número entero (lado) y a partir de él cree un
		 * cuadrado de asteriscos con ese tamaño. Los asteriscos sólo se verán en el
		 * borde del cuadrado, no en el interior
		 */

		// variable para el lado del cuadrado
		int lado;

		// creamos el escaner
		Scanner sc = new Scanner(System.in);

		// pedimos el tamano del cuadrado
		System.out.println("Introduzca la cantidad de * del lado del cuadrado:");
		lado = sc.nextInt();

		for (int i = 1; i <= lado; i++) {

			System.out.print("* ");
							
		}

	}

}
