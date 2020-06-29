package prectice;

import java.util.Scanner;

public class UserInput {
	String title;

	public static void main(String[] args) {
		
		String fullname;
		String address;
		String city;
		String state;
		int zipcode;
		String email;
		
		Scanner sc = new Scanner(System.in);
		UserInput my= new UserInput();
		System.out.println("Enter Your Title");
		my.title=sc.nextLine();
		
		System.out.println("Enter FullName");
		fullname=sc.nextLine();
		
		System.out.println("Enter Address");
		address=sc.nextLine();
		
		System.out.println("Enter City");
		city=sc.nextLine();
		
		System.out.println("Enter State");
		state=sc.nextLine();
		
		System.out.println("Enter Zipcode");
		zipcode=sc.nextInt();
		
		System.out.println("Enter Email");
		email=sc.next();
		
		System.out.println(" \"ENTERED INFORMATION SUCCESSFULLY\" ");

	}

}
