package boletinwhile;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {

		/*
		 * Escribe un programa que vaya pidiendo al usuario números enteros positivos
		 * que debe ir contando. Cuando el usuario no quiera insertar más números,
		 * introducirá un número negativo y el algoritmo, antes de acabar, mostrará la
		 * cantidad de números positivos introducidos por el usuario.
		 */

		//variable para guardar el numero pedido
		int numero;
		
		//variable para llevar el contador de los numeros introducido
		int contador = 0;
		
		//creamos el escaner
		Scanner sc = new Scanner (System.in);
		
		//pedimos el numero
		System.out.println("Introduzca un numero:");
		numero = sc.nextInt();
		
		//creamos el bucle
		while (numero>0) {
			
			//sumamos 1 a la variable contador cada vez que el numero entre en el bucle para contarlo
			contador++;
			System.out.println("Contador de numeros intrtoducidos: " + contador);
			
			//volvemos a pedir el numero
			System.out.println("Introduzca un numero:");
			numero = sc.nextInt();
			
		}
		
		System.out.println("Como se ha introducido un numero negativo el programa finaliza, ha introducido un total de " + contador + " numeros");
		
		//cerramos el escaner
		sc.close();
		
	}

}
