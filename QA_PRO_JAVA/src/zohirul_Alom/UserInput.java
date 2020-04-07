package zohirul_Alom;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		
		String name;
		String city;
		String state;
		int zipcode;
		
		System.out.println("Enter name: ");
		name=Input.nextLine();
		System.out.println("My name is: "+name);
		
		System.out.println("Enter city: ");
		city = Input.nextLine();
		System.out.println("City: "+city);
		
		System.out.println("Enter state: ");
		state =Input.nextLine();
		System.out.println("State: "+state);
		
		System.out.println("Enter zipcode: ");
		zipcode =Input.nextInt();
		System.out.println("Zip code: "+ zipcode);
		
		System.out.println(" \"THIS IS MY SELF INTRODUCTION\" ");
		
		
		

	}

}
