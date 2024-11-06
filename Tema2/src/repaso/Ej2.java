package repaso;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {

		/*
		 * Escribe un programa que pida por teclado un número entero mayor o igual que 0
		 * y determine cuántas de sus cifras son pares y cuántas son impares:
		 */

		// variable para almacenar el numero pedido
		int numero;

		// variable para ir almacenando las cifras del numero
		int cifra = 0;

		// variable para contar cuantas cifras son pares
		int par = 0;
		
		// variable para contar la cantidad de ceros
		int contadorCeros = 0;

		// creamos el escaner
		Scanner sc = new Scanner(System.in);

		// peedimos el numero
		System.out.println("Introduzca un numero:");
		numero = sc.nextInt();

		do {

			cifra = numero % 10;

			if (cifra == 0) {

				contadorCeros++;
			
			} else if (cifra % 2 == 0) {
				
				par++;
				
			} else {
				
			}
			
		} while (numero != 0);

		System.out.println(par);

		// cerramos el escaner
		sc.close();
	}
}