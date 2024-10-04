package boletin_ifelse;

import java.util.Scanner;

public class Ej1 {
	
	public static void main(String[] args) {
		
		//Variable para almacenar el primer numero
		int n;
		
		//Variable para coprobar si el numero es par o impar
		 int parOImpar;
		 
		//Creamos el escaner
		Scanner sc = new Scanner (System.in);
		
		//Pedimos los numeros
		System.out.println("Introduzca el primer numero, sin parte decimal:");
		n = sc.nextInt();
		
		//Comprobamos si los numeros son par o impar
		parOImpar = n % 2;
		
		
		//Comprobamos si el numero 1 es par o impar
		if (parOImpar == 0) {
			System.out.println("El num " + n + "es par");
	} else {
		System.out.println("El num " + n + " es impar");

	}
		//Cerramos escaner
		sc.close();
}
}
