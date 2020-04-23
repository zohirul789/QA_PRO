package zohirul_Alom;

import java.util.Scanner;

public class Array_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double [] number = new double[5];
		double sum = 0;
		System.out.print("please enter five number: ");
		
		for(int i = 0;i<number.length;i++){
		    
			number[0]=sc.nextDouble();
		}
		for(int i = 0; i < number.length;  i++){
			
			sum = sum + number[i];
			
		}
		
		System.out.println("The sum is : "+sum);
		
		double ave = sum/number.length;
		System.out.println("average is = "+ave);

	}

}
