package boletindowhile;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {

		/*
		 * Realiza un programa que sume los números desde el 1 hasta un número N que se
		 * introducirá por teclado. Si el usuario introduce un 5, el programa debe
		 * devolver la suma de 1+2+3+4+5.
		 */

		// variable para el valor inicial de la suma
		int inicio = 1;

		// variable para pedir el valor del numero maximo
		int numero;

		// variable para ir sumando valores hasta el valor maximo introducido por el
		// usuario
		int sumatorio = 2;

		// creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		// pedimos el numero maximo
		System.out.println("Introduzca un numero maximo de la suma:");
		numero = sc.nextInt();

		do {
			
			//mostramos la suma
			System.out.println(inicio + sumatorio);
			
			sumatorio++;
		}
		while (numero <= sumatorio);
		
		// cerramos el escaner
		sc.close();

	}

}
