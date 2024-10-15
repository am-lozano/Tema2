package boletinwhile;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {

		/*
		 * Escribe un programa que vaya pidiendo al usuario números enteros positivos
		 * que debe ir sumando. Cuando el usuario no quiera insertar más números,
		 * introducirá un número negativo y el algoritmo, antes de acabar, mostrará la
		 * media de los números positivos introducidos por el usuario.
		 */
		
		//variable para guardar el numero
		int numero;
		
		//variable para contar los numero establecidos hasta el momento
		int contador = 0;
		
		//variable para hacer la media
		double media;
		
		//variable para ir sumando los numeros introducidos
		int suma = 0;
		
		//creamos el escaner
		Scanner sc = new Scanner (System.in);
		
		//pedimos el numero
		System.out.println("Introduzca un numero:");
		numero = sc.nextInt();
		
		//creamos el bucle
		while (numero>0) {
			
			//sumamos 1 a cada vez que se introduce un numero positivo
			contador++;
			
			//Sumamos el valor anterior a la variable suma, cuyo valor inicial es 0
			suma = suma + numero;
			
			//hacemos la media de los numeros introducidos hasta el momento
			//suma = suma de los numeros introducidos hasta el momento y contador = contador de los numeros introducidos
			media = (double) suma/contador;
			
			System.out.println("La media de sus numeros hasta el momento es de: " + media);
			
			System.out.println("Introduzca un numero:");
			numero = sc.nextInt();
			
		}
		
		//cerramos el escaner
		sc.close();

	}

}
