package boletinwhile;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {

		/*
		 * Escribe un algoritmo que pida al usuario 10 números enteros (pueden ser
		 * positivos, negativos o cero). Cuando acabe de insertar los números, el
		 * algoritmo debe mostrar la suma de los números positivos, la media de los
		 * números negativos y el número de ceros que ha introducido el usuario.
		 * 
		 */

		// pedimos el nuemero
		int numero;

		// Creamos una variable para ir sumando los numeros positivos
		int sumaPositivos = 0;

		// variable para ir sumando los numeros negativos
		int sumaNegativos = 0;

		// variable para contar los numero negativos
		int contadorNegativos = 0;

		// variable para contar los ceros introducidos
		int contadorCeros = 0;

		// variable para contar los numeros introducidos
		int contadorNumerosTotales = 1;

		// creamos el escaner
		Scanner sc = new Scanner(System.in);

		// creamos un while para contar que solo se introduzcan 10 numeros
		while (contadorNumerosTotales <= 10) {

			// pedimos el numero
			System.out.println("Introduzca un numero");
			numero = sc.nextInt();

			if (numero > 0) {
				sumaPositivos += numero;
			} else if (numero < 0) {
				sumaNegativos += numero;
				contadorNegativos++;
			} else {
				contadorCeros++;
			}

			// sumamos 1 al contador de los numeros introducidos
			contadorNumerosTotales++;
		}
		
		
		System.out.println("La suma de los numeros positivos es: " + sumaPositivos);
		
		
		System.out.println(contadorNegativos == 0 ? "No se ha introducido ningun numero negativo"
				: "La media de los numeros negativos es: " + (double) sumaNegativos / contadorNegativos);
		
		System.out.println("Ha introducido la cantidad de: " + contadorCeros + " numeros ceros");
		
		// cerramos el escaner
		sc.close();

	}

}
