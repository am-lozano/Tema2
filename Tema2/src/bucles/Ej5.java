package bucles;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {

		// variable para pedir el numero
		int numero;

		int contador;

		// creamos el escaner
		Scanner sc = new Scanner(System.in);

		do { // bucle para volver a pedir el numero en caso de no estar en el rango

			// pedimos el numero
			System.out.println("Introduzca un numero:");
			numero = sc.nextInt();

		} while (numero < 1 || numero > 20);

		for (int i = 1; i <= numero; i++) {

			System.out.println();
			contador = 1;

			for (int j = i; j >= contador; contador++) {

				System.out.print(j);

			}

		}

		// cerramos el escaner
		sc.close();

	}

}
