package english;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		
		// variable to store the number
		int num;
		
		// variable to product
		int product = 0;
		
		// i create the scanner
		Scanner sc = new Scanner (System.in);
		
		// i ask the number
		System.out.println("Introduce a number:");
		num = sc.nextInt();
		
		while (product>=0 && product<10) {
			
			//add 1 to product
			product++;
			
			System.out.println(product * num);
		}
	
		//i close the scanner
		sc.close();
		
	}

}
