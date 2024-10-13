package boletin3;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {

		/*
		 * Escribe un programa que solicite al usuario un número entero entre 1 y 99. El
		 * programa debe mostrarlo con letras, por ejemplo, para 56 se verá: “cincuenta
		 * y seis”.
		 * 
		 */

		// Variable para el numero pedido
		int numero;

		// Variables para las decenas de los numero
		int veintes, treintas, cuarentas, cincuentas, sesentas, setentas, ochentas, noventas;

		// Creamos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos el numero
		System.out.println("Introduzca un nemero entero:");
		numero = sc.nextInt();

		if (numero >= 0 && numero <= 15) { // Como los numero del 0 al 15 no tienen un patron de letras lo escribimos a
											// mano
			switch (numero) {
			case 0:
				System.out.println("cero");
			case 1:
				System.out.println("uno");
				break;
			case 2:
				System.out.println("dos");
				break;
			case 3:
				System.out.println("tres");
				break;
			case 4:
				System.out.println("cuatro");
				break;
			case 5:
				System.out.println("cinco");
				break;
			case 6:
				System.out.println("seis");
				break;
			case 7:
				System.out.println("siete");
				break;
			case 8:
				System.out.println("ocho");
			case 9:
				System.out.println("nueve");
				break;
			case 10:
				System.out.println("diez");
				break;
			case 11:
				System.out.println("once");
				break;
			case 12:
				System.out.println("doce");
				break;
			case 13:
				System.out.println("trece");
				break;
			case 14:
				System.out.println("catorce");
				break;
			case 15:
				System.out.println("quinze");
				break;
			}
		} else if (numero >= 16 && numero < 20) {
			veintes = numero % 10;
			switch (veintes) {
			case 6:
				System.out.println("dieciseis");
			case 7:
				System.out.println("diecisiete");
				break;
			case 8:
				System.out.println("dieciocho");
				break;
			case 9:
				System.out.println("diecinueve");
				break;
			}
		} else if (numero >= 20 && numero < 30) {
			cincuentas = numero % 10;
			switch (cincuentas) {
			case 0:
				System.out.println("veinte");
			case 1:
				System.out.println("veintiuno");
				break;
			case 2:
				System.out.println("veintidos");
				break;
			case 3:
				System.out.println("veintitres");
				break;
			case 4:
				System.out.println("veinticuatro");
				break;
			case 5:
				System.out.println("veinticinco");
				break;
			case 6:
				System.out.println("veintiseis");
				break;
			case 7:
				System.out.println("veintisiete");
				break;
			case 8:
				System.out.println("veintiocho");
			case 9:
				System.out.println("veintinueve");
				break;
			}
		} else if (numero >= 30 && numero < 40) {
			treintas = numero % 10;
			switch (treintas) {
			case 0:
				System.out.println("treinta");
				break;
			case 1:
				System.out.println("treinta y uno");
				break;
			case 2:
				System.out.println("treinta y dos");
				break;
			case 3:
				System.out.println("treinta y tres");
				break;
			case 4:
				System.out.println("treinta y cuatro");
				break;
			case 5:
				System.out.println("treinta y cinco");
				break;
			case 6:
				System.out.println("treinta y seis");
				break;
			case 7:
				System.out.println("treinta y siete");
				break;
			case 8:
				System.out.println("treinta y ocho");
			case 9:
				System.out.println("treinta y nueve");
				break;
			}
		} else if (numero >= 40 && numero < 50) {
			cuarentas = numero % 10;
			switch (cuarentas) {
			case 0:
				System.out.println("cuarenta");
			case 1:
				System.out.println("cuarenta y uno");
				break;
			case 2:
				System.out.println("cuarenta y dos");
				break;
			case 3:
				System.out.println("cuarenta y tres");
				break;
			case 4:
				System.out.println("cuarenta y cuatro");
				break;
			case 5:
				System.out.println("cuarenta y cinco");
				break;
			case 6:
				System.out.println("cuarenta y seis");
				break;
			case 7:
				System.out.println("cuarenta y siete");
				break;
			case 8:
				System.out.println("cuarenta y ocho");
			case 9:
				System.out.println("cuarenta y nueve");
				break;
			}
		} else if (numero >= 50 && numero < 60) {
			cincuentas = numero % 10;
			switch (cincuentas) {
			case 0:
				System.out.println("cincuenta");
			case 1:
				System.out.println("cincuenta y uno");
				break;
			case 2:
				System.out.println("cincuenta y dos");
				break;
			case 3:
				System.out.println("cincuenta y tres");
				break;
			case 4:
				System.out.println("cincuenta y cuatro");
				break;
			case 5:
				System.out.println("cincuenta y cinco");
				break;
			case 6:
				System.out.println("cincuenta y seis");
				break;
			case 7:
				System.out.println("cincuenta y siete");
				break;
			case 8:
				System.out.println("cincuenta y ocho");
			case 9:
				System.out.println("cincuenta y nueve");
				break;
			}
		} else if (numero >= 60 && numero < 70) {
			sesentas = numero % 10;
			switch (sesentas) {
			case 0:
				System.out.println("sesenta");
			case 1:
				System.out.println("sesenta y uno");
				break;
			case 2:
				System.out.println("sesenta y dos");
				break;
			case 3:
				System.out.println("sesenta y tres");
				break;
			case 4:
				System.out.println("sesenta y cuatro");
				break;
			case 5:
				System.out.println("sesenta y cinco");
				break;
			case 6:
				System.out.println("sesenta y seis");
				break;
			case 7:
				System.out.println("sesenta y siete");
				break;
			case 8:
				System.out.println("sesenta y ocho");
			case 9:
				System.out.println("sesenta y nueve");
				break;
			}
		} else if (numero >= 70 && numero < 80) {
			setentas = numero % 10;
			switch (setentas) {
			case 0:
				System.out.println("setenta");
			case 1:
				System.out.println("setenta y uno");
				break;
			case 2:
				System.out.println("setenta y dos");
				break;
			case 3:
				System.out.println("setenta y tres");
				break;
			case 4:
				System.out.println("setenta y cuatro");
				break;
			case 5:
				System.out.println("setenta y cinco");
				break;
			case 6:
				System.out.println("setenta y seis");
				break;
			case 7:
				System.out.println("setenta y siete");
				break;
			case 8:
				System.out.println("setenta y ocho");
			case 9:
				System.out.println("setenta y nueve");
				break;
			}
		} else if (numero >= 80 && numero < 90) {
			ochentas = numero % 10;
			switch (ochentas) {
			case 0:
				System.out.println("ochenta");
			case 1:
				System.out.println("ochenta y uno");
				break;
			case 2:
				System.out.println("ochenta y dos");
				break;
			case 3:
				System.out.println("ochenta y tres");
				break;
			case 4:
				System.out.println("ochenta y cuatro");
				break;
			case 5:
				System.out.println("ochenta y cinco");
				break;
			case 6:
				System.out.println("ochenta y seis");
				break;
			case 7:
				System.out.println("ochenta y siete");
				break;
			case 8:
				System.out.println("cuarenta y ocho");
			case 9:
				System.out.println("cuarenta y nueve");
				break;
			}
		} else if (numero >= 90 && numero < 100) {
			noventas = numero % 10;
			switch (noventas) {
			case 0:
				System.out.println("noventa");
			case 1:
				System.out.println("noventa y uno");
				break;
			case 2:
				System.out.println("noventa y dos");
				break;
			case 3:
				System.out.println("noventa y tres");
				break;
			case 4:
				System.out.println("noventa y cuatro");
				break;
			case 5:
				System.out.println("noventa y cinco");
				break;
			case 6:
				System.out.println("noventa y seis");
				break;
			case 7:
				System.out.println("noventa y siete");
				break;
			case 8:
				System.out.println("noventa y ocho");
			case 9:
				System.out.println("noventa y nueve");
				break;
			}
		}

		System.out.println("");

		// Cerramos el escaner
		sc.close();
	}

}
