package zohirul_Alom;

import java.util.Scanner;

public class LogicalOperator {
	/*
	 * OPERATOR
	 *  &&,  || , !
	 *  if(condition1 && condition2){
	 *  // code to be executed
	 *  }
	 *  else if(condition1 || condition2){
	 *  // code to be executed..
	 *  }
	 * */

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		int number;
		System.out.println("Enter any number: ");
		number=sc.nextInt();
		
		if(number == 2 || number == 4 || number == 6 || number == 8){
			
			System.out.println("Even Number");
		}
		else{
			
			System.out.println("Odd Number");
		}
		
	}

}
