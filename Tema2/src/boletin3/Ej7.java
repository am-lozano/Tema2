package boletin3;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {

		/*
		 * Determinar el precio de un billete de tren, conociendo la distancia a
		 * recorrer, y sabiendo que si el número de días de estancia es superior a 7 y
		 * la distancia superior a 800 km el billete tiene una reducción del 30%. El
		 * precio por kilómetro es de 2,5€. La distancia a recorrer y el número de días
		 * de estancia los debes solicitar al usuario por teclado.
		 * 
		 */

		// Variable para numero de dias de estancia
		int estancia;

		// Variable para la distancia recorrida
		int distancia;

		// Variable para el precio del billete
		double precioBillete;

		// Variable para el descuento
		double descuento;

		// Variable para el precio final
		double precioFinal;

		// Cramos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos la distancia a recorrer y el numero de das de estancia
		System.out.println("Introduzca la distancia a recorrer:");
		distancia = sc.nextInt();

		System.out.println("Introduzca el numero de dias de estancia:");
		estancia = sc.nextInt();

		// Multiplicamos los km introducidos por el precio que tienen para calcular el
		// precio del billete
		precioBillete = distancia * 2.5;

		if (estancia > 7 && distancia > 800) { // Comprobamos si el billete cumple los requisitos para el descuento
			descuento = precioBillete * 0.3;
			precioFinal = precioBillete - descuento;
			System.out.println("El precio de su billete es de:" + precioFinal);
		} else {
			System.out.println("El precio de su billete es: " + precioBillete);
		}

		// Cerramos el escaner
		sc.close();
	}

}
