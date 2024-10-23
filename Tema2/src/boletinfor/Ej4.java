package boletinfor;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {

		/*
		 * Diseñar un programa que muestre la suma de los 10 primeros números impares.
		 */

		// variable para almacenar la suma de los numeros impares
		int suma = 0;

		// creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		 for (int i = 0, numero = 1 ; i < 10 ; numero += 2,i++) {
			 
				// sumamos los numeros impares
				suma += numero;
			}
		
		// mostramos la suma
		System.out.println("La suma de los numeros impares desde 1 hasta 10 es de: " + suma);
		
		// cerramos el escaner
		sc.close();
	}

}
