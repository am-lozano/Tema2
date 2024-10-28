package bucles;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {

		/*
		 * De forma similar a la actividad 4, realiza un programa que calcule el mínimo
		 * común múltiplo de dos números dados. En este caso, habrá que partir del
		 * máximo de los dos e ir incrementando hasta encontrar el primer número que sea
		 * múltiplo de los dos números.
		 * 
		 */
		
		int numero1;
		int numero2;

		// variable para saber que numero es menor
		int numeroMenor;

		// creamos el escaner
		Scanner sc = new Scanner(System.in);

		// pedimos el primer numero
		System.out.println("Introduzca el primer numero");
		numero1 = sc.nextInt();

		// pedimos el segundo numero
		System.out.println("Introduzca el segundo numero");
		numero2 = sc.nextInt();

		if (numero1 > numero2) {
			numeroMenor = numero2;

		} else {
			numeroMenor = numero1;
		}

		for (int i = numeroMenor; ; i++) { // bucle para ir dividiendo el numero menor entre ambos numeros hasta encontrar uno en el que no haya resto en los 2 numeros

			if (numero1 % numeroMenor == 0 && numero2 % numeroMenor == 0) { // comprobamos si es divisible por ambos numeros
				break;

			} else {
				numeroMenor--;
			}

		}

		// mostramos el resultado
		System.out.println("El M.C.M de: " + numero1 + " y " + numero2 + " es " + numeroMenor);
		
		// cerramos el escaner
		sc.close();

	}

}
