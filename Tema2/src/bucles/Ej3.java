package bucles;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {

		/*
		 * Para dos números dados, a y b, es posible calcular el máximo común divisor
		 * (el número más grande que divide a ambos) mediante un algoritmo ineficiente
		 * pero sencillo: desde el menor de a y b, ir buscando, de forma decreciente
		 * (-1), el primer número que divide a ambos simultáneamente. Teniendo en cuenta
		 * lo que se acaba de explicar, realiza un programa que calcule el máximo común
		 * divisor de dos números.
		 * 
		 */

		// variable para almacenar los numeros pedidos
		int numero1;
		int numero2;

		// variable para saber que numero es mayor
		int numeroMayor;

		// creamos el escaner
		Scanner sc = new Scanner(System.in);

		// pedimos el primer numero
		System.out.println("Introduzca el primer numero");
		numero1 = sc.nextInt();

		// pedimos el segundo numero
		System.out.println("Introduzca el segundo numero");
		numero2 = sc.nextInt();

		if (numero1 > numero2) {
			numeroMayor = numero1;

		} else {
			numeroMayor = numero2;
		}

		for (int i = numeroMayor; i >= 1; i--) { // bucle para ir dividiendo el numero mayor entre ambos numeros hasta encontrar uno en el que no haya resto en los 2 numeros

			if (numero1 % numeroMayor == 0 && numero2 % numeroMayor == 0) { // comprobamos si es divisible por ambos numeros
				break;

			} else {
				numeroMayor--;
			}

		}

		// mostramos el resultado
		System.out.println("El M.C.D de: " + numero1 + " y " + numero2 + " es " + numeroMayor);
		
		// cerramos el escaner
		sc.close();

	}
}
