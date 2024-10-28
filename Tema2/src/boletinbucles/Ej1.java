package boletinbucles;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {

		/*
		 * Escribe un programa que incremente la hora de un reloj. Se pedirán por
		 * teclado: 
		 * Hora 
		 * Minutos 
		 * Segundos 
		 * Cantidad de segundos a incrementar 
		 * La aplicación debe mostrar la nueva hora. Por ejemplo, si el usuario introduce
		 * hora=13, minutos=59 y segundos=51, y se desea incrementar en 10 segundos, el
		 * resultado a mostrar es 14:00:01.
		 */
		
		// variables para cada valor de la hora
		int horas;
		int minutos;
		int segundos;
		int suma;
		
		// variable para el numero de iteraciones
		int iteracion = 1;
		
		// creamos el escaner
		Scanner sc = new Scanner (System.in);
		
		do {
			// pedimos la hora
			System.out.println("Introduzca la hora:");
			horas = sc.nextInt();
			
		} while (horas <0 || horas >24);
		
		do {
			// pedimos la hora
			System.out.println("Introduzca los minutos:");
			minutos = sc.nextInt();
			
		} while (minutos <0 || minutos >59);
		
		do {
			// pedimos la hora
			System.out.println("Introduzca los segundos:");
			segundos = sc.nextInt();
			
		} while (segundos <0);
		
		do {
			// pedimos la hora
			System.out.println("Introduzca los segundos a incrementar:");
			suma = sc.nextInt();
			
		} while (segundos <0);
		
		for (int i = 1; iteracion <= suma; suma++) {
			
		}
		
		// cerramos el escaner
		sc.close();
		
	}

}
