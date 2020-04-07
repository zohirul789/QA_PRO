/**
 * 
 */
package firstjavaclass;

import java.util.Scanner;

/**
 * @author zohir_alom
 *
 */
public class UserInput {

	String name;
	byte age;
	static long cell;
	static boolean info;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//user input using local variable.....
		int id;
		System.out.println("Enter your idnumber:");
		id=scan.nextInt();
		
		//user input using instance variable .....
		UserInput my = new UserInput();
		System.out.println("Enter your name:");
		my.name=scan.next();
		System.out.println("Enter your age:");
		my.age=scan.nextByte();
		
		//user input using static variable......
		System.out.println("Enter your cell phone number");
		UserInput.cell=scan.nextLong();
		System.out.println("my information is");
		UserInput.info=scan.nextBoolean();
		
		
		
		
		
		

	}

}
