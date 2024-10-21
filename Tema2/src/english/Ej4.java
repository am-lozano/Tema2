package english;

import java.util.Random;
import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {

		// dar pistas

		// variable to store the number
		int num;

		// generate a random number
		Random rand = new Random();
		int random = rand.nextInt(1, 101);

		// i create a scanner
		Scanner sc = new Scanner(System.in);

		// ask a number
		System.out.println("Introduce a number, if you want to give up type -1");
		num = sc.nextInt();
		

			while (num != -1 && num != random) {

				if (random > num) {
					System.out.println("Try with a higher number");
				}

				if (random < num) {
					System.out.println("Try with a lower number");
				}
			}

			System.out.println("Congratulation");
			
			sc.close();
		}
		
}
