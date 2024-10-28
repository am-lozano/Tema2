package english;

import java.util.Scanner;

public class e1 {

	public static void main(String[] args) {
		
		int hour;
		
		int min;
		
		Scanner sc = new Scanner              (System.in);
		
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
				hour = 11;
				break;
			case 3:
				hour = 11;
				break;
			case 4:
				hour = 11;
				break;
			case 5:
				hour = 11;
				break;
			case 6:
				hour = 11;
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
