package boletinswitch;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {

		/*
		 * Escribe un algoritmo para sumar dos tiradas de un dado de seis caras que
		 * haría el usuario. El algoritmo pregunta al usuario cuánto ha sacado en la
		 * primera tirada y el usuario le dará esa información pero en formato cadena
		 * (“UNO”, “DOS” … “SEIS”).
		 * 
		 * Después el algoritmo volverá a preguntar al usuario cuánto ha sacado en la
		 * segunda tirada y el usuario también dará esa información en formato cadena.
		 * 
		 * Por último, el algoritmo mostrará por pantalla la suma de las dos tiradas en
		 * formato numérico.
		 */

		// Variable para la primera tirada
		String tirada1;

		// Variable para la segunda tirada
		String tirada2;

		// Variable para saber que numero se introduce en la primera tirada
		int num1;

		// Variable para saber que numero se introduce en la primera tirada
		int num2;
		
		//Variable para calcular la suma de las tiradas
		int suma;

		// Variables para las opciones del dado
		final String UNO = "uno";
		final String DOS = "dos";
		final String TRES = "tres";
		final String CUATRO = "cuatro";
		final String CINCO = "cinco";
		final String SEIS = "seis";

		// Creamos el escaner
		Scanner sc = new Scanner(System.in);


		// Pedimos el resultado de la primera tirada
		System.out.println("Introduzca su primera tirada:");
		tirada1 = sc.next();

		num1 = switch (tirada1) {
		case "uno", "UNO" -> {
			yield 1;
		}
		case "dos", "DOS" -> {
			yield 2;
		}
		case "tres", "TRES" -> {
			yield 3;
		}
		case "cuatro", "CUATRO" -> {
			yield 4;
		}
		case "cinco", "CINCO" -> {
			yield 5;
		}
		case "seis", "SEIS" -> {
			yield 6;
		}
		default -> {
			System.out.println("Numero incorrecto");
			yield -1;
		}
		};
		
		System.out.println("Introduzca su segunda tirada:");
		tirada2 = sc.next();
		
		num2 = switch (tirada2) {
		case "uno", "UNO" -> {
			yield 1;
		}
		case "dos", "DOS" -> {
			yield 2;
		}
		case "tres", "TRES" -> {
			yield 3;
		}
		case "cuatro", "CUATRO" -> {
			yield 4;
		}
		case "cinco", "CINCO" -> {
			yield 5;
		}
		case "seis", "SEIS" -> {
			yield 6;
		}
		default -> {
			System.out.println("Numero incorrecto");
			yield -1;
		}
		};
		
		//Calculamos la suma de ambos resultados
		suma = num1 + num2;
		
		//Mostramos el resultado
		System.out.println("La suma de sus tiradas es: " + num1 + " + " + num2 + " es " + suma);
		
		//Cerramos el escaner
		sc.close();
	}
}
