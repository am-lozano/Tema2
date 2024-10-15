package boletin3;

import java.util.Random;
import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {

		/*
		 * Realiza el “juego de la suma”, que consiste en que aparezcan dos números
		 * aleatorios (comprendidos entre 1 y 99) y el usuario tiene que sumarlos. La
		 * aplicación le pedirá al usuario que introduzca el resultado de la suma. La
		 * aplicación le indicará si el resultado es correcto o no.
		 * 
		 */

		// Variable para generar dos numeros aleatorios entre 1 y 100, 100 no incluido
		Random rand = new Random();

		int numRandom1 = rand.nextInt(1, 100);
		int numRandom2 = rand.nextInt(1, 100);

		// Variable para introducir el resultado de la suma
		int resultado;

		// Variable para sumar los 2 numeros aleatorios
		int suma = numRandom1 + numRandom2;

		// Creamos el escaner
		Scanner sc = new Scanner(System.in);

		// Mostramos los 2 numeros generados aleatoriamente y pedimos el resultado de la
		// suma
		System.out.println("Cuanto es la suma de: " + numRandom1 + " + " + numRandom1);
		resultado = sc.nextInt();

		// Comprobamos si el resultado introducido es correcto
		if (resultado == suma) {
			System.out.println("Su resultado es correcto");
		} else {
			System.out.println("Intentelo de nuevo");
		}

		// Cerramos el escaner
		sc.close();
	}

}
