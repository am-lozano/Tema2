package boletinwhile;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {

		/*
		 * Escribe un programa que vaya pidiendo al usuario números enteros positivos
		 * que debe ir sumando. Cuando el usuario no quiera insertar más números,
		 * introducirá un número negativo y el algoritmo, antes de acabar, mostrará la
		 * suma de los números positivos introducidos por el usuario.
		 * 
		 */
		
		//Variable para guardar el numero
		int num;
		
		//Creamos una variable para ir sumando los numeros pedidos
		int suma = 0;
		
		//Creamos el escaner
		Scanner sc = new Scanner (System.in);
		
		//Pedimos el numero
		System.out.println("Introduzca un numero:");
		num = sc.nextInt();
		
		//Creamos el bucle while
		while (num >0) {
			
			//Sumamos el valor anterior a la variable suma, cuyo valor inicial es 0
			suma += num;
			
			System.out.println("Introduzca un numero:");
			num = sc.nextInt();
		}
		
		//Mostramos la suma
		System.out.println("La suma de sus numeros es de: " + suma);
		
		//Cerramos el escaner
		sc.close();
		
	}

}
