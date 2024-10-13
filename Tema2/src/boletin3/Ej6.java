package boletin3;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {

		/*
		 * Dada una hora por teclado, (horas, minutos y segundos) realiza un algoritmo
		 * que muestre la hora después de incrementar un segundo.
		 */

		// Variable para las horas
		int horas;

		// Variable para los minutos
		int minutos;

		// Variable para los segundos
		int segundos;

		// Creamos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos las horas, minutos y segundos
		System.out.println("Introduzca las horas:");
		horas = sc.nextInt();

		System.out.println("Introduzca los minutos:");
		minutos = sc.nextInt();

		System.out.println("Introduzca los segundos:");
		segundos = sc.nextInt();

		// Sumamos 1 segundo a la hora introducida
		segundos++;

		// Comprobamos que el tiempo introducido es correcto
		if (horas < 0 || horas > 24 || minutos < 0 || minutos > 60 || segundos < 0 || minutos > 60) {
			System.out.println("Su hora es incorrecta, intentelo de nuevo");
		}
		if (segundos == 60) { // Si los segundos son 60 sumamos 1 minuto
			segundos = 0;
			minutos++;
		}
		if (minutos == 60) {// Si los minutos son 60 sumamos 1 hora
			minutos = 0;
			horas++;
			if (horas == 24) {
				horas = 0;
				
				//Mostramos el resultado
				System.out.println("Su horas tras incrementar 1 segundo es: " + horas + "h " + minutos + "min " + segundos + "s");
			}
		}
		
		//Cerramos el escaner
		sc.close();
	}

}
