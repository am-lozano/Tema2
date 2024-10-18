package boletindowhile;

public class Ej2 {

	public static void main(String[] args) {

		/*
		 * Realiza un programa que muestre los números pares comprendidos entre el 1 y
		 * el 200.
		 */
		
		// variable para el primer numero
		int numero = 1;

		do {
			if (numero % 2 == 0)
			System.out.println(numero);
			
			numero++; // sumamos 1 a la variable numero
		}
		// bucle para mostrar los numeros desde el numero inicial, elegido por la
		// variable, hasta 20
		while (numero <= 100);

	}

}
