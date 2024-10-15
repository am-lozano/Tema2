package boletinswitch;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {

		/*
		 * Pedir una nota entera de 0 a 10 y mostrarla de la siguiente forma:
		 * insuficiente (de 0 a 4), suficiente (5), bien (6), notable (7 y 8) y
		 * sobresaliente (9 y 10).
		 */

		// Variable para la nota
		int nota;

//		String notaCadena;
		
		// Creamos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos la nota
		System.out.println("Introduzca su nota:");
		nota = sc.nextInt();

		// Creamos el switch
//		notaCadena = switch (nota) {

		switch (nota) {
		case 0, 1, 2, 3, 4 -> {
			System.out.println("insuficiente");
		}
		case 5 -> {
			System.out.println("insuficiente");
		}
		case 6 -> {
			System.out.println("insuficiente");
		}
		case 7, 8 -> {
			System.out.println("insuficiente");
		}
		case 9, 10 -> {
			System.out.println("insuficiente");
		}
		default -> {
			System.out.println("Su nota no esta dentro del rango");
		}
	};

		sc.close();
	}

}
