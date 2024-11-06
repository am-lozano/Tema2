package bucles;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {

		/*
		 * Realiza un programa que lea y acepte únicamente aquellos que sean mayores que
		 * el último dado. La introducción de números finaliza con la introducción de un
		 * 0. Al final se mostrará:
		 * 
		 * El total de números introducidos, excluido el 0. El total de números
		 * fallados.
		 */

		// variable para almacenar el numero
		int numero;

		// variable para contar los numeros fallados
		int fallos = 0;

		// variable para guardar el numero en caso de ser mayor al anterior
		int ultimoNumero;

		// variable para contar la cantidad de numeros introducidos
		int contador = 0;

		// creamos el escaner
		Scanner sc = new Scanner(System.in);

		// pedimos el numero
		System.out.println("Introduzca un numero inicial:");
		numero = sc.nextInt();

		ultimoNumero = numero;

		while (numero != 0) {

			contador++;

			if (numero < ultimoNumero) {

				System.err.println("Fallo es menor");

				fallos++;

			}

			System.out.println("Introduzca un numero:");
			numero = sc.nextInt();

		}

		System.out.println();
		System.out.println(contador);
		System.out.println(fallos);

		// cerramos el escaner
		sc.close();

	}

}
