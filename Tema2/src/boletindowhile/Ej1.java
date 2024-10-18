package boletindowhile;

public class Ej1 {

	public static void main(String[] args) {

		/*
		 * Realiza un programa que muestre por pantalla los 20 primeros números
		 * naturales (1, 2, 3... 20).
		 */

		// variable para el primer numero
		int numero = 1;

		do {
			System.out.println(numero);
			numero++; // sumamos 1 a la variable numero
		}
		// bucle para mostrar los numeros desde el numero inicial, elegido por la
		// variable, hasta 20
		while (numero <= 20);
	}
}
