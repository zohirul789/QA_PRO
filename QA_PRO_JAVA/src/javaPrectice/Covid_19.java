package javaPrectice;

import java.util.Scanner;

public class Covid_19 {
	
	String country;
	String state;
	int confirmcase;
	int death;
	static int recover;
	static String reccomandation;

	public static void main(String[] args) {
		
		Scanner covid = new Scanner(System.in);
		
		
		int position=1;
		System.out.println("Enter position: ");
		position=covid.nextInt();
		
		
		//INSTANCE...
		Covid_19 virus = new Covid_19();
		System.out.println("Enter country Name: ");
		virus.country=covid.nextLine();
		System.out.println("Enter State Name: ");
		virus.state=covid.nextLine();
		System.out.println("Enter Efected Number: ");
		virus.confirmcase=covid.nextInt();
		System.out.println("Enter total Death: ");
		virus.death=covid.nextInt();
		
		
		// STATIC 
		System.out.println("Enter number of Recovered: ");
		Covid_19.recover=covid.nextInt();
		System.out.println("Messege for People: ");
		Covid_19.reccomandation=covid.next();
		
		System.out.println("STAY HOME SAVE THOUSAND OF AMERICANS LIFES!");
		
		

	}

}
