package prectice;

import java.util.Scanner;

public class Array_using_ForlOOP {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int [] adition = new int[5];
		int sum = 0;
		
		System.out.println("Enter Any Five Number: ");
		
		for(int i = 0; i <adition.length; i++){
			
			adition[i] = input.nextInt();
			
		}
		for(int i = 0; i < adition.length; i++){
			
			sum = sum +adition.length;
		}
		
		System.out.println("SUM = "+sum);
		

	}

}
