package boletinfor;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {

		/*
		 * Realiza un programa que pida dos números enteros A y B. Luego visualiza los
		 * números que hay entre A y B. Si A es menor que B, entonces debe mostrar los
		 * números desde A hasta B. Si B es menor que A, entonces debe mostrar los
		 * números desde B hasta A.
		 * 
		 */

		// variable para almacenar el numero pedido
		int numeroA;
		int numeroB;

		// creamos el escaner
		Scanner sc = new Scanner(System.in);

		// pedimos el numero
		System.out.println("Introduzca un numero:");
		numeroA = sc.nextInt();
		
		// pedimos el otro numero
		System.out.println("Introduzca un numero:");
		numeroB = sc.nextInt();

		if (numeroA < numeroB) {
			for (int i = numeroA; i <= numeroB; i++) {
				System.out.println(i);
			}
		} else {
			for (int j = numeroA, contador = numeroB; j >= numeroB; j--, numeroB++) {
				System.out.println(numeroB);
			}
		}

		// cerramos el escaner
		sc.close();

	}

}
