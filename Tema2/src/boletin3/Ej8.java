package boletin3;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {

		/*
		 * Pedir al usuario el número de un mes y el año (comprobando si es o no
		 * bisiesto). Debe imprimir por pantalla el número de días que tiene el mes.
		 */

		//Variable para guardar el año
		int ano;
		
		//Variable para guardar el mes
		int mes;
		
		//Creamos el escaner
		Scanner sc = new Scanner (System.in);
		
		//Pedimos el año
		System.out.println("Introduzca el año:");
		ano = sc.nextInt();
		
		//Pedimos el mes
		System.out.println("Introduzca el mes:");
		mes = sc.nextInt();
		
		//Comprobamos si el año es bisiesto
		if (ano % 4 ==0) {
            if (ano % 100 != 0) {
                if (ano % 400 == 0) {
                	switch (mes) {
        			case 1:
        				System.out.println("Su mes tiene 31 dias");
        				break;
        			case 2:
        				System.out.println("Su mes tiene 29 dias");
        				break;
        			case 3:
        				System.out.println("Su mes tiene 31 dias");
        				break;
        			case 4:
        				System.out.println("Su mes tiene 30 dias");
        				break;
        			case 5:
        				System.out.println("Su mes tiene 31 dias");
        				break;
        			case 6:
        				System.out.println("Su mes tiene 30 dias");
        				break;
        			case 7:
        				System.out.println("Su mes tiene 31 dias");
        				break;
        			case 8:
        				System.out.println("Su mes tiene 31 dias");
        			case 9:
        				System.out.println("Su mes tiene 30 dias");
        				break;
        			case 10:
        				System.out.println("Su mes tiene 31 dias");
        				break;
        			case 11:
        				System.out.println("Su mes tiene 30 dias");
        				break;
        			case 12:
        				System.out.println("Su mes tiene 31 dias");
        				break;
                	}
                } else {
                	switch (mes) {
        			case 1:
        				System.out.println("Su mes tiene 31 dias");
        				break;
        			case 2:
        				System.out.println("Su mes tiene 28 dias");
        				break;
        			case 3:
        				System.out.println("Su mes tiene 31 dias");
        				break;
        			case 4:
        				System.out.println("Su mes tiene 30 dias");
        				break;
        			case 5:
        				System.out.println("Su mes tiene 31 dias");
        				break;
        			case 6:
        				System.out.println("Su mes tiene 30 dias");
        				break;
        			case 7:
        				System.out.println("Su mes tiene 31 dias");
        				break;
        			case 8:
        				System.out.println("Su mes tiene 31 dias");
        			case 9:
        				System.out.println("Su mes tiene 30 dias");
        				break;
        			case 10:
        				System.out.println("Su mes tiene 31 dias");
        				break;
        			case 11:
        				System.out.println("Su mes tiene 30 dias");
        				break;
        			case 12:
        				System.out.println("Su mes tiene 31 dias");
        				break;
                	}
                }
            }
        }
		
		//Cerramso el escaner
		sc.close();
		
	}

}
