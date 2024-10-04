package boletin_ifelse;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {

		/*
		 * Pedir los coeficientes de una ecuación de segundo grado y mostrar sus
		 * soluciones reales. Si no existen, habrá que indicarlo.
		 */
		
		// Creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Variable para el coeficiente de a
		double a;
		
		//Variable para el coeficiente de b
		double b;
		
		//Variable para el coeficiente de c
		double c;
		
		//Pedimos los coeficientes
		System.out.println("Introduzca el valor de a");
		a = sc.nextInt();
		
		System.out.println("Introduzca el valor de a");
		b = sc.nextInt();
		
		System.out.println("Introduzca el valor de a");
		c = sc.nextInt();
		
		
		
//		(b + Math.sqrt(b * b - 4 * a * c))/(2 * a)
//		(b - Math.sqrt(b * b - 4 * a * c))/(2 * a)
		
		
		//Cerramos el escaner
		sc.close();
	}

}
