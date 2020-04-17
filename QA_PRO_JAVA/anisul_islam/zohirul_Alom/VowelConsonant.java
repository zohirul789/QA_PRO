package zohirul_Alom;

import java.util.Scanner;

public class VowelConsonant {
	
	// Vowel/Consonant Function......

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		char cha;
		System.out.println("Enter Any Character: ");
		cha=sc.next().charAt(0);
		
		if(cha=='a'){
			System.out.println("Vowel");
		}
		else if(cha=='c'){
			System.out.println("Vowel");
		}
		else{
			System.out.println("Consonant");
		}

	}

}
