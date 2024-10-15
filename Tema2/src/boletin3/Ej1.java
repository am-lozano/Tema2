package boletin3;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {

		/*
		 * Escribe una aplicación que solicite al usuario un número comprendido entre 0
		 * y 9999. La aplicación tendrá que indicar si el número introducido es capicúa.
		 * Un número es capicúa si se lee igual de izquierda a derecha que de derecha a
		 * izquierda.
		 */

		// Variable para el nuemro pedido
		int numero;
		
		//Variable para las unidades
		int unidadesDosDigitos, unidadesTresDigitos, unidadesCuatroDigitos;
		
		//Variables para las decenas
		int decenas;
		
		//Variable para las centenas
		int centenas;
		
		//Variable para las unidades de millar
		int unidadesMillar;

		// Creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos el numero
		System.out.println("Introduzca un numero entre 0 y 9999:");
		numero = sc.nextInt();

		if (numero >= 0 && numero <= 9999) { //Comprobamos que el numero introducido pertenece al rango
			if (numero >=0 && numero <10) { //Como el numero solo tiene un digito siempre va a ser capicua
				System.out.println("Su numero es capicua");
				
			} else if (numero >= 10 && numero < 100) {
				unidadesDosDigitos = numero % 10;
				decenas = numero/ 10;
				
				if (unidadesDosDigitos == decenas) {
					System.out.println("Su numero es capicua");
				} else {
					System.out.println("Su numero no es capicua");
				}
				
			} else if (numero >= 100 && numero < 1000) {
				unidadesTresDigitos = numero % 100;
				centenas = numero / 100;
				
				if (unidadesTresDigitos == centenas) {
					System.out.println("Su numero es capicua");
				} else {
					System.out.println("Su numero no es capicua");
				}
				
			}else if (numero >= 1000 && numero < 10000) {
				unidadesCuatroDigitos = numero % 1000;
				unidadesMillar = numero / 1000;
				
				int numeroSinMillar; //Variable para quitar las unidades de millar al numero
				numeroSinMillar = unidadesMillar * 1000 - numero;
				centenas = numeroSinMillar % 100;
				
				int numeroSinCentenas; //Variable para calcular las decenas al numero
				numeroSinCentenas = centenas * 100 - numeroSinMillar;
				decenas = numeroSinCentenas % 10;
				
				if (unidadesMillar == unidadesCuatroDigitos && centenas == decenas) {
					System.out.println("Su numero es capicua");
				} else {
					System.out.println("Su numero no es capicua");
				}
			}
		} else {
			System.out.println("Su numero no pertenece al rango establecido, intentelo de nuevo");
		}

		
		//Cerramos el escaner
		sc.close();
	}

}
