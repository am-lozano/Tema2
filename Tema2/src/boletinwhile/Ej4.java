package boletinwhile;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {

		/*
		 * Escribe un algoritmo que pida al usuario 10 números enteros (pueden ser
		 * positivos, negativos o cero). Cuando acabe de insertar los números, el
		 * algoritmo debe mostrar la suma de los números positivos, la media de los
		 * números negativos y el número de ceros que ha introducido el usuario.
		 * 
		 */
		
		//pedimos el nuemero
		int numero;
		
		//Creamos una variable para ir sumando los numeros positivos
		int sumaPositivos = 0;
		
		//variable para ir sumando los numeros negativos
		int sumaNegativos = 0;
		
		//variable para contar los numero negativos
		int contadorNegativos = 0;
		
		//variable para hacer la media de los numeros negativos
		double mediaNegativos;
		
		//variable para contar los ceros introducidos
		int contadorCeros = 0;
		
		//variable para contar los numeros introducidos
		int contadorNumerosTotales = 0;
		
		//creamos el escaner
		Scanner sc = new Scanner (System.in);
		
		//pedimos el numero
		System.out.println("Introduzca un numero");
		numero = sc.nextInt();
		
		//creamos un while para contar que solo se introduzcan 10 numeros
		while (contadorNumerosTotales>=0 && contadorNumerosTotales<=10) {
			
			contadorNumerosTotales++;
		
		//Creamos el bucle para sumar los numeros positivos
		while (numero >0) {
			
			//Sumamos el valor anterior a la variable suma, cuyo valor inicial es 0
			sumaPositivos = sumaPositivos + numero;
			
			System.out.println("La suma de sus numeros es de:" + sumaPositivos);
			
			System.out.println("Introduzca un numero:");
			numero = sc.nextInt();
		}
		
		//Creamos el bucle para la media de los numeros negativos
				while (numero<0) {
					
					//sumamos 1 a cada vez que se introduce un numero positivo
					contadorNegativos++;
					
					//Sumamos el valor anterior a la variable suma, cuyo valor inicial es 0
					sumaNegativos = sumaNegativos + numero;
					
					//hacemos la media de los numeros introducidos hasta el momento
					//suma = suma de los numeros introducidos hasta el momento y contador = contador de los numeros introducidos
					mediaNegativos = (double) sumaNegativos/contadorNegativos;
					
					System.out.println("La media de sus numeros hasta el momento es de: " + mediaNegativos);
					
					System.out.println("Introduzca un numero:");
					numero = sc.nextInt();
					
				}
				
				//creamos el buchle para contar los ceros introducidos
				while (numero == 0) {
					contadorCeros++;
					
					System.out.println("Introduzca un numero:");
					numero = sc.nextInt();
				}
		}
		
		//cerramos el escaner
		sc.close();
		
	}

}
