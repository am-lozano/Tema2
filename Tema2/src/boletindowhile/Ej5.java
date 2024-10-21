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
		
		// variable para los valores maximos y minimos del rango del numero random generado
		int minimo = 1;
		int maximo = 101;

		// creamos el escaner
		Scanner sc = new Scanner(System.in);

		// generamos un numero random entre 1 y 100
		Random rand = new Random();
		int random = rand.nextInt(minimo, maximo);
		
		// pedimos el numero
		System.out.println("Introduzca un numero:");
		numero = sc.nextInt();
		
		do {
			random = rand.nextInt(minimo, maximo);
			System.out.println(random);
			
			if (random > numero) {
				maximo = random;
				System.out.println("El numero pensado es menor");
			}
			if (random < numero) {
				minimo = numero;
				System.out.println("El numero pensado es mayor");
			}

		} while (random != numero);

		// cerramos el escaner
		sc.close();

	}

}
