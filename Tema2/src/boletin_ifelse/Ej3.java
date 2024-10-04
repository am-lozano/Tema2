package boletin_ifelse;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {

		/*
		 * Implementar un programa que pida por teclado un número decimal e indique si
		 * es un número casi-cero, que son aquellos, positivos o negativos, que se
		 * acercan a 0 por menos de 1 unidad, aunque curiosamente el 0 no se considera
		 * un número casi-cero. Es decir, un número casi-cero es el que se encuentra en
		 * el intervalo (-1, 1), donde se excluye el -1, el 0 y el 1.
		 */

		// Creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Variable para el numero introducido
		double num;
		
		//Pedimos el numero por teclado
		System.out.println("Introduzca su numero:");
		num = sc.nextDouble();
		
		//Comprobamos si el numero introducido es un numero casi-cero
		if ( -1 >= num || num == 0 || 1 >= num) {
			System.out.println("El numero " + num + " no es un numero casi-cero");
		
		} else {
			System.out.println("El numero " + num + " es un casi-cero");
		}

		//Cerramos el escaner
		sc.close();
		
	}

}
