package boletinfor;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {

		/*
		 * Pedir diez números por teclado y mostrar la media.
		 */
		
		// variable para almacenar el numero pedido
		int numero;
		
		// variable para almacenar la suma de los numeros introducidos
		int suma = 0;
		
		// creamos el escaner
		Scanner sc = new Scanner (System.in);
		
		for (int i = 1; i <= 10; i++) {
			
			// pedimos el numero
			System.out.println("Introduzca un numero");
			numero = sc.nextInt();
			
			// sumamos los numeros introducidos
			suma += numero;
		}
		
		// mostramos la media
		System.out.println("La media de los 10 numeros introducidos es: " + (double) suma/10);
		
		// cerramos el escaner
		sc.close();
	}

}
