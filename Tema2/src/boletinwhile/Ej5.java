package boletinwhile;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {

		/*
		 * Implementar una aplicación para calcular datos estadísticos de las edades de
		 * los alumnos de un centro educativo. Se introducirán datos hasta que uno de
		 * ellos sea negativo, y se mostrará: la suma de todas las edades introducidas,
		 * la media, el número de alumnos y cuántos son mayores de edad.
		 * 
		 * media mayores de edad
		 */

		// variable para almcenar la edad
		int edad;

		// variable para sumar las edades introducidas
		int suma = 0;

		// variable para contar el numero de edades introducidas
		int contador = 0;

		// variable para contar cuantos alumnos son mayores de edad
		int mayorEdad = 0;

		// creamos el escaner
		Scanner sc = new Scanner(System.in);

		// pedimos la edad
		System.out.println("Introduzca la edad:");
		edad = sc.nextInt();

		while (edad > 0) {

			suma += edad;

			contador++;

			if (edad >= 18) {
				mayorEdad++;
			}
			
			System.out.println("Introduzca la edad:");
			edad = sc.nextInt();
		}

		System.out.println("La suma de las edades introducidas es de: " + suma);
		System.out.println("La media de las edades introducidas es de: " + (double) suma / contador);
		System.out.println("Hay: " + contador + " alumnos");
		System.out.println("Hay: " + mayorEdad + " alumnos mayores de edad");

		// cerramos el escaner
		sc.close();
	}

}
