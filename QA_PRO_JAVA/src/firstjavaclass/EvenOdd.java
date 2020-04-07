package firstjavaclass;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int score;
		System.out.println("Enter score: ");
		score=scan.nextInt();
		if(score%2==0){
			System.out.println("Even");
			
		}
		else{
			System.out.println("Odd");
		}

	}

}
