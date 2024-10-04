package boletin_ifelse;

import java.util.Scanner;

public class Ej2 {
	
	public static void main(String[] args) {
		
		//Pedir dos números enteros y decir si son iguales o no.

		//Creamos el escaner
		Scanner sc = new Scanner (System.in);
		
		//Variable para el primer numero
		int n1;
		
		//Variable para el segundo numero
		int n2;
		
		//Pedimos los numeros
		System.out.println("Introduzca el primer numero entero:");
		n1 = sc.nextInt();
		
		System.out.println("Introduzca el segundo numero");
		n2 = sc.nextInt();
		
		//Comprobamos si los numeros son iguales
		if (n1 == n2) {
			System.out.println("Los numeros " + n1 + " y " + n2 + " son iguales");
		} else {
			System.out.println("Los numeros " + n1 + " y " + n2 + " son distintos");
		}
		
		//Cerramos el escaner
		sc.close();
	} 
	
}
