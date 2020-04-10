package zohirul_Alom;

import java.util.Scanner;

public class Conditional {
	/*
	 * Symbol
	 *  ?   : 
	 *  */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int age1, age2, older;
		System.out.print("Enter age1 & age2: ");
		age1= input.nextInt();
		age2= input.nextInt();
		
		older = (age1>age2) ? age1 : age2;
		
		System.out.println(older);
		
		

	}


}
