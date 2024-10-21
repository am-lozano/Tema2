package english;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {

		// introducir alturas y mostrar la mas alta y minima
		// 0 = acaba programa

		// variable to store the height
		double height;

		// variable to store the maximum height
		// tambien se puede poner Double.MIN_VALUE, para que cualquier valor introducido sea mayor
		double maxHeight = 0;

		// variable to store the minimum height
		// tambien se puede poner Double.MAX_VALUE, para que cualquier valor introducido sea menor
		double minHeight = 0;

		// i create the scanner
		Scanner sc = new Scanner(System.in);

		// ask the height
		System.out.println("Introduce the height, to finish the programme introduce a 0:");
		height = sc.nextDouble();

		if (height > 0) {

			while (height != 0) {

				maxHeight = height;
				minHeight = height;

				if (height > maxHeight) {
					maxHeight = height;
				}
				if (height < minHeight) {
					minHeight = height;
				}

				System.out.println("Introduce the height, to finish the programme introduce a 0:");
				height = sc.nextDouble();

			}

			System.out.println("The highest height is: " + maxHeight);
			System.out.println("The lowest height is: " + minHeight);
		} else {
			System.err.println("Wrong height");
		}

		// close the scanner
		sc.close();
	}
}
