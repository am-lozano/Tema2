package boletin_ifelse;

import java.util.Scanner;

public class Ej4 {
	
	public static void main(String[] args) {
		
		//Pedir dos números y mostrarlos ordenados de menor a mayor.


		//Creamos el escaner
		Scanner sc = new Scanner (System.in);
		
		//Variable para el primer numero
		int a;
		
		//Variable para el segundo numero
		int b;
		
		//Pedimos el primer numero
		System.out.println("Introduzca el primer numero, solo la parte entera:");
		a = sc.nextInt();
		
		//Pedimos el segundo numero
		System.out.println("Introduzca el segundo numero, solo la parte entera:");
		b = sc.nextInt();
		
		//Comprobamos que numero es menor y lo ponemos primero
		if (a < b) {
			System.out.println(a + ", " + b);
		} else if (a > b){
			System.out.println(b + ", " + a);
		} else {
			System.out.println("Los numeros " + a + " y " + b + " son iguales");
		}
		
	}

}
