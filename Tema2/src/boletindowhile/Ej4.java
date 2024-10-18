package boletindowhile;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {

		/*
		 * Realiza un programa que muestre la tabla de multiplicar de un número
		 * introducido por teclado.
		 */
		
		// variable para pedir el numero de la tabla
		int num;
		
		// variable para el valor del 1 al 10 para multiplicar por el numero elegido
		int producto = 0;
		
		// creamos el escaner
		Scanner sc = new Scanner (System.in);

		// pedimos el numero de la tabla
		System.out.println("Introduzca un numero");
		num = sc.nextInt();
		
		do {
			
			// mostramos la tabla
			System.out.println(num + " * " + producto + " = " + num*producto );
			
			producto++;
			
		} while (producto <= 10);
		
		//cerramos el escaner
		sc.close();
		
	}

}
