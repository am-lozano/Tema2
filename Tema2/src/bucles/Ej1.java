package bucles;

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

		// variables para los valores de la hora
		int horas;
		int minutos;
		int segundos;

		// variable para almacenar la cantidad de segundos a sumar
		int suma;
		
		String resultado = "";

		// variable para contar las iteraciones
		int iteraciones = 1;

		// creamos un Scanner
		Scanner sc = new Scanner(System.in);

		
		do {
			// pedimos las horas
			System.out.println("Introduzca las horas:");
			horas = sc.nextInt();
			
		} while (horas < 0 || horas > 24);

		
		do {
			// pedimos los minutos
			System.out.println("Introduzca los minutos");
			minutos = sc.nextInt();
			
		} while (minutos < 0 || minutos > 60);
		
		
		do {
			// pedimos los segundos
			System.out.println("Introduzca los segundos:");
			segundos = sc.nextInt();
			
		} while (segundos < 0 || segundos > 60);

		
		do {
			// pedimos los segundos a incrementar
			System.out.println("Introduzca los segundos que quiera sumar:");
			suma = sc.nextInt();
			
		} while (suma < 0);

		/*
		 * Creamos un bucle for para ir sumando 1 a los segundos hasta que sea mayor que
		 * el numero de segundos que se quieran sumar
		 */
		for (int i = 1; iteraciones <= suma; iteraciones++) {

			// sumamos e igualamos i a los segundos
			segundos += i;

			if (segundos >= 60) { // si los segundos son 60 "reseteamos" el contador
				segundos = 0;
				minutos += 1;
			}

			if (minutos == 60) { // si los minutos son 60 "reseteamos" el contador
				minutos = 0;
				horas += 1;
			}

			if (horas == 24) { // si las horas son 24 "reseteamos" el contador
				horas = 0;
			}
		}

		// mostramos el resultado
		resultado += (horas < 10 ? "0" : "") + horas + ":";
		resultado += (minutos < 10 ? "0" : "") + minutos + ":";
		resultado += (segundos < 10 ? "0" : "") + segundos;
		
		System.out.println(resultado);

		// cerramos el escaner
		sc.close();

	}

}
