package bucles;

import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {

		/*
		 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
		 * por teclado. El número introducido debe ser mayor que 0.
		 */
		
		// variable para almacenar el numero
		int numero;
		
		// variable para contar las cifras del numero
		int contador = 0;
		
		// creamos el escaner
		Scanner sc = new Scanner (System.in);
		
		do { // pedimos el numero mientras se introduzca un valor incorrecto
			
			System.out.println("Introduzca un numero:");
			numero = sc.nextInt();
			
		} while (numero < 0);
		
		while (numero > 0) {
			
			numero /=  10;
			
			contador++;
		}
		
		System.out.println(contador);
		
		// cerramos el escaner
		sc.close();

	}

}
