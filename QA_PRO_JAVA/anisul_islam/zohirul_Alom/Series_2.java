package zohirul_Alom;

import java.util.Scanner;

public class Series_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, result=1;
		System.out.print("Enter any number: ");
		n = sc.nextInt();
		
		for(int i =1; i<=10; i=i+2){
			System.out.println(i+"x"+i+"");
			result =result*i *i;
			
		}
		System.out.println();
		System.out.println(result);

	}

}
