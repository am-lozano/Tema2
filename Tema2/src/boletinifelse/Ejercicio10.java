package boletinifelse;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		/*
		 * Escribir un programa que pida al usuario tres números enteros, y que muestre
		 * por pantalla si la suma de dos de esos números da como resultado el otro
		 * número.
		 */

		// Variable para el numero 1
		int numero1;

		// Variable para el numero 2
		int numero2;

		// Variable para el numero 3
		int numero3;

		// Creamos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos el primer numero
		System.out.println("Introduzca el primer numero:");
		numero1 = sc.nextInt();

		// Pedimos el segundo numero
		System.out.println("Introduzca el segundo numero:");
		numero2 = sc.nextInt();

		// Pedimos el tercer numero
		System.out.println("Introduzca el tercer numero:");
		numero3 = sc.nextInt();

		// Creamos el if
		if (numero1 + numero2 == numero3) { // Comprobamos si la suma de los dos primero numeros es el tercer numero
			System.out.println("La suma de " + numero1 + " y " + numero2 + " es igual al " + numero3);
		} else if (numero1 + numero3 == numero2) { // Comprobamos si la suma de numero1 y numero3 es numero2
			System.out.println("La suma de " + numero1 + " y " + numero3 + " es igual al " + numero2);
		}else if (numero2 + numero3 == numero1) { // Comprobamos si la suma de numero2 y numero3 es numero1
			System.out.println("La suma de " + numero1 + " y " + numero3 + " es igual al " + numero1);
		}else {
			System.out.println("La suma de 2 numeros no da como resultado el otro");
		}
	}

}
