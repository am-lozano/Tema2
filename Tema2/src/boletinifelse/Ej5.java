package boletinifelse;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {

		// Pedir tres números y mostrarlos ordenados de mayor a menor

		// Creamos el escaner
		Scanner sc = new Scanner(System.in);

		// Variable para el primer numero
		int numero1;

		// Variable para el segundo numero
		int numero2;

		// Variable para el tercer numero
		int numero3;

		// Pedios el primer numero
		System.out.println("Introduzca la parte entera del primer numero:");
		numero1 = sc.nextInt();

		// Pedios el segundo numero
		System.out.println("Introduzca la parte entera del segundo numero:");
		numero2 = sc.nextInt();

		// Pedios el tercer numero
		System.out.println("Introduzca la parte entera del tercer numero:");
		numero3 = sc.nextInt();

		if ((numero1 > numero2) && (numero2 > numero3)) {
			System.out.println(numero1 + ">" + numero2 + ">" + numero3);
		} else if ((numero1 > numero3) && (numero2 > numero2)) {
			System.out.println(+numero1 + ">" + numero3 + ">" + numero2);
		} else if ((numero2 > numero1) && (numero1 > numero3)) {
			System.out.println(numero2 + ">" + numero1 + ">" + numero3);
		} else if ((numero2 > numero3) && (numero3 > numero1)) {
			System.out.println(numero2 + ">" + numero3 + ">" + numero1);
		} else if ((numero3 > numero1) && (numero1 > numero2)) {
			System.out.println(numero3 + ">" + numero1 + ">" + numero2);
		} else {
			System.out.println(numero3 + ">" + numero2 + ">" + numero1);
		}

	}

}
