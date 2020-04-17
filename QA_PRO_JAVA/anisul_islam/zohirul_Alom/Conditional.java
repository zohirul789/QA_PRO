package zohirul_Alom;

import java.util.Scanner;

public class Conditional {
	/*
	 * Symbol
	 * 
	 *  (VAR > VAR ) ? VAR  : VAR;
	 *  
	 *  */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number1, number2, large;
		System.out.print("Enter age1 & age2: ");
		number1= input.nextInt();
		number2= input.nextInt();
		
		large = (number1>number2 ? number1 : number2);
		
		System.out.print("Large Number:"+large);
		
		
		

	}


}
