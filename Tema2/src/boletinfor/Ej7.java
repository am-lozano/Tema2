package boletinfor;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {

		/*
		 * Realiza un programa en java que pida un número entero positivo y nos diga si
		 * es primo o no.
		 */

		// variable para pedir el numero
		int numero;

		// variable para dividir entre el numero introducido
		int division = 1;

		// creamos el escaner
		Scanner sc = new Scanner(System.in);

		// pedimos el numero
		System.out.println("Introduzca un numero entero:");
		numero = sc.nextInt();

		/*
		 * ir dividiendo el numero desde 1 hasta el mismo y si sale uno que es divisible
		 * entonces cambiar el valor de una variable buleana
		 */

		// cerramos el escaner
		sc.close();
	}

}
