package boletindowhile;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {

		/*
		 * Repetir el ejercicio de los dados del boletín de SWITCH. Mientras en la
		 * primera tirada no se introduzca un valor válido se le seguirá preguntando. Lo
		 * mismo con la segunda tirada.
		 */

		// Variable para la primera tirada
		String tirada1;

		// Variable para la segunda tirada
		String tirada2;

		// Variable para saber que numero se introduce en la primera tirada
		int num1;

		// Variable para saber que numero se introduce en la primera tirada
		int num2;

		// Variable para calcular la suma de las tiradas
		int suma;

		// Variables para las opciones del dado
		final String UNO = "UNO";
		final String DOS = "DOS";
		final String TRES = "TRES";
		final String CUATRO = "CUATRO";
		final String CINCO = "CINCO";
		final String SEIS = "SEIS";

		// Creamos el escaner
		Scanner sc = new Scanner(System.in);

		// pedimos el resultado de la primera tirada
		System.out.println("Introduzca su primera tirada:");
		tirada1 = sc.next();

		// pedimos el resultado de la segunda tirada
		System.out.println("Introduzca su segunda tirada:");
		tirada2 = sc.next();

		do {
			//volvemos a pedir la tirada
			System.out.println("Introduzca un valor valido, introduzca su primera tirada");

			tirada1 = sc.next();
		} while (!tirada1.equalsIgnoreCase(UNO) || !tirada1.equalsIgnoreCase(DOS) || !tirada1.equalsIgnoreCase(TRES)
				|| !tirada1.equalsIgnoreCase(CUATRO) || !tirada1.equalsIgnoreCase(CINCO)
				|| !tirada1.equalsIgnoreCase(SEIS));

		do {
			// volvemos a pedir la tirada
			System.out.println("Introduzca un valor valido, introduzca su segunda tirada:");

			tirada2 = sc.next();
		} while (!tirada2.equalsIgnoreCase(UNO) || !tirada2.equalsIgnoreCase(DOS) || !tirada2.equalsIgnoreCase(TRES)
				|| !tirada2.equalsIgnoreCase(CUATRO) || !tirada2.equalsIgnoreCase(CINCO)
				|| !tirada2.equalsIgnoreCase(SEIS));

		num1 = switch (tirada1.toUpperCase()) {
		case "UNO" -> {
			yield 1;
		}
		case "DOS" -> {
			yield 2;
		}
		case "TRES" -> {
			yield 3;
		}
		case "CUATRO" -> {
			yield 4;
		}
		case "CINCO" -> {
			yield 5;
		}
		case "SEIS" -> {
			yield 6;
		}
		default -> {
			System.out.println("Numero incorrecto");
			yield -1;
		}
		};

		num2 = switch (tirada2.toUpperCase(null)) {
		case "UNO" -> {
			yield 1;
		}
		case "DOS" -> {
			yield 2;
		}
		case "TRES" -> {
			yield 3;
		}
		case "CUATRO" -> {
			yield 4;
		}
		case "CINCO" -> {
			yield 5;
		}
		case "SEIS" -> {
			yield 6;
		}
		default -> {
			System.out.println("Numero incorrecto");
			yield -1;
		}
		};

		// Calculamos la suma de ambos resultados suma = num1 + num2;

		// Mostramos el resultado
		suma = num1 + num2;
		System.out.println("La suma de sus tiradas es: " + num1 + " + " + num2 + " es " + suma);

		// Cerramos el escaner
		sc.close();

	}

}
