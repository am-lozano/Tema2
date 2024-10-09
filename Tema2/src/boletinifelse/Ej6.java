package boletinifelse;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {

		/*
		 * Pedir los coeficientes de una ecuación de segundo grado y mostrar sus
		 * soluciones reales. Si no existen, habrá que indicarlo.
		 */
		
		// Creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Variable para el coeficiente de a
		double incognita1;
		
		//Variable para el coeficiente de b
		double incognita2;
		
		//Variable para el coeficiente de c
		double incognita3;
		
		//Variable para lo que esta dentro de la raiz
		double discriminante;
		
		//Variable para el caso de que la incognita1 tenga valor 0
		double primerGrado;
		
		//Variable para los resultados de la ecuacion de segundo grado
		double resultadoPositivo;
		double resultadoNegativo;
		
		//Pedimos los coeficientes
		System.out.println("Introduzca el valor de a");
		incognita1 = sc.nextInt();
		
		System.out.println("Introduzca el valor de b");
		incognita2 = sc.nextInt();
		
		System.out.println("Introduzca el valor de c");
		incognita3 = sc.nextInt();		
		
		//Realizamos la ecuacion de primer grado
		primerGrado = -incognita3 / incognita2;
		
		//Creamos el if
		if (incognita1 == 0) {
			System.out.println("Su ecucacion es una ecucacion de primer grado, cuya solucion es: " + primerGrado);
		}else {
			discriminante = incognita2 * incognita2 - 4 * incognita1 * incognita3;
			
			if (discriminante <= 0) {
				System.out.println("Su ecuacion no tiene solucion real");
			} else {
				//Calculamos ambos resultados de la ecucion de segundo grado
				resultadoPositivo = (-incognita2 + Math.sqrt(discriminante)) / (2 * incognita1);
				resultadoNegativo = (-incognita2 - Math.sqrt(discriminante)) / (2 * incognita1);
				
				System.out.println("El resultado a la ecuacion es: " + resultadoPositivo + " y " + resultadoNegativo);
			}
		}
		
		//Cerramos el escaner
		sc.close();
	}

}
