package zohirul_Alom;

import java.util.Scanner;

public class ControlStatementSelection {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int grade;
		System.out.println("Enter Grade: ");
		grade=sc.nextInt();
		
		if(grade>90){
			System.out.println("Grade: A ");
		}
		else if(grade>85){
			System.out.println("Grade: B ");
		}
		else if(grade>75){
			System.out.println("Grade: C");
			
		}
		else{
			System.out.println("Grade: D");
		}

	}

}
