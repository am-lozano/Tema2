package english;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		int jumpUp;
		int jumpDown;
		
		int contUp = 0;
		int contDown = 0;

		// create the scanner
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("Up");
			jumpUp = sc.nextInt();
			
			contUp += jumpUp;
					
			System.out.println("Down");
			jumpDown = sc.nextInt();
			
			contDown += jumpDown;
			
			
		} while (jumpUp > 0 && jumpDown > 0);
		
		System.out.print(contUp + " " + contDown);
		
		sc.close();
		

	}

}
