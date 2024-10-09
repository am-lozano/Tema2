package switch_;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {

		/*
		 * Queremos saber, una vez introducida la letra del tipo de carnet de conducir,
		 * se debe imprimir a qué tipo de vehículos corresponde: 
		 * E: remolques.
		 * D: autobuses. 
		 * C1-C5: camiones. 
		 * A: motocicletas. 
		 * B1-B2: automóviles. 
		 * En caso de introducir uno distinto: “Categoría no contemplada”.
		 */
		
		//Variable para el carnet introducido
		String carnet;
		
		//Creamos el escaner
		Scanner sc = new Scanner (System.in);
		
		//Pedimos que introduzca el carnet deseado
		System.out.println("Introduzca su tipo de carnet:");
		carnet = sc.next();
		
		switch (carnet) {
		case "E" -> {
			System.out.println("Usted tiene el carnet de remolques");
		}		
		case "d", "D" -> {
			System.out.println("Usted tiene el carnet de autobuses");
		}
		case "c1", "C1", "c2", "C2", "c3", "C3", "c4", "C4", "c5", "C5" -> {
			System.out.println("Usted tiene el carnet de camiones");
		}
		case "a", "A" -> {
			System.out.println("Usted tiene el carnet de motocicletas");
		}
		case "b1", "B1", "b2", "B2" -> {
			System.out.println("Usted tiene el carnet de motocicletas");
		}
		default -> {
			System.out.println("Categoria no contemplada");
		}
	};
	
	//Cerramos el escaner
	sc.close();
	}

}
