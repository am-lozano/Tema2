package boletindowhile;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {

		/*
		 * Repetir el juego de PIEDRA - PAPEL - TIJERA pero con las siguientes
		 * consideraciones:
		 * 
		 * Al jugador 1 se le pedirá que introduzca una opción válida: PIEDRA, PAPEL o
		 * TIJERA. Mientras no introduzca un valor válido se le seguirá preguntando.
		 * 
		 * Al jugador 2 se le pedirá que introduzca una opción válida: PIEDRA, PAPEL o
		 * TIJERA. Mientras no introduzca un valor válido se le seguirá preguntando.
		 * 
		 * Al terminar una partida se preguntará si se quiere seguir jugando. Mientras
		 * se pulse “S” se volverá a iniciar la partida.
		 */

		// Constantes para las distintas opciones
		final String PIEDRA = "PIEDRA";
		final String PAPEL = "PAPEL";
		final String TIJERAS = "TIJERAS";

		// Variables para las opciones elegidas por los jugadores
		String jugador1;
		String jugador2;

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		do {
			// pedimos la jugada al jugador 1
			System.out.println("Jugador 1: Eliga piedra, papel o tijeras");
			jugador1 = sc.next();
		} while (!jugador1.equalsIgnoreCase(PIEDRA) && !jugador1.equalsIgnoreCase(PAPEL)
				&& !jugador1.equalsIgnoreCase(TIJERAS));
		
		System.out.println("Jugada del jugador 1: " + jugador1);
		System.out.println();
		
		do {
			// pedimos la jugada al jugador 2
			System.out.println("Jugador 2: Eliga piedra, papel o tijeras");
			jugador2 = sc.next();
		} while (!jugador2.equalsIgnoreCase(PIEDRA) && !jugador2.equalsIgnoreCase(PAPEL)
				&& !jugador2.equalsIgnoreCase(TIJERAS));
		
		System.out.println("Jugada del jugador 2: " + jugador2);
		System.out.println();
		
			if (jugador1.equalsIgnoreCase(jugador2)) {
				System.out.println("Empate");
			} else if (jugador1.equalsIgnoreCase(PIEDRA) && jugador2.equalsIgnoreCase(TIJERAS)
					|| jugador1.equalsIgnoreCase(PAPEL) && jugador2.equalsIgnoreCase(PIEDRA)
					|| jugador1.equalsIgnoreCase(TIJERAS) && jugador2.equalsIgnoreCase(PAPEL)) {
				System.out.println("¡Player 1 win!");
			} else {
				System.out.println("¡Player 2 win!");
			}

		// Cerramos el Scanner
		sc.close();

	}

}
