package bucles;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {

		/*
		 * Realiza un programa que nos diga si un número introducido por teclado es
		 * capicúa o no. El número debe ser mayor o igual que 0.
		 */

		// variable para almacenar el numero pedido
		int numero;

		// variable para almacenar el ultimo digito del numero introducido por consola
		int ultimoDigito;

		// variable para almacenar el numero al reves
		int numeroReverso = 0;

		// variable para almacenar el numero introducido inicialmente por consola
		int originalNum;

		// creamos el scanner
		Scanner sc = new Scanner(System.in);

		do { // bucle para comprobar que el numero es mayor que 0

			System.out.println("Introduce un número: ");
			numero = sc.nextInt();

			originalNum = numero;

		} while (numero < 0);

		
		while (numero > 0) {
			
			ultimoDigito = numero % 10;

			numeroReverso = numeroReverso * 10 + ultimoDigito;

			// dividimos el número entre 10 para pasar a la siguiente cifra
			numero /= 10;
		}

		// mostramos el resultado
		System.out.println(originalNum == numeroReverso ? "El numero es capicua" : "El numero no es capicua");

		// cerramos el escaner
		sc.close();

	}

}
