package boletindowhile;

import java.util.Random;
import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {

		/*
		 * Realiza un programa donde el usuario "piensa" un número del 1 al 100 y el
		 * ordenador intenta adivinarlo. Es decir, el ordenador irá proponiendo números
		 * una y otra vez hasta adivinarlo (el usuario deberá indicarle al ordenador si
		 * es mayor, menor o igual al número que ha pensado).
		 * 
		 */

		// variable para el numero "pensado" por el usuario
		int numero;

		// creamos el escaner
		Scanner sc = new Scanner(System.in);

		// generamos un numero random entre 1 y 100
		Random rand = new Random();
		int random = rand.nextInt(1, 101);

		// pedimos el numero
		System.out.println("Introduzca un numero:");
		numero = sc.nextInt();
		
		do {
			
			random = rand.nextInt(1, 101);
			System.out.println(random);

		} while (random != numero);

		// cerramos el escaner
		sc.close();

	}

}
