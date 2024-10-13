package boletin3;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {

		/*
		 * Diseña una aplicación en la que, dado un número de DNI, calcule la letra que
		 * le corresponde. Observa que un número de 8 dígitos está dentro del rango del
		 * tipo int.
		 * 
		 */

		//Variable para el numero del DNI
		int numero;
		
		//Variable para hacer la division y saber que letra corresponde
		int letra;
		
		//Creamos el escaner
		Scanner sc = new Scanner (System.in);
		
		//Pedimos el DNI
		System.out.println("Introduzca su numero de DNI:");
		numero = sc.nextInt();
		
		//Comprobamos que el numero introducido es correcto
		if (numero >= 00000000 || numero <= 99999999) {
			letra = numero % 23;
			switch (letra) { //Asignamos una letra segun el valor obtenido
			case 0:
				System.out.println("T");
			case 1:
				System.out.println("R");
				break;
			case 2:
				System.out.println("W");
				break;
			case 3:
				System.out.println("A");
				break;
			case 4:
				System.out.println("G");
				break;
			case 5:
				System.out.println("M");
				break;
			case 6:
				System.out.println("Y");
				break;
			case 7:
				System.out.println("F");
				break;
			case 8:
				System.out.println("P");
			case 9:
				System.out.println("D");
				break;
			case 10:
				System.out.println("X");
				break;
			case 11:
				System.out.println("B");
				break;
			case 12:
				System.out.println("N");
				break;
			case 13:
				System.out.println("J");
				break;
			case 14:
				System.out.println("Z");
				break;
			case 15:
				System.out.println("S");
				break;
			case 16:
				System.out.println("Q");
			case 17:
				System.out.println("V");
				break;
			case 18:
				System.out.println("H");
				break;
			case 19:
				System.out.println("L");
				break;
			case 20:
				System.out.println("C");
				break;
			case 21:
				System.out.println("K");
				break;
			case 22:
				System.out.println("E");
				break;
			}
		} else {
			System.out.println("Intentelo de nuevo");
		}
		
		//Cerramos el escaner
		sc.close();
		
	}

}
