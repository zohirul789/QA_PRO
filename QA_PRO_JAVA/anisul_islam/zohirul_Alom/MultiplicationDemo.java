package zohirul_Alom;

import java.util.Scanner;

public class MultiplicationDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m,n;
		System.out.println("enter initial number: ");
		m = sc.nextInt();
		
		System.out.println("enter fainal number: ");
		n = sc.nextInt();
		
		for(int i = m; i<=n; i++){
			System.out.println("\n");
			// nested loops
			for(int j = 1; j <=10; j++){
				System.out.println(i+ " x " +j+ " = "+i * j);
			}
		}
	
	}

}
