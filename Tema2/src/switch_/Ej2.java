package switch_;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {

		/*
		 * Idear un programa que solicite al usuario un número comprendido entre 1 y 7,
		 * correspondiente a un día de la semana. Se debe mostrar el nombre del día de
		 * la semana al que corresponde. Por ejemplo, el número 1 corresponde a “Lunes”
		 * y el 6 a “Sábado”.
		 */

		// Variable para el numero del dia de la semana
		int dia;

		// Creamos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos el dia
		System.out.println("Introduzca el numero del dia de la semana:");
		dia = sc.nextInt();

		// Creamos el switch
		switch (dia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Su numero no corresponde a ningun dia de la semana");
			break;
		}

		sc.close();

	}

}
