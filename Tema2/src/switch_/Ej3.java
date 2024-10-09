package switch_;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {

		/*
		 * Escribe un algoritmo que le pida al usuario dos números. A continuación debe
		 * mostrar el siguiente menú por pantalla: 
		 * SUMAR LOS NÚMEROS 
		 * RESTAR LOS NÚMEROS
		 * MULTIPLICAR LOS NÚMEROS 
		 * DIVIDIR LOS NÚMEROS
		 */
		
		//Variable para el numero 1
		int numero1;
		
		//Variable para el numero 2
		int numero2;
		
		//Variable para lo que se quiere hacer con los numero
		String opcion;
		
		//Variable para la suma
		int suma;
		
		//Variable para la resta
		int resta;
		
		//Variable para la multiplicacnion
		int multiplicacion;
		
		//Variable para la division
		int division;
		
		//Creamos el escaner
		Scanner sc = new Scanner (System.in);
		
		//Pedimos el primer numero
		System.out.println("Introduzca el primer numero");
		numero1 = sc.nextInt();
		
		//Pedimos el segundo numero
		System.out.println("Introduzca el segundo numero");
		numero2 = sc.nextInt();
		
		//Pedimos que quiere hacer con los numeros introducidos
		System.out.println("Introduzca que operacion desea hacer con los numeros:");
		System.out.println("A. SUMAR LOS NÚMEROS");
		System.out.println("B. RESTAR LOS NÚMEROS");
		System.out.println("C. MULTIPLICAR LOS NÚMEROS");
		System.out.println("D. DIVIDIR LOS NÚMEROS");
		opcion = sc.next();
		
		switch (opcion) {
		case "a", "A" -> {
			suma = numero1 + numero2;
			System.out.println("La suma de sus numero es " + suma);
		}		
		case "b", "B" -> {
			resta = numero1 - numero2;
			System.out.println("La resta de sus numeros es " + resta);
		}
		case "c", "C" -> {
			multiplicacion = numero1 * numero2;
			System.out.println("La multiplicacion de sus numeros es " + multiplicacion);
		}
		case "d", "D" -> {
			division = numero1 / numero2;
			System.out.println("La division de sus numeros es " + division);
		}
		default -> {
			System.out.println("Su opcion no corresponde a ninguna operacion matematica");
		}
	};
	
	//Cerramos el escaner
	sc.close();
	}

}
