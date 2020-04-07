package zohirul_Alom;

import java.util.Scanner;

public class ArithmeticOparetor {
	/*
	 * Assignment operator...
	 * 
	 *  +=
	 *  -=
	 *  *=
	 *  /=
	 *  %=
	 *  
	 *  */

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		
		int dcheck, dcash , total;
		
		System.out.println("Enter dcheck: ");
		dcheck=input.nextInt();
		System.out.println("Dcheck amount: "+dcheck);
		
		System.out.println("Enter Dcach: ");
		dcash=input.nextInt();
		System.out.println("Dcash amount: "+dcash);
		
		total = dcheck + dcash;
		System.out.println("Sum: "+total);
		
		total = dcheck - dcash;
		System.out.println("Sub: "+total);
		
		total = dcheck * dcash;
		System.out.println("Multiplication: "+total);
		
		total = dcheck / dcash;
		System.out.println("Divition: "+total);
		
		total = dcheck % dcash;
		System.out.println("Reminder: "+total);
		
		System.out.println(" \"Well Done\" ");
		
		
		
		
		
		
		
		
		
		

	}

}
