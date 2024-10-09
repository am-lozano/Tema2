package boletinifelse;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {

		/*
		 * Escribir una aplicación que pida al usuario un número real y muestre por
		 * pantalla la nota del alumno, teniendo en cuenta: 
		 * [0-5) es INSUFICIENTE (0 inclusive) 
		 * [5-6) es SUFICIENTE (5 inclusive) 
		 * [6-7) es BIEN (6 inclusive)
		 * [7-9) es NOTABLE (7 inclusive) 
		 * [9-10] es SOBRESALIENTE (9 y 10 inclusives)
		 * 
		 */
		
		//Variable para la nota
		double nota;
		
		//Creamos el escaner
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca su nota:");
		nota = sc.nextDouble();
		
		if (nota >= 0 && nota < 5 ) {
			System.out.println("Su nota " + nota + " es un insuficiente");
		} else if (nota >= 5 && nota < 6 ) {
			System.out.println("Su nota " + nota + " es un suficiente");
		} else if (nota >= 6 && nota < 7 ) {
			System.out.println("Su nota " + nota + " es un bien");
		} else if (nota >= 7 && nota < 9 ) {
			System.out.println("Su nota " + nota + " es un notable");
		}else if (nota >= 9 && nota <= 10 ) {
			System.out.println("Su nota " + nota + " es un sobresaliente");
		} else {
			System.out.println("Su nota no es correcta");
		}
		
		//Cerramos el escaner
		sc.close();
	}

}
