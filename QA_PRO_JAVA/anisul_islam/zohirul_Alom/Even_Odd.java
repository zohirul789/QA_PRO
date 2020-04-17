package zohirul_Alom;

import java.util.Scanner;

public class Even_Odd {
	
	// Even/Odd function...

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A;
		System.out.println("Enter Any Positive Number:");
		A = sc.nextInt();
		
		if(A%2==0){
			System.out.println("Even");
			
		}else{
			System.out.println("Odd");
		}

	}

}
