package boletinifelse;

import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {

		/*
		 * Escribir un programa que simule el juego de PIEDRA, PAPEL, TIJERA, pidiendo a
		 * cada jugador que escriba PIEDRA, PAPEL o TIJERA. El juego debe mostrar por
		 * pantalla quién ha ganado el juego tras jugar una partida. Hay que contemplar
		 * el caso de que empaten.
		 * 
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

		// Turno del jugador 1
		System.out.println("Jugador 1: Eliga piedra, papel o tijeras");
		jugador1 = sc.next();

		// Turno del jugador 2
		System.out.println("Jugador 2: Eliga piedra, papel o tijeras");
		jugador2 = sc.next();

		//Comprobamos que ambos jugadores introduzcan una opcion valida
		if (!jugador1.equalsIgnoreCase(PIEDRA) && !jugador1.equalsIgnoreCase(PAPEL)
				&& !jugador1.equalsIgnoreCase(TIJERAS)
				|| !jugador2.equalsIgnoreCase(PIEDRA) && !jugador2.equalsIgnoreCase(PAPEL)
						&& !jugador2.equalsIgnoreCase(TIJERAS)) {
			System.out.println("ERROR\nAmbos jugadores deben elegir entre PIEDRA, PAPEL o TIJERAS.");
		} else {
			if (jugador1.equalsIgnoreCase(jugador2)) {
				System.out.println("Empate");
			} else if (jugador1.equalsIgnoreCase(PIEDRA) && jugador2.equalsIgnoreCase(TIJERAS)
					|| jugador1.equalsIgnoreCase(PAPEL) && jugador2.equalsIgnoreCase(PIEDRA)
					|| jugador1.equalsIgnoreCase(TIJERAS) && jugador2.equalsIgnoreCase(PAPEL)) {
				System.out.println("¡Player 1 win!");
			} else {
				System.out.println("¡Player 2 win!");
			}
		}

		// Cerramos el Scanner
		sc.close();
	}

}
