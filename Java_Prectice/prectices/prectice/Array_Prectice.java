package prectice;

import java.util.Scanner;

public class Array_Prectice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double [] number = new double [5];
		double sum = 0;
		
		System.out.println("Enter any five number : ");
		
		number[0]=sc.nextDouble();
		number[1]=sc.nextDouble();
		number[2]=sc.nextDouble();
		number[3]=sc.nextDouble();
		number[4]=sc.nextDouble();
		
		sum = number[0]+number[1]+number[2]+number[3]+number[4];
		
		System.out.println("SUM = "+sum);
		
		

	}

}
