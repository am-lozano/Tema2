package boletinbucles;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {

		/*
		 * Escribe un programa que incremente la hora de un reloj. Se pedirán por
		 * teclado: Hora Minutos Segundos Cantidad de segundos a incrementar La
		 * aplicación debe mostrar la nueva hora. Por ejemplo, si el usuario introduce
		 * hora=13, minutos=59 y segundos=51, y se desea incrementar en 10 segundos, el
		 * resultado a mostrar es 14:00:01.
		 */

		// Variable para las horas
		int horas;

		// Variable para los minutos
		int minutos;

		// Variable para los segundos
		int segundos;

		// variable para terminar el programa
		boolean salir = true;

		// Creamos el escaner
		Scanner sc = new Scanner(System.in);

		do {

			// Pedimos las horas, minutos y segundos
			System.out.println("Introduzca las horas:");
			horas = sc.nextInt();

			System.out.println("Introduzca los minutos:");
			minutos = sc.nextInt();

			System.out.println("Introduzca los segundos:");
			segundos = sc.nextInt();

			if (horas >= 25) {
				salir = false;
			}

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

					// Mostramos el resultado
					System.out.println("Su horas tras incrementar 1 segundo es: " + horas + "h " + minutos + "min "
							+ segundos + "s");
				}
			}
		} while (!salir);

		sc.close();

	}

}
