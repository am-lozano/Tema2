package boletin3;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {

		/*
		 * Utiliza un operador ternario para calcular el valor absoluto de un número que
		 * se solicita al usuario por teclado.
		 * 
		 */
		
		//Variable para el numero pedido al usuario
		int numero;
		
		//Variable para hacer el numero positivo en caso de ser negativo
		int negativo;
		
		//Creamos el escaner
		Scanner sc = new Scanner (System.in);
		
		//Pedimos el numero al usuario
		System.out.println("Introduzca un numero entero:");
		numero = sc.nextInt();
		
		//Comprobamos si el numero es poositivo o negativo
		
		if (numero >= 0) { //Si el numero >= a 0 el valor absoluto es el mismo numero
			System.out.println("El valor absoluto de " + numero + " es: " + numero );
		} else { //En caso de ser negativo el numero introducido tendremos que hacelo positivo
			negativo = numero * -1;
			System.out.println("El valor absoluto de " + numero + " es: " + negativo );
		}

		//Cerramos el escaner
		sc.close();

	}

}
