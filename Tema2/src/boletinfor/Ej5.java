package boletinfor;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {

		/*
		 * Pedir un número y calcular su factorial. Por ejemplo, el factorial de 5 se
		 * denota 5! y es igual a 5x4x3x2x1 = 120.
		 */

		// variable para almacenar el numero pedido
		int numero;
		
		// variable para ir multiplicando los numeros
		int factorial = 1;
		
		// creamos el escaner
		Scanner sc = new Scanner(System.in);

		// pedimos el numero
		System.out.println("Introduzca un numero:");
		numero = sc.nextInt();

		for (int i = numero; i >= 2; i--) {
			
			System.out.print(i + " x ");
			
			factorial *= i;
		}
		
		System.out.println("1 = " + factorial);

		// cerramos el escaner
		sc.close();

	}

}
