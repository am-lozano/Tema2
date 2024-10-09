package boletinifelse;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {

		/*
		 * Escribir una aplicación que indique cuántas cifras tiene un número
		 * introducido por teclado, que está comprendido entre 0 y 99999.
		 */
		
		//Variable para el numero
		int num;
		
		//Creamos el escaner
		Scanner sc = new Scanner (System.in);
		
		//Pedimos el numero
		System.out.println("Introduzca un numero entre 0 y 99999:");
		num = sc.nextInt();
		
		//Creamos el if
		if (num < 0) {
			System.out.println("Su numero no esta comprendido en el rango");
		} else if(num >= 0 && num < 10) {
			System.out.println("Su numero tiene 1 cifra");
		} else if (num >= 10 && num <100) {
			System.out.println("Su numero tiene 2 cifras");
		} else if (num >= 100 && num <1000) {
			System.out.println("Su numero tiene 3 cifras");
		} else if (num >= 1000 && num <10000) {
			System.out.println("Su numero tiene 4 cifras");
		} else if (num >= 10000 && num <100000) {
			System.out.println("Su numero tiene 5 cifras");
		} else {
			System.out.println("Su numero no esta comprendido en el rango");
		}
		
		//Cerramos el escaner
		sc.close();
	}

}
