package zohirul_Alom;

import java.util.Scanner;

public class Series_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n, sum=0;
		System.out.print("Enter any number: ");
		n = sc.nextInt();
		
		for(int i = 1; i <=n; i= i+2){
			System.out.println(i+ "");
			sum = sum +i;
			
		}
		System.out.println();
		System.out.println(sum);

	}

}
