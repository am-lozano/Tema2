package english;

import java.util.Scanner;

public class e1 {

	public static void main(String[] args) {

		int hour;

		int min;

		Scanner sc = new Scanner(System.in);

		System.out.println("Give me an hour:");
		hour = sc.nextInt();

		System.out.println("Give me a minute:");
		min = sc.nextInt();
		if (hour <= 0 || hour >= 12) {
			System.out.println("\nValores inválidos");
		} else {

			if (hour == 6 || hour == 12) {
			} else {
				switch (hour) {
				case 1:
					hour = 11;
					break;
				case 2:
					hour = 10;
					break;
				case 3:
					hour = 9;
					break;
				case 4:
					hour = 8;
					break;
				case 5:
					hour = 7;
					break;
				case 7:
					hour = 5;
					break;
				case 8:
					hour = 4;
					break;
				case 9:
					hour = 3;
					break;
				case 10:
					hour = 2;
					break;
				case 11:
					hour = 1;
					break;
				}

			}

			if (min == 0 || min == 30) {
			} else {
				min = 60 - min;
			}
			System.out.println("\nHora: " + hour + ":" + min);
		}

	}

}
