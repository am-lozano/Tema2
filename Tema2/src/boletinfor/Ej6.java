package boletinfor;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {

		/*
		 * Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.
		 */

		// variable para pedir las notas
		double nota;

		// variable para contar el numero de suspensos
		int contador = 0;

		// creamos el escaner
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 5; i++) {

			// pedimos las notas
			System.out.println("Introduzca su nota:");
			nota = sc.nextDouble();

			if (nota < 5) {
				contador++;
			}
		}

		System.out.println(contador != 0 ? "Ha suspendido alguna asignatura" : "No ha suspendido ninguna asignatura");
		
		sc.close();
		
	}

}
